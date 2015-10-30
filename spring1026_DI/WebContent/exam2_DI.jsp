<%@page import="java.util.Iterator"%>
<%@page import="java.util.Properties"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="exam2.ioc_container.Bean_Collection_Object"%>
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
	ApplicationContext ctx = new GenericXmlApplicationContext("exam2/ioc_container/exam2_DI_collection.xml");
	
	// 생성자로 주입
	Bean_Collection_Object bc=ctx.getBean("collection",Bean_Collection_Object.class);
	Map<String,String> map=bc.getMap();
	List<String> list = bc.getList();
	Set<String>  set = bc.getSet();
	Iterator lter=set.iterator();
	Properties prop = bc.getProp();
	Iterator prop_liter=prop.keySet().iterator();
	
		
%>
	MAP==<br> <% for(Map.Entry e : map.entrySet()){ %>
			Key :<%=e.getKey()%> <br>
			value : <%=e.getValue()%> <br>
		
		<% } %>
		
		<hr>
		
	List==<br> <% for(String e : list){ %> 
			value : <%=e%> <br>
		
		<% } %>
		<hr>
		
	Set==<br> <% while(lter.hasNext()){ %> 
			value : <%=lter.next()%> <br>
		
		<% } %>
		
	Properties == <br> <% while(prop_liter.hasNext()){
						String key=(String)prop_liter.next();%>
				key : <%=key%> <br>
				value : <%=prop.get(key) %>
 	
	
		<%} %>	
		
</body>
</html>