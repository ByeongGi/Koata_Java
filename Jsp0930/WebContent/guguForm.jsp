<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	출력할 구구단을 입력하세요 
	<form action="gugures.jsp" method="get">
		구구단 선택 <input type="number" step="1"  min ="2" max="9" name="dan"> <br>
		범위 선택  <input type="number" step="2" min="1"  max="7" name="range">
		<input type="submit" value="출력">
	</form>
</body>
</html>