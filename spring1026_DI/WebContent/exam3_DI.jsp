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
	ApplicationContext ctx = new GenericXmlApplicationContext("exam3/ioc_container/exam3_DI.xml");

	// 생성자로 주입
	Bean_DI_Object bc=ctx.getBean("di_obj",Bean_DI_Object.class);
	String msg=bc.getImp().msg("생성자로 객체 주입 확인");

%>
<%=msg %>
</body>
</html>