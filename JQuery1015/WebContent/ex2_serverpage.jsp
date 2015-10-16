<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	p {background: red; color: white;}
</style>
</head>
<body>
<% for( int i=0; i<10; i++){ %>
	<p> 여기는 서버측 페이지 입니다.</p>
<% }%>	
	<span> 여기는 AJAX 서버의 내용입니다.</span>
	<h1>MYTEST</h1>
</body>
</html>