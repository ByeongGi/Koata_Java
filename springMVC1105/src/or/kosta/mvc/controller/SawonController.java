package or.kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import or.kosta.mvc.dao.Inter_Sawon_Dao;
import or.kosta.mvc.vo.SawonPayVo;

@Controller
public class SawonController {
	
	@Autowired
	private Inter_Sawon_Dao dao;
	
	@RequestMapping(value={"/form","/payform"})
	public String payform(){
		return "payform";
	}

	@RequestMapping(value="/payin",method=RequestMethod.POST)
	public ModelAndView addPay(SawonPayVo vo)
	{
		System.out.println("LOG INSERT ::::");
		dao.insert(vo);		
		return new ModelAndView("redirect:/paylist");
	}
	@RequestMapping(value="/paylist",method=RequestMethod.GET)
	public ModelAndView ListPay()
	{
		ModelAndView mv= new ModelAndView("paylist");
		List<SawonPayVo> list =dao.selectList();
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping(value="/downLoadExcel")
	public ModelAndView downLoadExcel(){
		List<SawonPayVo> list =dao.selectList();
		// 뷰이름 , 모델 이름 , 모델값 주소 
		return new ModelAndView("excelView","listBooks",list);
		
	}
	
	
	
	
}
