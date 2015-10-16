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
		var num = 10;
		$('#btn1').click(function() {
			var inter = setInterval(function() {
				if ( num <= 0) {
					clearInterval(inter); // setInterval 반복을 취소 
				}
				$('#target').html(num--);
			}, 1000);
			
		});
		
	});
	

</script>
</head>
<body>
	<div id="wrap">
		<p id="target"></p>
		<input type="button" id="btn1" value="click">
	</div>
</body>
</html>