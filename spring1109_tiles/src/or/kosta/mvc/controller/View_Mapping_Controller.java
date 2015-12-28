package or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class View_Mapping_Controller {
	
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/denied")
	public String denied(){
		return "/denied";
	}
	
	@RequestMapping(value="/logout")
	public String logout(){
		return "logout";
	}
	
	
}
