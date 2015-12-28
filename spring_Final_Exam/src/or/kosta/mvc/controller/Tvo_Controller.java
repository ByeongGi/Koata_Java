package or.kosta.mvc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import or.kosta.mvc.dao.T_dao_Inter;
import or.kosta.mvc.vo.PagingUtill;
import or.kosta.mvc.vo.TestVo;

@Controller
public class Tvo_Controller {
	
	@Autowired
	private T_dao_Inter dao;
	
	@RequestMapping(value="/tvo/{serviceName}",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView commend_handler(
			@PathVariable("serviceName") String serviceName,
			TestVo vo, HttpServletRequest request,
			@RequestParam(value="num",required=false) Integer num,
			@RequestParam(value="currentpage",required=false) Integer currentpage)
	{	
		System.out.println("LOG ::: SeviceName : "+serviceName );
		ModelAndView mv =null;
		if("insert".equals(serviceName)){
			mv=insert(vo,request);
		}else if("list".equals(serviceName)){
			mv=list(currentpage);
		}else if("detail".equals(serviceName)){
			mv=detail(num);
		}else if("form".equals(serviceName)) {
			mv=viewMapper(serviceName);
		}
		
		return mv;
	}
	
	
	
	public ModelAndView insert(TestVo vo, HttpServletRequest request)
	{	
		
		// 이미지가 저장될 절대 경로 얻기
		HttpSession session = request.getSession();
		String r_path = session.getServletContext().getRealPath("/");
		System.out.println(r_path);

		// 시스템에 맞는 DocumentRoot(최상위경로) 안에 img 경로 맞추기
		String img_path = "\\img\\";
		System.out.println(img_path);

		// 최상위 경로와 조합
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path);

		// upload된 파일 이름
		String oriFn = vo.getMfile1().getOriginalFilename();
		path.append(oriFn);
		System.out.println("PATH : " + path);

		// 파일 업로드 구현
		File f = new File(path.toString());
		try {
			vo.getMfile1().transferTo(f);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}

		vo.setMfile(oriFn); // 이미지 명을 찾아내서 vo 저장하고 난후
		// Dao 로 넘긴다.
		
		System.out.println("LOG ::: INSERT START");
		int res = dao.insert(vo);
		
		System.out.println("LOG ::: INSERT END"+res);
		return new ModelAndView("redirect:/tvo/list");
	}
	
	public ModelAndView list(Integer currentpage)
	{
		ModelAndView mv=new ModelAndView("tvo_list");
		System.out.println("LOG ::: LIST START");
		// 게시글의 총 갯수
		if (currentpage == null) currentpage = 1;
		int totalCnt=dao.select_Total_Cnt();
		PagingUtill paging = new PagingUtill(totalCnt, 10 , 5, currentpage);
		
		List<TestVo> list = dao.list(paging.page_dataMap());
		mv.addObject("list",list);
		mv.addObject("pagingData",paging.page_dataMap());
		mv.addObject("currentpage",currentpage);
		System.out.println("LOG ::: LIST END");
		return mv;
	}
	
	public ModelAndView detail(int num)
	{
		ModelAndView mv=new ModelAndView("tvo_detail");
		
		System.out.println("LOG ::: DETAIL START"+num);
		TestVo vo = dao.selectOne(num);
		mv.addObject("vo",vo);
		System.out.println("LOG ::: DETAIL END");
		return mv;
	}
	
	public ModelAndView viewMapper(String serviceName){
		StringBuffer viewName = new StringBuffer();
		viewName.append("tvo_"+ serviceName);
		return new ModelAndView(viewName.toString());
	}
	
	
	private static final int BUFFER_SIZE = 4096;
	// 다운로드 요청에 대한 HadlerMapping
	// 이미 업로드 된 경로에서 파일 다운로드를 할것이기 때문에 
	// 리스트나 뷰에서 해당 파일의 이름을 받아와야한다.
	// fileDown.kosta?fileName=파일이름
	// -> RequestParam("fileName") String fileName
	// ServletContext 와 파일의 절대 경로를 얻어내기 위해서 
	// -> HttpSession session, HttpServletRequset requsst
	// 다운로드 브라우져와 Stream 으로 연결되어서 통신 되어야 하기 때문에
	// -> HttpServletResponse response
	
	@RequestMapping(value="/fileDown")
	public void fileDown(
			@RequestParam("fileName") String fileName,
			HttpSession session, HttpServletRequest request,
			HttpServletResponse response) throws IOException
	{
		// aplicationContext 객체를 reqeust로부터 얻어냄
		ServletContext context = request.getServletContext();
		// 업로드된  경로 얻음
		String path = session.getServletContext()
				.getRealPath("/img/")+fileName;
		// 그 경로로 파일 객체를 생성
		File downloadFile = new File(path);
		// FileInputStream 스트림으로 일어옴
		FileInputStream fi = new FileInputStream(downloadFile);
		// 요청객체로부터 연결될 브라우져읜 마이타임을 얻어옴
		String mineType = context.getMimeType(path);
		// 만약에 마임 타입 값이 없으면 그냥 디폴트로 스트림으로 연결
		if (mineType == null) {
			mineType = "application/octet-stream";
		}
		
		// 지정된 마임 타입 설정
		response.setContentType(mineType);
		// 다운로드될 파일의 길이  설정
		response.setContentLengthLong((int) downloadFile.length());
		// 다운로드 type를 설정함
		String headerkey ="Content-Disposition";
		String headerValue =String.format("attachment; filename\"%s\"",
				downloadFile.getName());
		//위에 다운로드 타입의 정보를 헤더로 설정 
		response.setHeader(headerkey, headerValue);
		// 브라우져에부터 스트림을 연결
		OutputStream outStrem = response.getOutputStream();  
		// 버퍼를 끼워서 빠르게 전달
		byte[] buffer = new byte[BUFFER_SIZE];
		int byteRead = -1;
		while ((byteRead = fi.read(buffer)) != -1) {
			outStrem.write(buffer,0,byteRead);
			
		}
		fi.close();
		outStrem.close();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
