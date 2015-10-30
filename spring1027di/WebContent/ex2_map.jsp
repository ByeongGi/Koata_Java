<%@page import="ex1.ex1_Const"%>
<%@page import="java.util.Map"%>
<%@page import="ex2.Ex2_Map"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex2_map.xml");
	// import 로 추가한 빈을 호출 
	ex1_Const cont1=ctx.getBean("cont1",ex1_Const.class);
	// 기존의 map 을 반환하는 빈 호출 
	Ex2_Map maps=ctx.getBean("myMap",Ex2_Map.class);
	Map<String,Integer> map=maps.getMaps();
	
	// 향상된 for문을 통해서 출력
%>
	<%
	for(Map.Entry set: map.entrySet()){
 	%>	
		
		도시 : <%=set.getKey()%> <br>
		가격 : <%=set.getValue() %> <br>
		
	<%}%>
	
	<hr>
	cont1 의 값 <%=cont1.print() %>	
</body>
</html>