package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Mdao;
import model.ActionFoword;

public class FindIDService implements Service {

	@Override
	public ActionFoword execute(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		System.out.println("LOG - 파라미터 확인 "+ id);
		Mdao dao = new Mdao();
		int res=dao.findId(id);
		System.out.println("LOG - 결과 확인" +res);
		request.setAttribute("res", res);
		return new ActionFoword("data.jsp", false);
	}

}
