<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="ex1.Ex2_LifeCycle"%>
<%@page import="org.springframework.core.io.FileSystemResource"%>
<%@page import="org.springframework.core.io.Resource"%>
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

	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex2_LifeCycle1.xml");
	Ex2_LifeCycle life = ctx.getBean("lifetest2",Ex2_LifeCycle.class);
	System.out.println("get :"+life.getMsg());
	
	
%>
</body>
</html>