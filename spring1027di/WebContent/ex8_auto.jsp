<%@page import="auto.MyResource"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("auto/res.xml");
	MyResource mr=ctx.getBean("resv",MyResource.class);
	String msg= mr.printMsg();

%><%=msg %>
</body>
</html>