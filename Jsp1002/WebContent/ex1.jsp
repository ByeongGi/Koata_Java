<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
var xhr;
function test() {
	// 현재 브라우저의 따라서 생성 
	if (window.ActiveXObject) {
		xhr = new ActiveObject("Microsoft.XMLHTTP"); // 익스플로러 10 이전
	} else {
		xhr = new XMLHttpRequest(); // 모질라 , 크롬 , 파이어 폭스 계열
	}
	var s = document.getElementById("subject").value;
	var param = "subject="+s;
	// 서버로 부터 결과가 도착 할때 수행하는 함수 지정 
	xhr.onreadystatechange = res; // 콜백함수 지정 
	// 서버에게 호출하기 위한 준비
	xhr.open("GET", "controller?cmd=ajaxtest&"+param, true);
	// 전송 방식 , 주소 , 비동기식(true)/ 동기식(false)
	// xhr.open("post","controller?cmd=ajaxtest&");
	// xhr.setRequsetHeader("Content-Type","aplication/x-www-urlencoded");
	// 서버에게 요청 보내기 
	xhr.send(null);
	// 우린 get 방식으로 보내기로 했기 때문에 인자는 반드시 null 이어야 하고 , 만약 
	// post 라면 null이 아니라, 보내고자 하는 파라미터를 문자열로 넣어야 한다.
	// xhr.send(s);
}

// 서버로부터 전달되는 결과가 도착하는 메서드

function res() {
	if (xhr.readyState==4) { // 서버로부터 데이터 처리가 완료된 경우
		if (xhr.status==200) { // 정상적인 처리인 경우 
			var txt = document.getElementById("txt");
			txt.innerHTML = xhr.responseText;
			// alert(xhr.responseTest);
		}else{
			alert("실패"+xhr.status);
		}
	}	
}
</script>
</head>
<body>
	<center>
		과목 : <input type="text" name = "subject" id = "subject" />
				<input type="button" onclick="test()" value="AJAX테스트"/>
				<p> 관련 시험:
				<div id="txt" ></div>
	</center>
</body>
</html>