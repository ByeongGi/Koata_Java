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
	#target{ width: 300px; margin: auto; background: gray;}
</style>
<script type="text/javascript">
	$(function() {
		$('#btn1').click(function() {
			$('#target').load('ex2_serverpage.jsp p,span',function(){ 
				console.log('동작 확인');
				$('p').filter(function(idx){
					return idx % 2 != 0; }
				).css({'background':'pink'});
				
				});
			
		});
	});
</script>
</head>
<body>
	<div id="target"></div>
	<input type="button" value="AjaxLoad" id="btn1"/>
</body>
</html>