<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 
 EXAM JQuery 
 setInterval, selector 이용
 2015 10. 14 by Byeong Gi Kim

 --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- CDN 방식 -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript">

// 1. 입력한 값을 받는다.
// 2. 해당 값을 가진 val() 함수로 해당 노드 자식을 찾는다 
var nodeNum;
var inter;
function start() {
	var input=$('#txt1').val();
	console.log("LOG INPUT :::"+input);
	changeCss(input);
} // end start()

function changeCss(input) {
	var $node1 =$('body div').children(); // 자식 노드집합
	console.log("LOG $node1 :::"+$node1.size());
	
	
	 $node1.each(function(index) {
		var $nodeText =$node1.eq(index).text(); // 해당 자식의 val 값을 반환 
		var $nodeCh= $node1.eq(index);
		if (input==$nodeText) nodeNum = index; 
		// input 값과 자식의 val 값을 일치하는 nodeNum 를 구함
	 });
		console.log("LOG :::"+nodeNum);	
	 
		inter=setInterval(callbackf1, 500); // setInterval -> 등록한 함수를 0.5초마다
		inter();// 함수 실행					// 지속적으로 실행

} // end changeCss()

	var num=0;
function callbackf1(){
	var $node1 =$('body div').children(); // 자식들의 노드 주소 반환 
	if (num < $node1.size()) { // 자식의 수는 6  num 의 값은 0임
	if (nodeNum==num){ // 사용자가 입력한 값과 일치한 nodeNum 의 자식만 다른색
		$node1.eq(nodeNum).css('background','pink')
	}else{ // 나머지는 레드로 변화줌 
	$node1.eq(num).css('background','red');
	}
	++num;
	}
	if (num==$node1.size()) clearInterval(inter); 
	// callback 함수를 더이상 동작시키지 않음
} // end callbackf1()
</script>
</head>
<body>
<div>
	<em>One</em>
	<a>Two</a>
	<a>Three</a>
	<b>Four</b>
	<a>Five</a>
	<a>Six</a> 
</div>
	<hr>
	<input id="txt1" type="text">
	<button type="button" id="btn1"onclick="start()">동작</button>
</body>
</html>