<%@page import="ex1.ex1_Const"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ApplicationContext ctx= new GenericXmlApplicationContext("ex1/ex1_cont.xml");
	ex1_Const ct = ctx.getBean("cont1",ex1_Const.class);
	ex1_Const ct2 = ctx.getBean("cont2",ex1_Const.class);
	
%> 

String :<%=ct.call() %> </br>
Num :<%=ct.print() %> </br>

==============================
<%=ct2.moniter() %>
</body>
</html>