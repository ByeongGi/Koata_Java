<%@page import="java.util.Iterator"%>
<%@page import="java.util.stream.Stream"%>
<%@page import="java.util.Set"%>
<%@page import="ex2.Ex5_SetType"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex5_set.xml");
	Set<Integer> set=ctx.getBean("mySet",Ex5_SetType.class).getSet();
	Iterator<Integer> lter = set.iterator();
	
	while(lter.hasNext()){
%>		
		<%=lter.next()%> <br>
	<%}%>
	
	

</body>
</html>