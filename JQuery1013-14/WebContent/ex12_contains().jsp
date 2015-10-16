<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- CDN 방식 -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<style type="text/css"></style>
<script type="text/javascript">
	$(function() {
		// 특정 문자열을 포함한 객체를 선택
		$('div p:contains("TEST")').css('backgroundColor','pink');
	})
</script>
</head>
<body>

	
	<div>
		<p> TEST 1</p>
		<p> 이것은 테스트 입니다.</p>
		<p> 오늘은 토요일 입니다. </p>
		<h1> JQuery TEST 입니다. </h1>
		<p><sapn> JQuery TEST</sapn></p>
		<span>TEST 이것은 ?</span>
	</div>
</body>
</html>