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

// 자바스크립트 배열선언과 초기화
var arr= ["사과", "배" , "오렌지" ,"바나나"];
$(function() {
	var str ="배"
	// 배열이 해당값에 포함되면 배열의 인덱스를 반환해주는 함수 , -1
	var $idx= $.inArray(str,arr);
	console.log("index :::",$idx);
	if ($idx > -1) {
		$('div').html("<p style='color:red'>"+arr[$idx]+"</p>");
	}
});
</script>
</head>
<body>
	<div></div>
	
</body>
</html>