package ex1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 현재 페이지를 URI에서 작성할때
// http://localhost/webapp0921/start?cmd=value
// 형태로 요청을 하면 실행이 되지만
// sendRedirect 메소드를 호출해서 re2로 재요청을 한다.
@WebServlet("/start")
public class Ex3_Redirect_front extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("실행이됨");
		String  cmd = req.getParameter("cmd");
		// requestScope 영역에 키와 Value 값으로 값을 저장할수 있다.
		// 이때 저장하는 메소드는 setAttribute , 값을 불러내는 메소드 getAttribute
		req.setAttribute("cmdv",cmd);
		System.out.println("front Log1 : "+cmd);
		System.out.println("front Log2 : "+req.getAttribute("cmdv") );
		resp.sendRedirect("re2?cmd="+cmd); // 이런식으로 파라미터를 연결해줄수 밖에 없음
	
	
	}
}
