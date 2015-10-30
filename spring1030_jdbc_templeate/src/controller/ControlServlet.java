package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.GenericXmlApplicationContext;

import action.Action;
import action.ActionForward;

@WebServlet("*.kosta")
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GenericXmlApplicationContext ctx;
	
	
	public ControlServlet() {
		ctx = new GenericXmlApplicationContext("controller/factory.xml");

	}
	// Was에 의해서 Servlet이 undeploy이 될때 호출된다.
	@Override
	public void destroy() {
		ctx.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doService(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doService(request, response);
	}

	protected void doService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String query = request.getParameter("query");
		if (query != null) {

			Action action = ctx.getBean(query, Action.class);
			ActionForward af = action.execute(request, response);

			if (af.isMethod()) { // 이동 방식 분석
				response.sendRedirect(af.getUrl());
			} else { // false 일 경우 forword 방식으로 이동
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/"+af.getUrl());
				rd.forward(request, response);
			}

		} else {
			System.out.println("명령어 없음 ");
		}

	}
}
