<%@page import="java.util.Properties"%>
<%@page import="ex2.Ex4_Properties"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex4_prop.xml");
	// xx.properties 파일을 스프링의 Properites 엘리먼트로 대체할수 있다.
	Properties prop = ctx.getBean("myProp",Ex4_Properties.class).getProp();
	String email =prop.getProperty("email");
%> <%=email %>
</body>
</html>