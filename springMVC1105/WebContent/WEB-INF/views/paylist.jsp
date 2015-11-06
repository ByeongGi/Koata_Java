<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="vo" items="${list}">
		${vo.num} / ${vo.dname} / ${vo.saname} <br>
	</c:forEach>
	<h3> <a href="downLoadExcel"> DOWNLOAD EXCEL</a></h3>
</body>
</html>