package or.kosta.mvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TurnJsDataController {
	@RequestMapping(value="/turntest")
	public ModelAndView turnjs(){
		ModelAndView mav = new ModelAndView("turnjsTEST");
		ArrayList<String> ar = new ArrayList<>();
		ar.add("test");
		ar.add("kims");
		ar.add("Kosata");
		ar.add("ok");
		ar.add("kimByeongGi");
		ar.add("test");
		mav.addObject("list",ar);
		return mav;
	}
}
