<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.dd{border-color: red; border: 1px solid;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- CDN 방식 -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript">
	
	$(function (){
		var resultText = "";
		var $searchEls= $('p,span,div,.simpletext1'); // JQuery 변수
		// 집합 요소의 갯수 를 반환
		resultText += " 검색된 엘리멘트 갯수"+$searchEls.size()+"\n";
		console.log(resultText);
		// 배열데이터, 집합 요소들을 반복하는 each
		$searchEls.each(function(index) {
			resultText += $(this).html() + ":" + index + "\n" 
			// 짝수에 해당될때 boarder의 색상을 red로 변경시켜보기
			if ( index % 2==0) {
				$(this).css({ 'border':'red 1px solid'});
				console.log($(this));
			}
			//  $(this) 는 $searchEls에 저장된 엘리멘트 객체들의 주소값
		});
			console.log(resultText);
	});
</script>
</head>
<body>
	<span> SIMPLE</span>
	<div class="simpletext1">SIMPLE TEXT </div>
	<div> Basic</div>
	<p> Example</p>
</body>
</html>