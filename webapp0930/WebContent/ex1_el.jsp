<!--2015 년 2015. 9. 30.  오전 9:14:29 Auth by Byeong Gi Kim   -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("key1", "test");
	request.setAttribute("key2", "test2");
	session.setAttribute("key3", "test3");
	application.setAttribute("key4", "test4");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<label>EL_페이지</label>
	${key1} / ${pageContext.request.requestURI}  <br>
	${key2} <br>
	${key3} <br>
	${key4} <br>
	<a href="ex1_res.jsp">이동</a>
	<jsp:forward page="ex1_res.jsp"></jsp:forward>
</body>
</html>