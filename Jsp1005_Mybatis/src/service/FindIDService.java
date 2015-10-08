package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemDao;
import model.ActionFoword;

public class FindIDService implements Service {

	@Override
	public ActionFoword execute(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		System.out.println("LOG - 파라미터 확인 "+ id);
		
		int res =MemDao.getDao().idchk(id);
		System.out.println("LOG - 결과 확인" +res);
		request.setAttribute("res", res);
		return new ActionFoword("data.jsp", false);
	}

}
