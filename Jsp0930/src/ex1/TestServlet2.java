package ex1;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet2
 */
@WebServlet("/test2")
public class TestServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TestVo vo = new TestVo();
		vo.setName("김길동");
		vo.setEmail("wwww3353@never.com");
		vo.setPhone("010-4564-1234");
		request.setAttribute("v", vo);
		// Map으로 자동차이름과 제조사를 등록하고
		// test2.jsp 에서 값을 표현하시오.
		HashMap<String,String > map = new HashMap<>();
		map.put("car1", "뉴비틀");
		map.put("name1", "폭스바겐");
		map.put("car2", "뉴비틀");
		map.put("name2", "폭스바겐");
		map.put("car3", "뉴비틀");
		map.put("name3", "폭스바겐");
		
		request.setAttribute("map",map);
		
		
		// 문제 test2.jsp 에서 값을 표현하시오.
		RequestDispatcher rd= request.getRequestDispatcher("test2.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
