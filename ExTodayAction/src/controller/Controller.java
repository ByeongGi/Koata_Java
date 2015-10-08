package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.ServiceFactory;
import model.ActionFoword;
import service.Service;
import service.TodayService;

/**
 * Servlet implementation class TodayController
 */
@WebServlet("/command")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		
		String cmd = request.getParameter("cmd");
		
		if (cmd != null) {
			// cmd 로 부터 필요한 서비스 객체이름을 넘겨서 
			// ServiceFactory로 부터 객체 생성 
			ServiceFactory factory = ServiceFactory.getFactory();
			Service service = factory.getAction(cmd);
			// model 가지고 있는 메소드를 호출후 actionForword 반환
			ActionFoword af = service.execute(request, response);

			if (af.isMethod()) { // 이동 방식 분석
				response.sendRedirect(af.getUrl());
			} else { // false 일 경우 forword 방식으로 이동 
				RequestDispatcher rd = 
						request.getRequestDispatcher(af.getUrl());
				rd.forward(request, response);
			}

		} else {
			System.out.println("명령어 없음 ");
		}

	}

}
