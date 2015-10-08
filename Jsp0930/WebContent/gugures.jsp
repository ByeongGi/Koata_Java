<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	구구단 ${param.dan} 단 <br>
	구구단 ${param.range} 범위 지정  <br>
	<c:forEach var ="r" begin="${param.dan-param.range/2+1}" end="${param.dan+param.range/2}">
		<c:forEach var ="n" begin="1" end="9" >
			${r} * ${n} = ${n * r} <br>
		</c:forEach>
		<br>
	</c:forEach>		
</body>
</html>