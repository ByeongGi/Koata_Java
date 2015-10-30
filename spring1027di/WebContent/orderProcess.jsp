<%@page import="exam.OrderSystem"%>
<%@page
	import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page
	import="org.springframework.context.support.GenericApplicationContext"%>
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
	<jsp:useBean id="vo" class="exam.OrderVo" scope="page"/>
	<jsp:setProperty name="vo" property="name" />
	<jsp:setProperty name="vo" property="orderName" />
	<jsp:setProperty name="vo" property="price" />
	<jsp:setProperty name="vo" property="quant" />
<%
		ApplicationContext ctx = new GenericXmlApplicationContext("exam/order_menu.xml");
		OrderSystem os = ctx.getBean("orderSystem", OrderSystem.class);
		String res=os.printOrder(vo);
%><%=res %>
</body>
</html>