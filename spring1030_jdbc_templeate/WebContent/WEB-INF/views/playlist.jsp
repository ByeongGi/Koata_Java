<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	LIST 확인
	<div id=wrap>
		<table style="border: 1px solid;">
			<tr style="border: 1px solid;">
				<td>NUM</td>
				<td>PNAME</td>
				<td>PRICE</td>
				<td>USERS</td>
				<td>등록일</td>
			</tr>
			<c:forEach items="${list}" var="data">
				<tr style="border: 1px solid;">
					<td>${data.num}</td>
					<td>${data.pname}</td>
					<td>${data.price}</td>
					<td>${data.users}</td>
					<td>${data.rdate}</td>
					
				</tr>
			</c:forEach>
			<tr>
			
			</tr>
		</table>
	</div>
	
</body>
</html>