package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/menuAdd")
public class AddMenuServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		System.out.println("menuAdd 검사 ! ");
		// MenuVo에 파라미터로 넘어 온 값을 저장 
		MenuVo vo = new MenuVo();
		// OrderMenuDao의 addMenu(MenuVo vo)에게 vo를 전달
		vo.setMcode(req.getParameter("mcode"));
		vo.setMname(req.getParameter("mname"));
		vo.setMprice(Integer.parseInt(req.getParameter("mprice")));
		// OrderMenuDao.getDao().addMenu();
		OrderMenuDao.getDao().addMenu(vo);
		PrintWriter out = resp.getWriter();
		out.println("<a href='menuFrom.html'>meunFrom</a>");
	}
}
