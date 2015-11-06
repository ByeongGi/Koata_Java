package ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodayController {
	@RequestMapping(value="today.kosta",method=RequestMethod.GET)
	public ModelAndView todate(){
		System.out.println("비지니스 로직이 수행이 됨");
		// ModelAndView를 생성하여  viewName을 지정하고 , requestScope에 값을 Map 으로 저장
		ModelAndView mav= new ModelAndView();
		mav.setViewName("today");
		return mav;
	}
}
