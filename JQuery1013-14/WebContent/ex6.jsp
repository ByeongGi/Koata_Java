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
#target {
	width: 300px;
	height: 50px;
	border: 1px solid;
}
</style>
<script type="text/javascript">
	$(function() {
		$('#btn1').click(function() {
			// radio 상태값 
			var chval = $('#ch1').val();
			console.log(chval);
			// 라디오 버튼 체크 상태
			var status = $('#ch1').is(':checked');
			console.log(status);
			// data 의 입력값을 target 에 저장 
			$('#target').html($('#data').val());
			console.log($('#target').html());
		});
	});
</script>
</head>
<body>
	<input type="radio" id="ch1" name="ch" value="test1">
	<input type="radio" id="ch2" name="ch" value="test2">
	<input type="text" id="data" name="data" value="test">
	<input type="button" value="click" id="btn1">
	<div id="target"></div>
</body>
</html>