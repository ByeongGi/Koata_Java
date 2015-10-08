package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ActionFoword;

public class AjaxService1 implements Service {

	@Override
	public ActionFoword execute(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		request.setCharacterEncoding("UTF-8");
		String subject = request.getParameter("subject");
		String msg = null;
		if (subject.equals("java")) {
			msg = "SCJP,SCJD";
		} else if(subject.toUpperCase().equals("C")){
			msg = "정보처리";
		} else if(subject.equals("oracle")){
			msg = "OCP";
		} else {
			msg = "준비중입니다!";
		}
		request.setAttribute("msg", msg);
		return new ActionFoword("ajaxres.jsp", false);
	}

}
