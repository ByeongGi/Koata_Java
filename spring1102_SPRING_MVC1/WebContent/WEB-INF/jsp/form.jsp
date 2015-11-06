<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#wrap{width: 350px; margin: auto;}
</style>
</head>
<body>
	<form action="save2.kosta" method="post">
		sub : <input type="text" id="sub" name="sub"> <br>
		Writer : <input type="text" id="writer" name="writer"> <br>
		Content : <textarea row="10" cols="15" id="content" name="content"></textarea> <br>
		Password : <input type="password" id="pwd" name="pwd" maxlength="10"> <br>
		<input type="submit" value="send">
	</form>
</body>
</html>