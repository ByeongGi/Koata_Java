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
	����� �������� �Է��ϼ��� 
	<form action="gugures.jsp" method="get">
		������ ���� <input type="number" step="1"  min ="2" max="9" name="dan"> <br>
		���� ����  <input type="number" step="2" min="1"  max="7" name="range">
		<input type="submit" value="���">
	</form>
</body>
</html>