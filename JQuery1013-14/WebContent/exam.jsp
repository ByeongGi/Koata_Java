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
var interval; // interval 함수
var num = 10; // 시간 초기화 
var ischk=false; // 체크 상태 
var chNum; // radio 에서 체크한 값 저장 

// Timer 함수 
function timer() {
	if (num<=0) {
		clearInterval(interval);		
	}
	$('#time').html(num--);
	
}

$(function() {
	interval=setInterval(timer, 1000);
	interval(); // 문서가 로딩 되면 interval 시작 
});


function insert() {
	var ch1v=$('#ch1').is(':checked');
	var ch2v=$('#ch2').is(':checked');
	// console.log("LOG Ch1 = " + ch1v +"   :   Ch2 =" + ch2v);
	if (ch1v) chNum =1 ;
	if (ch2v) chNum =2 ;
	res(chNum);
	
	
}

function res(result) {
	if (result==1){
		$('#time').html("오답입니다!");
		$('#resImg').html('<img  src="img/lost.jpg">');
	}
	if (result==2){
		$('#time').html("정답입니다!");
		$('#resImg').html('<img  src="img/win.jpg">');
	}
	$('#btn1').prop('disabled',"disabled");
	clearInterval(interval);
	
}

</script>
</head>
<body>
	
	<div>
		<p id="time">time</p> <br>
	</div>
	<div>
		<p> 오늘을 월요일 입니까? </p> 
		<input type="radio" name="data" id="ch1">월요일
		<input type="radio" name="data" id="ch2">화요일
		<button type="button"  onclick="insert(this)" id="btn1" >정답 제출</button>
	</div>
	
	<div id="resImg"></div>
</body>
</html>