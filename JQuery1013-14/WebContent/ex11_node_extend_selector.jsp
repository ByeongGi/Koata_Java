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
	table { table-layout: auto; width: 70%}
	.selectedstyle {background: pink; font-size: 20px; }
	.notstyle { background: yellow;}
</style>
<script type="text/javascript">
var flag = false;
$(document).ready(function() {
	// MAP 방식
	$('td').css({'color':'blue','font-weight':'bold'});
	$('#btn1').click(function() {
		setInterval(function() {
			if (flag) {
				// tr 이란 집합요소에서  even: 짝수를 필터 : odd:홀수
				$('tr:even').css('backgroundColor','pink');
				$('tr:odd').css('backgroundColor','yellow');
				flag= false;
			} else {
				$('tr:even').css('backgroundColor','yellow');
				$('tr:odd').css('backgroundColor','pink');
				flag= true;
			}
		},500);
	});	// Btn1 handler
	
	
	$('#btn2').click(function() {
		// $('tr:not(:first)'.addCalss('notstyle'));
		var $first= $('tr:first');
		var $last= $('tr:last');
		
		/*
		var $last = $('tr:last,funtion(){
			// tr 중에서 마지막 요소일때 정의된
			// nostyle 요소를 제거함으로써 last를 복원
			$('tr:last').removeCalss('nostyle');
		});
		
		*/
		$('tr:not(:first)').addClass('notstyle');
		$first.addClass('selectedstyle');
		$last.addClass('selectedstyle');

	});	// Btn2 handler
	
	$('#btn3').click(function() {
		// 3보다 작은 요소
		$('tr:lt(3)').addClass('selectedstyle');
		// 3보다 큰 요소
		$('tr:gt(3)').addClass('notstyle');

	});	// Btn3 handler
	
	
	
});

</script>
</head>
<body>
	<table>
		<tr>
			<td>One</td>
		</tr>
		<tr>
			<td>Two</td>
		</tr>
		<tr>
			<td>Three</td>
		</tr>
		<tr>
			<td>Four</td>
		</tr>
		<tr>
			<td>Five</td>
		</tr>
	</table>
	<input type="button" value="even/odd" id="btn1"></input><br />
	<input type="button" value="first/last" id="btn2"></input><br />
	<input type="button" value="gt/lt" id="btn3"></input><br />
	
</body>
</html>