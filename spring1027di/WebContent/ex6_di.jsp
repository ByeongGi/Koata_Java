<%@page import="ex3.OrderSystem"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("ex3/menu.xml");
	// Interface를 참조해서  다형성을 사용한 Spring Di 를 설명했음
	OrderSystem os=ctx.getBean("menuPrint",OrderSystem.class);
	String res =os.printMenu("김치찌개");
%>
RES:<%=res %>
</body>
</html>