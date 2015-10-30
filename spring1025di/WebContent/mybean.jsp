<%@page import="ex1.MyBean"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.support.GenericApplicationContext"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/my.xml");
	MyBean mb = ctx.getBean("mybean",MyBean.class);
	int age= mb.getAge();
	String name = mb.getName();
%> 

이름: <%=name %>
나이: <%=age %>
</body>
</html>