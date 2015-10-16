<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- CDN 방식 -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<title>ex3_css</title>
<style type="text/css"> #wrap{width: 450px;margin: auto;   }</style>
<script type="text/javascript">
$(function () { // 익명 
	$('#btn1').click(
	function() {
	// 체이닝 형식
	$('#wrap').css('backgroundColor','red').css('text-align','center');
	// map 형식
	$('#wrap h1').css( {'color':'white'});
	
	setTimeout(function() {
		$('#wrap').css({ 'background-color':'pink', 'text-align':'center' } );
		$('#wrap h1').css({'color':'yellow'});
	}, 3000);
	
	
	});
});

</script>
</head>
<body>
	<button id="btn1"> 버튼 </button>
	<div id="wrap">
		<h1> JQurey Css Test ! </h1>
	</div>
</body>
</html>