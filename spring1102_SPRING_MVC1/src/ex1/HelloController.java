package ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// DispatherServlet에게 Controller란것을 지정해야함(모델의 역할)
// 사용자의 URL로 hello.kosta-servlet.xml에서 해당빈을 찾는데 
// 이때 HandlerMapping으로 해당 요청과 전송방식으로 선언된 Controller를 찾고
// 해당 메서드를 호출한다.
// 호출된 메서드를 View의 이름과 RequestScope에 저장된 키 값을 ModelAndView 객체로 
// 다시 DispatcherServlet에게 반환한다.
@Controller
public class HelloController {
	
	// HandlerMapping 정의 -> vlaue ="URL" , 전송 방식 분석
	@RequestMapping(value="/hello.kosta",method=RequestMethod.GET)
	public ModelAndView Hello(){
		System.out.println("비지니스 로직이 수행이 됨");
		// ModelAndView를 생성하여  viewName을 지정하고 , requestScope에 값을 Map 으로 저장
		ModelAndView mav= new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("msg","Hi ^^~~~~~");
		return mav;
	}
	
	
	
}
