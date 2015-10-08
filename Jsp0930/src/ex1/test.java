package ex1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.core.ApplicationContext;

import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;
import com.sun.glass.ui.Application;

import sun.misc.Request;
import sun.net.www.ApplicationLaunchException;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서블릿에서 forword 하기위해서 RequestDispatcher 객체를
		// 생성한다.
		// foword 는 request 객체 안에서 제공받는 메소드 
		// A - > B : 즉 requestScope 안에 값을 저장해서 
		// forword 시킬수 있다.
		// 페이지의 변화가 없음 
		RequestDispatcher rd = request.getRequestDispatcher("test.jsp");
		request.setAttribute("msg", "hi");
		request.setAttribute("msg2", "hi2");
		request.setAttribute("msg3", "hi3");

		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
