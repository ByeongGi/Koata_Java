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
<script type="text/javascript">
$(function() {
		$('#btn1').click(function() {
			$('#target').attr({
				alt:'이미지',
				src:'img/img2.jpg',
				width: '150px'
			});
		});
		
		
		$('#btn2').click(function() {
			$('#target').hide();
			
		}); // hide()
		
		$('#btn3').click(function() {
			$('#target').show();
			
		}); // show()
		
		// toggle :번갈아가면서 함수를 실행
		$('#btn4').toggle(function() {
			$('#target').slideUp(150, function() {
				$('#btn3').val('Down');
			});
			
		},function(){
			$('#target').slideDown(150, function() {
				$('#btn3').val('Up');
			});
			
			
		}); // toogle()
		
});

</script>
</head>
<body>
	<input type="button" id="btn1" value="버튼" />
	<img  src="img/img1.jpg" id="target" >
	<input type="button" value="hide" id="btn2">
	<input type="button" value="show" id="btn3">
	<input type="button" value="toogle&slide" id="btn4">
	<input type="button" value="show" id="btn5">
</body>
</html>