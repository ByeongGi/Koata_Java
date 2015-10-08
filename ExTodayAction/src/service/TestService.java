package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ActionFoword;

public class TestService implements Service {

	@Override
	public ActionFoword execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		
		request.setAttribute("msg", "test");
		return new ActionFoword("test.jsp", false);
	}

}
