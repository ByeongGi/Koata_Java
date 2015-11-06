<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrap">
		<form action="testTx" method="post">
			ID (유니크) : <input type="text" name="id" /> <br>
			PASSWORD  : <input type="text" name="password" /> <br>
			NAME  : <input type="text" name="name" /> <br>
			ADDR : <input type="text" name="address" /> <br>
			
			SSN(유니크) : <input type="text" name="ssn" /> <br>
			<input type="submit">
		</form>
	
	</div>
</body>
</html>