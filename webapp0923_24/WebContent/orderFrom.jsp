<!--2015 년 2015. 9. 24.  오후 1:35:37 Auth by Byeong Gi Kim   -->
<%@page import="vo.MenuVo"%>
<%@page import="dao.OrderMenuDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	
	
	function chk1(obj) {

		// console.log(obj.options.selectedIndex);
		var mcode = obj.options[obj.options.selectedIndex].value; 
		// 선택된 옵션객체의 주소값을 가져옴
		var orderlist =document.getElementById("orderlist").options;
		// 주문셀렉터의 옵션 객체의 배열을 가져옴 
		
		// 0 ~ 10  1 <= j< 11
		// --선택-- 을 제거한 길이까지 for문을 실행 
		for (var j = 1; j < orderlist.length; j++) { // 현재 옵션객체 배열의 길이
			document.getElementById("orderlist").options[j].hidden=true;
		}
		// 0 ~ 3 1<= i < 4
		for (var i = 1; i < orderlist.length; i++) { 
			var arr=(orderlist[i].value).split("/"); // 메뉴코드/메뉴번호/메뉴가격
			console.log(arr[0]); // 메뉴코드(JR,CH,BS 등인지 )
			if (mcode==arr[0]) {
				document.getElementById("orderlist").options[i].hidden=false;
			}
			
		}
		
	}
	
	var orderprice=0; // 상품 가격 저장 
	function chk2(obj) {

		// console.log(obj.options.selectedIndex);
		// orderList option 객체 중에 선택된 번호
		var data = obj.options[obj.options.selectedIndex].value;
		console.log("LOG : "+data);
		// split 로 / 로 문자 배열로 잘라냄 
		
		var dataArr = data.split("/");
		
		// 각각 option에 저장된 값을 불러옴 
		var mno = dataArr[1];
		var mname = obj.options[obj.options.selectedIndex].innerHTML;
		var mprice = dataArr[2];
		
		// 저장한 값을 각각의 다른 엘리멘트 요소에 반영
		document.getElementById("pno").innerHTML= mno;
		document.getElementById("mno").value=mno; // 메뉴 번호 
		document.getElementById("pname").innerHTML= mname+"/"+mprice;
		orderprice=document.getElementById("orderprice").step= mprice;
		// console.log("상품번호" + mno + "상품가격" + mprice);
	}
	
	// 주문 수량 input 요소 가격의 값을 가져와서 갱신
	function orderpricechk() {
		 var orderqty=document.getElementById("orderqty").value 
		 document.getElementById("orderprice").value="";
		 document.getElementById("orderprice").value = orderqty*orderprice;
	}
	
</script>
</head>
<body>
<%@include file="top.jsp" %>
	
	<div class="container">
		<form action="orderAdd.jsp" class="input-group">
			<div class="container">
			<label>주문 상품 선택</label> 
			<select name="mcode" id="mcode" onchange="chk1(this)">
				<option>-- 선택 --</option>
				<option value="JP">일식</option>
				<option value="KR">한식</option>
				<option value="CH">중식</option>
				<option value="BS">분식</option>
				<option value="YS">양식</option>
			</select> 
			
			<select name="orderlist" id="orderlist" onchange="chk2(this)">
				<!-- 데이터 반복영역  -->
				<option value>-- 선 택 --</option>
				<%
					List<MenuVo> list = OrderMenuDao.getDao().getMenuList();
					for (MenuVo vo : list) {
				%>
				<option value='<%=vo.getMcode()%>/<%=vo.getMno()%>/<%=vo.getMprice()%>' 
				hidden="<%=vo.getMcode() %>" >
					<%=vo.getMname() %>
				</option>
				<%
					}
				%>
				<!-- 데이터 반복영역  -->
			</select> 
			<br>
			</div>
			
			<div class="container">
			<label>주문 상품 정보 -</label> 
			<label>상품 번호 :</label><label id="pno">  </label> <br>
			<label>상품 이름 :</label><label id="pname">  </label> <br>
			<input id ="mno" name= "mno" type="text" hidden="">
			<label>주문자 : </label><input name ="oname" type="text" ><br>
			<label>주문 수량 : </label><input id="orderqty" name = "qty" type="number" 
			step="1" min="1" value="1" onchange="orderpricechk()"> <br>
			<label>주문 가격 : </label><input id="orderprice" type="text" >
			<br> <input type="submit" value="주문">
			</div>
		</form>
	</div>
</body>
</html>