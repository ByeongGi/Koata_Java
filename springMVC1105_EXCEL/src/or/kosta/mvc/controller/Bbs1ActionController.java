package or.kosta.mvc.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import or.kosta.mvc.dao.Bbs1Dao;
import or.kosta.mvc.util.PagingUtill;
import or.kosta.mvc.vo.Bbs1CommVo;
import or.kosta.mvc.vo.Bbs1Vo;
import or.kosta.mvc.vo.SearchOptionVo;

@Controller
public class Bbs1ActionController {
	
	// Bean 페이징 객체를 DI 받는다. spring 설정 파일 참고 ! 
	@Autowired
	private PagingUtill bbs1Paging;
	@Autowired
	private PagingUtill Searchbbs1Paging;
	
	@Autowired
	private Bbs1Dao dao;
	
	
	// Form으로 단순하게 이동함
	@RequestMapping(value="/bbs1Form")
	public String bbs1FormView()
	{
		// 리스트로 이동할때는 redirect로 이동
		return "bbs1Form";
	}
	
	// 게시판 INSERT 구현 
	@RequestMapping(value="/bbs1In",method=RequestMethod.POST)
	public ModelAndView insert(Bbs1Vo vo,HttpServletRequest request)
	{
		vo.setReip(request.getRemoteAddr());
		dao.insertBbs1(vo);
		// 리스트로 이동할때는 redirect로 이동
		return new ModelAndView("redirect:/bbs1List");
	}
	
	
	
	//  게시판 리스트 출력하는 메소드
	@RequestMapping(value="/bbs1List",method=RequestMethod.GET)
	public ModelAndView list(
			// currentpage 현재 페이지를 파라미터로 받음 : 객체형으로 받아야 함
			@RequestParam(value="currentpage",required=false) Integer currentpage)
	{	
		
		if (currentpage == null) currentpage=1;
		
		// 현재 게시판 게시글의 모든 자료의 ROW의 갯수를 반환
		int totalCnt =dao.Cnt();
		bbs1Paging.setTotal_record(totalCnt); // 게시글 총 ROW 
		bbs1Paging.setPageno(currentpage);    // 현재 페이지 번호 
		
		// 현재 페이지 정보를 가지고 페이징 데이터를 HashMap으로 Mabatis에 전달 
		List<Bbs1Vo> list = dao.getList( bbs1Paging.page_dataMap());
		
		// 페이지는 bbs1List 로 간후에 
		ModelAndView mav = new ModelAndView("bbs1List");
		
		// ModelAndView 통해서 RequsetScope 영역에 저장 
		mav.addObject("list", list); // 게시글 LIST DATA
		mav.addObject("currentpage", currentpage); // 현재 페이지 정보 
		mav.addObject("pagingData",bbs1Paging.page_dataMap()); // 페이징에 필요한 DATA
		return mav;
	}
	
	@RequestMapping(value="/search_bbs1List",method=RequestMethod.GET)
	public ModelAndView searchList(
			// currentpage 현재 페이지를 파라미터로 받음 : 객체형으로 받아야 함
			@RequestParam(value="currentpage",required=false) Integer currentpage,
			// 검색 정보를 VO 로 받아서 처리
			SearchOptionVo vo)
	{	
		
		if (currentpage == null) currentpage=1;
		
		// 검색시 모든 검색 타입 , 검색의 키워드 , 정렬 타입 (오름차순, 내림차순)
		if (vo.getSearchType() == 0 && vo.getOrderType() == 0 && vo.getSearchValue() == null ){
			return new ModelAndView("redirect:/bbs1List");
		}
		
		
		// 검색 관련 정보를 HashMap 형태로 전달하여 검색 쿼리시 필요한 파라미터 Mybatis에 전달
		HashMap<String, Object> data = vo.getData();
		int totalCnt =dao.searchCnt(data); // 검색된 게시물 ROW 개수를 반환!
		Searchbbs1Paging.setTotal_record(totalCnt); // 페이징에 필요한 설정 : 총 게시물 ROW 갯수
		Searchbbs1Paging.setPageno(currentpage); // 현재 페이지 
		
		// 페이징 Bean으로 주입 받은 객체에 기존 SearchVo의 데이터를 받아서 
		// 같은 Hashmap 데이터로 합침
		HashMap<String, Object> paging  = Searchbbs1Paging.page_dataMap();
		paging.putAll(vo.getData()); // 같은 Hashmap 자료를 병합 
		// 검색에 필요한 모든 데이터를 HashMap으로 전송
		List<Bbs1Vo> list = dao.getSearchList(paging);
		
		// 검색 후 반환된 게시물 정보를 보여줄 전송할 화면 지정
		ModelAndView mav = new ModelAndView("search_bbs1List");		
		mav.addObject("list", list); // 검색된 게시글 ROW 
		mav.addObject("pagingData",Searchbbs1Paging.page_dataMap()); // 화면에 페이징에 필요한 데이터
		mav.addObject("searchData",vo); // 검색 정보를 담은 vo 를 다시 화면에 전송
		mav.addObject("currentpage", currentpage); // 현재 페이지 정보
		return mav;
	}
	
	
	// 엑셀 다운로드
	@RequestMapping(value="/downLoad_Excel",method=RequestMethod.GET)
	public ModelAndView downLoad_Excel(
			SearchOptionVo vo
			)
	{	
		// 검색시 모든 검색 타입 , 검색의 키워드 , 정렬 타입 (오름차순, 내림차순)
		if (vo.getSearchType() == 0 && vo.getOrderType() == 0 && vo.getSearchValue() == null ){
			return new ModelAndView("redirect:/bbs1List");
		}
		List<Bbs1Vo> list = dao.searchDown(vo.getData());
		// 뷰이름 , 모델 이름 , 모델값 주소 
		return new ModelAndView("excelView","listBooks",list);
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value="/bbs1Detail",method=RequestMethod.GET)
	public ModelAndView detail(int num)
	{
		Bbs1Vo vo = dao.getDetail(num);
		// 댓글을 위한 리스트 출력 작업 
	    List<Bbs1CommVo> cList = dao.getCommList(num);
	    ModelAndView mav = new ModelAndView("bbs1Detail");
		mav.addObject("cList", cList);
		mav.addObject("vo", vo);
		return mav;
	}
	
	
	
	@RequestMapping(value="/bbs1Comm",method=RequestMethod.POST)
	public ModelAndView insertComment(Bbs1CommVo vo)
	{	
		System.out.println("LOG COMM INSERT");
		dao.insertComm(vo);
		// Detail로 이동시 get 방식으로 실제 detail의 식별자인
		// Kcode 값으로 지정한다
		StringBuffer redirect = new StringBuffer();
		redirect.append("redirect:/bbs1Detail?num=")
				.append(vo.getKcode());
		return new ModelAndView(redirect.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
