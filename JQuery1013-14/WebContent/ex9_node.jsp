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
<style type="text/css">
.textStyle {font-size: 16px; line-height: 20px; margin: 10px;}
</style>
<script>
$(function() {
	$('body *').addClass('textStyle');
	var $ch = $('em + a + a + b + a');
	var $ch2 = $('em + a + a');
	// console.log($ch2.text());
	// $('.result1').text($ch2.text()).css('background','yellow')
	$ch2.css('background','yellow').appendTo('.result1')
});
</script>
</head>
<body>
	<em> One</em>
	<a>Two</a>
	<a>Three</a>
	<b>Four</b>
	<a>Five</a>
	<a> Six</a> <hr>
	<span class="result1"></span>
	
	
	
</body>
</html>