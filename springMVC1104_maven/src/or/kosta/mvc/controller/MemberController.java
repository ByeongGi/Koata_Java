package or.kosta.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import or.kosta.mvc.dao.MemberDao_inter;
import or.kosta.mvc.utill.PagingUtill;
import or.kosta.mvc.vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDao_inter memberdao;
	
	
	@RequestMapping(value="/memForm.kosta")
	public String index(){
		return "memForm";
	}
	
	
	@RequestMapping(value="/idchk.kosta",method=RequestMethod.POST)
	public void idChk(String id,HttpServletResponse res){
		System.out.println("LOG ::: id : "+id);
		PrintWriter out = null;
		try {
			out=res.getWriter();
			int result=memberdao.idChk(id);
			String msg= "";
			if (result > 0) {
				msg="이미 존재하는 아이디 입니다.";
			} else{
				msg="사용해도 되는 아이디 입니다.";
			}
			out.println("LOG id::: 입력한 아이디 서버 메시지 확인"+msg);
		} catch (IOException e) {
			e.printStackTrace();
			out.flush();
			out.close();
		}
		
	
	}
	
	
	@RequestMapping(value="/member_insert.kosta",method=RequestMethod.POST)
	public String member_Insert(MemberVo vo){
		System.out.println("LOG ::: INSERT CONTROLLER");
		int res =memberdao.insert(vo);
		System.out.println("LOG ::: INSERT :::::"+res);
		return "redirect:/memList.kosta";
	}
	
	
	@RequestMapping(value="/memList.kosta",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView member_List(ModelAndView mv, Integer currentpage){
		mv.setViewName("memList");
		System.out.println("LOG ::: INSERT CONTROLLER"+currentpage);
		
		int totalCnt=memberdao.totalCnt();
		if (currentpage == null){
			currentpage = 1;
		}
		
		PagingUtill paging = new PagingUtill(totalCnt, 10, 5, currentpage);
		List<MemberVo> list = memberdao.paging_list(paging.page_dataMap());
		
		mv.addObject("list",list);
		mv.addObject("pagingData", paging.page_dataMap());
		
		System.out.println("LOG ::: INSERT :::::");
		return mv;
	}
}
