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
.textStyle {font-size: 16px; line-height: 20px; margin: 10px; background: }
</style>
<script>
// 각각의 다양한 요소를 접근하기 위해서는 부모 요소를 기준으로 접근 
$(function() {
	$node1 = $('div').children();
	$('.result1').append("자식노드수 :"+$node1.css('color','blue').size());
	console.log("LOG ::: "+$node1);
	// eq(요소의 인덱스) : each  문 안에서 index 를 비교할때 자주 사용
	var $nodev = $node1.eq(2);
	$nodev.css('background','pink');
});
</script>
</head>
<body>
	<div>
	<em> One</em>
	<a>Two</a>
	<a>Three</a>
	<b>Four</b>
	<a>Five</a>
	<a> Six</a> 
	</div>
	<hr>
	<span class="result1"></span>	
	
	
</body>
</html>