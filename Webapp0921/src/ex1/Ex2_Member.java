package ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 현재 서블릿은 ex2_form.html에서 전송 버튼을 클릭했을때 
 * 사용자가 작성한 데이터를 받아서 처리하기 위한 페이지이다.
 */
@WebServlet("/addMember")
public class Ex2_Member extends HttpServlet{
	// response 를 사용해서 
	// 브라우져로 읽어들인 자원을 출력하는 루틴을 잘 이해하기 바람 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//  ex@_form.html에서 넘어오는 파리미터(데이터를 가진 key값) 들을 
		// 받아서 처리해보자.
		req.setCharacterEncoding("UTF-8");
		String method=req.getMethod();
		System.out.println("method"+method);
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		String intro = req.getParameter("intro");
		System.out.println("id"+id);
		System.out.println("pwd"+pwd);
		System.out.println("name"+name);
		System.out.println("addr"+addr);
		System.out.println("intro"+intro);
		// IO 를 사용하여 ex1.member.txt 파일로 저장 
		// 아이디-비번-이름
		String path ="C:\\kosta108\\html\\workspace\\Webapp0921\\src\\ex1\\test.txt";
		System.out.println("path"+path);
		PrintWriter writer= new PrintWriter(
				new FileWriter(new File(path),true),true);
		StringBuffer sb = new StringBuffer();
		sb.append(id).append("/")
		.append(pwd).append("/")
		.append(name).append("/")
		.append(addr).append("/")
		.append(intro).append("");
		writer.println(new String(sb.toString().getBytes(),"UTF-8"));
		writer.close();
		resp.sendRedirect("memList"); // 클라이언트(브라우저)에게 다른 주소로 가라고 가르쳐줌  
		
	}
}
