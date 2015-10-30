<%@page import="java.util.List"%>
<%@page import="ex2.Ex3_List"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex2_List.xml");
	Ex3_List lists=ctx.getBean("myList",Ex3_List.class);
	List<String> list=lists.getName();
	
	for(String name :list){			
%>
	NAME :<%=name%> <br>

	<% }%>
</body>
</html>