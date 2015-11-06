package ex2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vo.TestVo;

@Controller
public class SaveController {
	
	// 파라미터를 스프링에서 처리를 한다.=? @RequestMapping이 될때 
	// 전달 받은  파라미터 처리에서 Get일 때 @RequestParam을 사용할때 필수 파라미터나, 기본값등을
	// 설정 할 수 있다.
	@RequestMapping(value="/save.kosta",method=RequestMethod.POST)
	public ModelAndView save(String sub,String writer,String content,String pwd){
		System.out.println("sub :"+sub);
		System.out.println("writer :"+writer);
		System.out.println("content :"+content);
		System.out.println("pwd :"+pwd);
		ModelAndView mav = new ModelAndView("success");
	    mav.addObject("sub",sub);
		return mav;
	}
	
	@RequestMapping(value="/save2.kosta",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("vo") TestVo vo){
		System.out.println("sub :"+vo.getSub());
		System.out.println("writer :"+vo.getWriter());
		System.out.println("content :"+vo.getContent());
		System.out.println("pwd :"+vo.getPwd());
		ModelAndView mav = new ModelAndView("success2");
		// mav.addObject("vo",vo); 
		// 파라미터로 받은 값을 바로 전달 할때=> @ModelAttribute("vo")로 대체 가능
		return mav;
	}
}
