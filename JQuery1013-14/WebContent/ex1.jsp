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
	span { color: blue; font-size: 30px;}
	.sp { color: red; font-size: 40px; background: orange;}
	.div1 { width: 350px; background: maroon;  text-align: center; height: auto;
	margin: auto;
	}
</style>
<script type="text/javascript">
	// 문서가 ready 안에 이벤트 내용 익명함수로 콜백함수 지정 로딩된후 함수 작동 
	$(document).ready(function() {  
		$('div span').addClass('sp');  
		$('div').addClass('div1');
	});
	
	// 콜백함수 
	$(document).ready(res);
	function res() {
		console.log("TEST");
	}
	
</script>
</head>
<body>
	
	<div>
		<span> 나의 첫번째 Jquery ^^ </span>
	</div>

	
<!-- <script>
		$('div span').addClass('sp');
</script> -->
	<!-- 현재 div 브라우져가 시작될때 중앙에 오도록 설정한 CSS 를 적용하시오 
		 너비는 350x ; 배경색은 알아서 ...
	 -->


</body>
</html>