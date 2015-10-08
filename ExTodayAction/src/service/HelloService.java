package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ActionFoword;

public class HelloService implements Service {
// Controller 가 생성하고 메서드를 가진 모델 
	@Override
	public ActionFoword execute(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
			request.setAttribute("m", "Hello ^^");
			// view 의 이름과 전송 방식을 전달한다.
		return new ActionFoword("hello.jsp", false);
	}

}
