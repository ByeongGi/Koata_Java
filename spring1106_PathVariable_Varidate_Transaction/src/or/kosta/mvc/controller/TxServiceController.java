package or.kosta.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import or.kosta.mvc.service.ServiceInter;
import or.kosta.mvc.vo.CustomerVo;
import or.kosta.mvc.vo.MemberVo;

@Controller
public class TxServiceController {
	
	@Autowired
	private ServiceInter serviceImple;
	
	@RequestMapping(value="/testTx",method=RequestMethod.POST)
	public ModelAndView AddAll(CustomerVo cvo,MemberVo mvo) throws Exception{
		ModelAndView mav = new ModelAndView("res");
		serviceImple.addAll(cvo, mvo);
		mav.addObject("msg", "성공");
		return mav;
	}
	
	@RequestMapping(value="/testTxForm")
	public String Txmenu(){
		return "txform";
	}
}
