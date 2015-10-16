<%-- 
	AJAX DATA JQEURY로 다루기 
	@ Author : Byeong Gi Kim
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP Page</title>
<style>
.on {background: orange}
</style>
<!-- CDN 방식 -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script>
	
	// load 메서드를 사용한 Ajax
	$(document).ready(function() {
		// 1. 버튼 객체의 주소값을 가져온다.
		var $btn1 =$('.menu input').eq(0);
		var $btn2 =$('.menu input').eq(1);
		
		// 2. 버튼에 Click Listener 등록한다.
		$btn1.click(function() {
			console.log("LOG ::: Button1");
			loadData('Click1');
		});
		
		$btn2.click(function() {
			console.log("LOG ::: Button2");
			loadData('Click2');
		});

		
	}); // end ready()
	
	function loadData(btnId) {
		// 3. 로드한 데이타 중에 li 엘리멘트만 DATA로 로드한다.
		$('#new-projects').load('ex3_LoadData.jsp?num='+ btnId +' li',function(responseText,status,xhr){ 
			console.log("LOG DATA ::: " + responseText); // 데이터를 확인한다.
			console.log("LOG STATUS ::: " + status); // 상태를 확인한다.
			if (status =='error') {
				alert("DATA 전송에 실패했습니다!");
			}
		});
	} // loadData()
	
</script>
</head>
<body>
	<div class="menu">
		<input type="button" value="Click1"> 
		<input type="button" value="Click2"><br />
	</div>
	<b>Projects:</b>
	<ol id="new-projects"></ol>
</body>
</html>