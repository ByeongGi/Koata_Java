<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>payform.jsp</title>
</head>
<body>
	<div id="wrap">
		<form action="payin" method="post">
			부서명 : <input type="text" name="dname"> <br>
			사원번호 : <input type="text" name="sabun"> <br>
			사원이름 : <input type="text" name="saname"> <br>
			급여 : <input type="text" name="sapay"> <br>
			급여일 : <input type="date" name="paydate"> <br>
			부서명 : <input type="submit" name="sned"> <br>
		</form>
	</div>
</body>
</html>