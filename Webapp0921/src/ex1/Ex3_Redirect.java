package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/re2")
public class Ex3_Redirect extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String cmd = req.getParameter("cmd");
		System.out.println("Log: " + cmd);
		out.println("결과페이지" + cmd);
	}
}
