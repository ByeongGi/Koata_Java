<%@page import="auto.AutoWireService"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("auto/autowire.xml");
	AutoWireService as=ctx.getBean("myauto",AutoWireService.class);
	String name= as.printName();

%><%=name %>
</body>
</html>