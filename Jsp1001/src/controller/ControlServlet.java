package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Action;
import model.ActionFoword;
import model.HelloAction;

/**
 * Servlet implementation class ControlServlet
 */
@WebServlet("/ControlServlet")
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doSevice(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doSevice(request, response);
	}

	protected void doSevice(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 사용자로부터 요청을 받는다 .
		String cmd = request.getParameter("cmd");

		if (cmd != null) {
			Action action = null;
			if (cmd.equals("hello")) {
				action = new HelloAction();
			}
			ActionFoword af = action.execute(request, response);
			// 모델이 가지고 있는 메서드를 호출후 ationforword 반환
			if (af.isMethod()) {
				response.sendRedirect(af.getUrl());
			} else {
				RequestDispatcher rd = 
						request.getRequestDispatcher(af.getUrl());
				rd.forward(request, response);
			}
		} else {
			System.out.println("해 당 요 청 이 없 음 ");
		}

	}

}
