<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	레벨을 선택하세요 !
<form action="chooseTest.jsp" method="get">
	<select name= "level">
		<option>-- 선택 --</option>
		<option value="trial">trial</option>
		<option value="reqular">reqular</option>
		<option value="provider">provider</option>
	</select>
	<input type="submit" value="입력">
</form>
</body>
</html>