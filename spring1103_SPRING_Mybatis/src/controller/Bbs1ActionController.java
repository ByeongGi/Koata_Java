package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.Bbs1Dao;
import vo.Bbs1CommVo;
import vo.Bbs1Vo;

@Controller
public class Bbs1ActionController {
	
	@Autowired
	private Bbs1Dao dao;
	
	@RequestMapping(value="/bbs1Form.kosta")
	public String bbs1FormView()
	{
		// 리스트로 이동할때는 redirect로 이동
		return "bbs1Form";
	}
	
	@RequestMapping(value="/bbs1In.kosta",method=RequestMethod.POST)
	public ModelAndView insert(Bbs1Vo vo)
	{
		dao.insertBbs1(vo);
		// 리스트로 이동할때는 redirect로 이동
		return new ModelAndView("redirect:/bbs1List.kosta");
	}
	
	
	
	@RequestMapping(value="/bbs1List.kosta",method=RequestMethod.GET)
	public ModelAndView list()
	{
		List<Bbs1Vo> list = dao.getList();
		ModelAndView mav = new ModelAndView("bbs1List");
		mav.addObject("list", list);
		return mav;
	}
	
	
	
	
	@RequestMapping(value="/bbs1Detail.kosta",method=RequestMethod.GET)
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
	
	
	
	@RequestMapping(value="/bbs1Comm.kosta",method=RequestMethod.POST)
	public ModelAndView insertComment(Bbs1CommVo vo)
	{	
		System.out.println("LOG COMM INSERT");
		dao.insertComm(vo);
		// Detail로 이동시 get 방식으로 실제 detail의 식별자인
		// Kcode 값으로 지정한다
		StringBuffer redirect = new StringBuffer();
		redirect.append("redirect:/bbs1Detail.kosta?num=")
				.append(vo.getKcode());
		return new ModelAndView(redirect.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
