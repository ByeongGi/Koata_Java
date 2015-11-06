<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:choose>
<c:when test="${typev == 'A'}">
<style type="text/css">
		body { background: pink;}
</style>

</c:when>
<c:otherwise>
<style type="text/css">
		body { background: blue;}
</style>
</c:otherwise>
</c:choose>
</head>
<body>
	ID : <input type="text" name="id" value="${id}">
</body>
</html>