<!--2015 오전 11:40:03 Auth by Byeong Gi Kim   -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!
	public int multiply(int a,int b){
		int c = a * b;
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
	10 * 25 = <%=multiply(10, 25) %>
</body>
</html>