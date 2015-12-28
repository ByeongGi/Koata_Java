package or.kosta.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {
	
	
	@RequestMapping(value={"/","/home"})
	public String home(Map<String,Object> model){
		model.put("msg", "안녕하세요!");
		return "home";
	}
}
