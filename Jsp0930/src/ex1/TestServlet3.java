package ex1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test3")
public class TestServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ArrayList<String> list = new ArrayList<>();
		list.add("test");
		list.add("ok");
		request.setAttribute("list", list);
		
		ArrayList<TestVo> list2= new ArrayList<>();
		
		TestVo vo1 = new TestVo();
		vo1.setName("김길동");
		vo1.setEmail("wwww3353@never.com");
		vo1.setPhone("010-4564-1234");
		
		TestVo vo2 = new TestVo();
		vo2.setName("김길수");
		vo2.setEmail("wwww1233@never.com");
		vo2.setPhone("010-123-1234");
		
		
		list2.add(vo1);
		list2.add(vo2);
		request.setAttribute("list2", list2);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("test3.jsp");
		rd.forward(request, response);

	}

}
