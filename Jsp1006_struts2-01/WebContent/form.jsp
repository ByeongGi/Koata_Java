<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	#warp{ width: 500px;margin: auto;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
	<div id="wrap" class="container" >
		<form class="form-group" method="post" action="formres">
			제목 : <input type="text" name ="sub" > <br>
			작성자 : <input type="text" name ="writer" > <br>
			내용 : <input type="text" name ="cont" > <br>
			<input type="submit" value="작성">&nbsp;
			<input type="button" value="목록" onclick="javacript:location='list'">
		</form>
	</div>
</body>
</html>