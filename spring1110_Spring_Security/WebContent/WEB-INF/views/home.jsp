<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg}</h1>
	<a href="emp/get/javabook">Admin 전용</a>
	
	<c:url var="logoutAction" value="/logout"/>	
		<form action="${logoutAction }" method="post">
			<input type="submit" value="Logout">
		</form>	
</body>
</html>