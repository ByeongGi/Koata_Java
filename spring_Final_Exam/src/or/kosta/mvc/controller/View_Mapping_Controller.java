package or.kosta.mvc.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class View_Mapping_Controller {
	
	@RequestMapping(value="/login")
	public String login(Principal principal){
		if (principal !=null) {
			System.out.println(principal.getName());
		}
		
		
		return "login";
	}
	
	@RequestMapping(value="/denied")
	public String denied(){
		return "/denied";
	}
	
	@RequestMapping(value="/logout")
	public String logout(){
		return "logout-success";
	}
	@RequestMapping(value="/admin")
	public String admin(){
		return "admin";
	}
	@RequestMapping(value="/user")
	public String user(){
		return "user";
	}
	
	
}
