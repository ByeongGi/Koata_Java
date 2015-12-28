package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 연습 문제 > 요청이 today라면
// 항상 현재 날짜를 브라우저에 출력하시오 
// Servlet3.0이부터 어노테이션 지원 
@WebServlet("/today")
public class Today extends HttpServlet{
	
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	resp.setContentType("text/html; charset=UTF-8");
	PrintWriter out=resp.getWriter();
	
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy 년 MM 월 dd 일 HH 시 mm 분 ss 초 ");
	String time=dateFormat.format(new Date());
	
	out.println("현재 시간 " +time);
	out.close();
	System.out.println("Today Servlet 호출 확인");
	}
}
