<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- CDN 방식 -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	#wrap{ width: 550px; margin: auto;}
	#wrap table { width:  100% }
</style>
<script type="text/javascript">

/* 
setTimeout
code : 일정시간 후 실행시킬 자바스크립트 코드를 포함한 문자열

delay : 문자열 code 내에 있는 자바스크립트 코드가 실행되기까지 걸리는 시간 (1/1000초 단위)
*
*/
// 내 코드 
/* var flag=true;
	$(function (){
		setInterval(f1, 400);
	});
	
	function f1() {
		if (flag) {
			$('.item').css("color","blue");
			$('.item.select').css("color","red");
			flag=false;
		} else {
			$('.item').css("color","red");
			$('.item.select').css("color","blue");
			flag=true;
		}
	} */
	
	
	// 강사님 코드 -> 
	var num = false;
	$(function () {
		$('.item').css("color","blue");
		$('.item.select').css("color","red");
		setTimeout(test, 500);
	});
	$(function test() {
		$('.item').css("color","red");
		$('.item.select').css("color","blue");
		setTimeout(test2, 500);
	});
	$(function test2() {
		$('.item').css("color","blue");
		$('.item.select').css("color","red");
		setTimeout(test, 500);
	});
	
	
	
</script>
</head>
<body>
	<div id ="wrap">
		<table>
			<tbody>
				<tr>
					<td class="item"> TEST 내용입니다 </td>
				</tr>
				<tr>
					<td class="item select"> TEST 내용입니다 </td>
				</tr>
				<tr>
					<td class="item"> TEST 내용입니다 </td>
				</tr>
				<tr>
					<td class="item select"> TEST 내용입니다 </td>
				</tr>
				<tr>
					<td class="item"> TEST 내용입니다 </td>
				</tr>
			</tbody>
		</table>
	
	</div>
</body>
</html>