<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.support.GenericApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="ex2.Ex2_Message"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ex2_diref.jsp</title>
</head>
<body>
<%
	ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex2_di.xml");
	/* 
	ctx.getBean(BeanName,requiredType)
	requiredType 은 객체의 실제 클래스의 슈퍼클래스 인터페이스 타입을 찾도록 지정하는 것이다.
	requiredType - type the bean must match. 
	Can be an interface or superclass of the actual class, or null for any match.
	For example, if the value is Object.class, this method will succeed whatever the class of the returned instance.
	*/
	Ex2_Message msg = ctx.getBean("msg",Ex2_Message.class);
	
%>
<%=msg.msgPrint()%>
</body>
</html>