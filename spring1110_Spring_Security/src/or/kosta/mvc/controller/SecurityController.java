package or.kosta.mvc.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	
	
	@RequestMapping(value="/home")
	public String home(Model model){
		model.addAttribute("msg", "Hello! SPRING SECURITY~~~!");
		return "home";
	}
	
	// Admin 계정이 사용할수 있는 화면으로 분기
	@RequestMapping(value="/emp/get/{id}")
	public String getEmp(Model model , 
			@PathVariable("id") String id){
		System.out.println("ID :" + id);
		model.addAttribute("id", id);
		return "emp";
	}
	
	@RequestMapping(value="login")
	public String login(HttpServletRequest request,Model model){
		return "login";
	}
	@RequestMapping(value="logout")
	public String logout(){
		return "logout";
	}
	@RequestMapping(value="denied")
	public String login(){
		return "denied";
	}
	
	
	@RequestMapping(value="myform")
	public String myform(Principal principal){
		if (principal !=null) {
			System.out.println("Pricipal :" + principal.getName());
		}
		return "myform";
	}
}
