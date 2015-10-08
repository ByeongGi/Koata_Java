package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ActionFoword;

public class IndexService implements Service {

	@Override
	public ActionFoword execute(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		request.setAttribute("msg", "환영합니다 ! ");
		// view 의 이름과 전송 방식을 전달한다.
		return new ActionFoword("index.jsp", false);
	}

}
