<%@page import="exam1.ioc_container.Bean_DI_Object"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("exam1/ioc_container/exam1_DI.xml");
	
	// setter 로 주입
	Bean_DI_Object di_obj=ctx.getBean("di_Object",Bean_DI_Object.class);
	String msg=di_obj.printMsg();
	
	// 생성자로 주입
	Bean_DI_Object di_obj2=ctx.getBean("di_Object2",Bean_DI_Object.class);
	String msg2= di_obj2.printMsg();
	
%>
Setter를 통해서 주입 : <%=msg%> <br>
생성자를 통해서 주입 :  <%=msg2%>
</body>
</html>