<%@page import="ex1.Ex1_MessegeApp"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.support.GenericApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="com.sun.glass.ui.Application"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ex1_di.jsp</title>
</head>
<body>
<% 
	// Web 환경이 지원되는 컨테이너 - ApplicationContext
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex_1.xml"); // 컨테이너에 빈을 등록하고 

						// 컨테이너로부터 msg 라고 붙인 빈 객체를 가져온다.
	Ex1_MessegeApp em = ctx.getBean("msg",Ex1_MessegeApp.class);
	String msg = em.printMsg();

%><%=msg %>
</body>
</html>