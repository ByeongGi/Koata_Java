<!--2015 년 2015. 9. 23.  오후 1:58:29 Auth by Byeong Gi Kim   -->
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>requset.getParameter 메소드 사용 </b><br> 
name 파라미터 <%=request.getParameter("name") %> <br>
address 파라미터 <%=request.getParameter("address") %> <br>
<p>
<b> request.getParameterValues() 메서드 사용</b><br>
<%
	String[] values = request.getParameterValues("pet");
	if(values!=null){
		for(int i = 0 ; i < values.length ; i++){
			
%>			
			<%= values[i] %>
<%		
		}
	}

%>

<p>
<b>request.getParameterNames() 메서드 사용</b><br>
<%
	Enumeration paramEnum = request.getParameterNames();
	while(paramEnum.hasMoreElements()){
		String name = (String)paramEnum.nextElement();
		%>	
<%= name%>
<%		
	}

%>














</body>
</html>