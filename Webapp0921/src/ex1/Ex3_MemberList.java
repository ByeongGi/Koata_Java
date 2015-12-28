package ex1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memList")
public class Ex3_MemberList extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		// File Reader
		String path ="C:\\kosta108\\html\\workspace\\Webapp0921\\src\\ex1\\test.txt";
		Scanner sc= new Scanner(new FileReader(new File(path)));
		String[] ar = {};
		

		// 값을 읽고 HTML로 전송 
		out.print("<table border='1' >");
		out.println("<tr><td>"+"id"+"</td><td>"+"비번"+"</td><td>"+"이름"+"</td><td>"+"주소"+"</td></tr>");
		while (sc.hasNext()) {
			String string = (String) sc.next();
			ar = string.split("/");
			String id = ar[0];
			String pwd = ar[1];
			String name = ar[2];
			String addr = ar[3];
			String intro = ar[4];
			out.println("<tr><td>"+id+"</td><td>"+pwd+"</td><td>"+name+"</td><td>"+addr+"</td></tr>");
			
		}
		out.print("</table>");
		out.print("<a href='/Webapp0921/ex2_form.html'>회원가입<a>");
		out.flush();
		out.close();
		
	}
}
