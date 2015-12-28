package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿을 상속받는다.
public class Ex1_FirstServlet extends HttpServlet {
	
	public Ex1_FirstServlet() {
		System.out.println("Ex1_FirstServlet 생성자 호출!");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init 호출");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1); // 서비스는 doget , post를 항상 호출
		System.out.println("service 호출");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		System.out.println("do get 호출");
		// 브라우져에게 응답시켜보기
		PrintWriter out = resp.getWriter();
		out.println("<!Doctype html>");
		out.println("<html> <head> <meta charset='UTF-8'>");
		out.println("<p style='color:red' >");
		out.println("한글깨짐");
		out.println("</p>");
		
		
		out.close();
	}

	@Override
	public void destroy() {
		System.out.println("destroy 호출");
	}

} // end Ex1_FirstServlet