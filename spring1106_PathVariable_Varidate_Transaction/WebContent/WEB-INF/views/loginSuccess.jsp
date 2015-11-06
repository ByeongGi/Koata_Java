<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Login __ Success
	<div id="wrap">
		<h2> WelCome ${userForm.email} </h2>
		<h2> Session  <%=session.getAttribute("id")%> </h2>
	</div>
</body>
</html>