<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<a href='<c:url value="/tvo/list"/>'>LIST 로 갑니다!</a>
	</div>
	<div>
		<form action='<c:url value="/tvo/insert"/>' enctype="multipart/form-data" method="post">
			sub : <input type="text" id="sub" name="sub"> <br>
			Writer : <input type="text" id="writer" name="writer"> <br>
			Content : <textarea row="10" cols="15" id="content" name="content"></textarea> <br>
			Password : <input type="password" id="pwd" name="pwd" maxlength="10"> <br>
			파일 업로드 : <input type="file" id="mfile1" name="mfile1">
			<input type="submit" value="send" >
		</form>
	</div>
</body>
</html>