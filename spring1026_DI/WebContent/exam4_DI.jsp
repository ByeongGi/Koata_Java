<%@page import="exam4.ioc_container.AutoWire_DI_Oject"%>
<%@page import="exam3.ioc_container.Bean_DI_Object"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("exam4/ioc_container/exam4_DI.xml");

	// 생성자로 주입
	AutoWire_DI_Oject bc=ctx.getBean("di_obj",AutoWire_DI_Oject.class);
	String msg=bc.getMsg();

%>
<%=msg %>
</body>
</html>