package or.kosta.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import or.kosta.mvc.vo.LoginVo;

@Controller
public class PathValueTestController {
		
	@Autowired
	private LoginVo user;
	
	// Validation 설정을 가진 CommnadObject를 모델로 전달한다.
	@RequestMapping("/login")
	public String loginForm(Map<String, Object> model){
		model.put("userForm", user); // RequestScope 
		return "loginForm" ; 
	}
	
	// 폼에서 전송될때 @Valid LoginVo에서 setter를 통해서 
	// 주입하기 전에 유효성 검사를 시작하고 , 그결과를 
	// BindingResult (Vaild와 Binding 되어 있는 객체 )로 전달한다.
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginProcess(
			@Valid @ModelAttribute("userForm") LoginVo userForm,
			BindingResult result,
			Map<String,Object> model, HttpServletRequest request){
			if (result.hasErrors()) { // 에러가 발생하면 에러 메시지를 전달 
				return "loginForm";
			}
			
		HttpSession session=request.getSession();	
		session.setAttribute("id", userForm.getEmail());
		return "loginSuccess";
	}
	
	
	
	
	
	
	@RequestMapping(value="/pathv/{id}")
	public ModelAndView pathValue(@PathVariable("id") String idv){
		System.out.println("PathVal :"+idv);
		ModelAndView mav=  new ModelAndView("pathview");
		// Dao 랑 연결해서  사용자의 기본정보를 받아 온다면
		String typev = "";
		if (idv.equals("wwww3426")) {
			typev="A";
		} else {
			typev="B";
		}
				
		mav.addObject("id", idv);
		mav.addObject("typev", typev);
		return mav;
	}
	
	
	
	
	@RequestMapping("/menu/{id}")
	public ModelAndView viewMeun(
			@PathVariable(value="id") String id
			){
			String typev = "";
			if (id.equals("wwww3426")) {
				typev="A";
			} else {
				typev="B";
			}
		
		return  new ModelAndView("menu" ,"type",typev);
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
