<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>emp.jsp</title>
</head>
<body>
	로그인 한 사용자의 정보를 출력
	<h1> 이것은 모델에서 받은 값 : ${id}</h1>
	<c:if test="${pageContext.request.userPrincipal.name != null }">
			Hi ${pageContext.request.userPrincipal.name != null } <br>
		<c:url var="logoutAction" value="/j_spring_logout"/>	
		<form action="${logoutAction }" method="post">
			<input type="submit" value="Logout">
		</form>	
	</c:if>
</body>
</html>