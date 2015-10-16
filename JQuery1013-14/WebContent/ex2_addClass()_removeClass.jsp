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
	width: 500 px;
	height: 700px;
	background-color: aqua;
}

.im {
	background-image: url("img/img1.jpg");
}
.im2 {
	background-image: url("img/img2.jpg");
}
</style>
<script type="text/javascript">
// flag 상태값 저장 
 var flag=true;
	$(document).ready(function() {
		
		// btn1 클릭되었을때 addClass 한다
		$('#btn1').click(function() {
			if (flag) {
				$('#target').addClass('im');
				flag=false;http://localhost:8090/JQuery1013/ex2.jsp
			}else{
			    $('#target').removeClass('im');
			    flag=true;
				
			}
		});
		
	}); 
	/* $(document).ready(function() {
		
		// btn1 클릭되었을때 addClass 한다
		$('#btn1').click(function() {
			 $('#target').toggle(); 해당 선택자의 요소를 보여주거나 안 보여준다 
		});
		
	}); */


	$(document).ready(function() {
		
		// btn1 클릭되었을때 addClass 한다
		$('#btn2').click(function() {
				$('#target').removeClass('im2');
				$('#target').addClass('im');
		});
		$('#btn3').click(function() {
				$('#target').removeClass('im');
				$('#target').addClass('im2');
		});
		

	});	
	
</script>
</head>
<body>
	<input type="button" value="Click" id="btn1">
	<div id="target">
	</div>
	<input type="button" value="1" id="btn2">
	<input type="button" value="2" id="btn3">
</body>
</html>