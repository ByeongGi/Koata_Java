<!--2015 오전 11:43:57 Auth by Byeong Gi Kim   -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public int subStract(int a, int b){
		int c = a - b;
		return c;
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int value1 = 3;
	int value2 = 9;
	
	int addResult = add(value1,value2);
	int subStractResult= subStract(value1, value2);
%>

<%= value1 %> + <%=value2 %> = <%= addResult %>
<br>
<%= value1 %> - <%=value2 %> = <%= subStractResult %>
</body>
</html>