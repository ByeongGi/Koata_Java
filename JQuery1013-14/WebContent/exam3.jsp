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
	var arr = [ "호랑이", "사자", "곰" ];
	var col = [ "#330066", "#ffcc00" , "#990000" ];
	var img = [ "img/img1.jpg", "img/img2.jpg", "img/img2.jpg"];
	$(function() {
		$('#btn1').click(function() {
			var input=$('#content').val();
			console.log("LOG INPUT::: "+input);
			var idx = $.inArray(input,arr);
			console.log("LOG INDEX::: "+idx);
			var color = col[idx]
			console.log("LOG COLOR::: "+color);
			var imgSrc =img[idx];
			console.log("LOG IMG SRC::: "+imgSrc);
			$('#target').html('<p>'+input +'</p>');
			$('#target p').css({'background-color':color});
			
			$('#targetImg').attr({
				alt:'이미지',
				src: imgSrc,
				width: '150px'
			});
			// background-color: #330066
		});		
	});
</script>
</head>
<body>

	<div>
		[호랑이, 사자 , 곰 중에 하나만 입력해보세요.] <input type="text" name="content"
			id="content"> <input type="button" value="submit" id="btn1"/>
		<div id="target"></div>
		<p></p>
		<img alt="" src="" id="targetImg">
	</div>
</body>
</html>
