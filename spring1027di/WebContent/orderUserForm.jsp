<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>orderUserForm</title>
</head>
<!-- 
	orderProcess.jsp 에서 useBean을 사용해서 값을 Vo에 저장하고 
	받은 파라미터를 printMenu(vo)란 형식으로 호출해서 출력형태
	출력 형태 -- 
		주문자 : 김길동
		제품명 : 노트북
		가격 : 100000 원
		총 가격 : 300000원 입니다.
		(필수 MyInter에 해당 order(OrderVo vo) 란 메서드를 정의한다.

 -->
<body>
	<div id="wrap">
		<form action="orderProcess.jsp" method="post">
			이름 : <input type="text" name="name" /> </br>
			제품명 : <input type="text" name="orderName" /> </br>
			가격 : <input type="text" name="price"/> </br>
			갯수 : <input type="text" name="quant"/> </br>
			<input type="submit" value="submit" />
		</form>
	</div>
</body>
</html>