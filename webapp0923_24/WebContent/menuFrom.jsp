<!--2015 년 2015. 9. 23.  오후 3:23:24 Auth by Byeong Gi Kim   -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
a:link, a {
	text-decoration: none;
	color: white
}

#wrap {
	width: 80;
	margin: auto;
}

#menu {
	width: 100%;
	margin: auto;
}

#menu ul {
	padding: 10px
}

#menu ul li {
	width: 100px;
	text-align: center;
	list-style: none;
	float: left;
	background: red;
	margin-left: 10px;
	height: 30px
}

#menu ul li:hover {
	background: green;
	color: #ffffff
}

#content {
	clear: both;
	width: 100%;
	background: green;
	height: 300px
}


</style>
<script type="text/javascript">
	// 자바스크립트 배열 
	var orderV = new Array(new Array("--선택--"), new Array("초밥", "우동", "돈부리",
			"가라아케", "라멘", "타코야끼"), new Array("밥", "김치찌개", "불고기", "갈비찜", "비빔밥",
			"용봉탕"), new Array("짜장밥", "탕수육", "도미구이", "갈비찜", "불도장", "팔보채"),
			new Array("라면", "라볶이", "쫄면"),
			new Array("돈까스", "비프까스", "스테이", "파스타")

	);

	var temp;
	var oSelect;
	// 현재 함수의 성질 : mcode에서선택한 인덱스에 해당되는
	// 배열의 인덱스 값을 기준으로 배열값을 가져와서 select 에 배치하는 함수 
	// 함수 동작시에 item 값으로 1이 들어 갔으면 배열의어떤 데이터가 나올까 ?
	function getCook(item) {
		temp = document.getElementById("mname");
		var subCnt = temp.options.length;
		console.log("Log0 : " + subCnt);
		console.log("Log1 : " + orderV[item].length);
		// select의 Option 객체를 초기화 시켜주기 위해서 반복문
		for (var i = (subCnt - 1); i > 0; i--) {
			temp.options[i] = null;
		}
		// 배열에서 해당되는 인텍스를 얻어낸 배열값을 반복하면서 
		// option에 배치
		for (var j = 0; j < orderV[item].length; j++) {
			oSelect = orderV[item][j];
			temp.options[j] = new Option(oSelect, oSelect); // key(옵션에서 보여지는 값) , value
		}
	}

	window.onload = function() {
		document.getElementById("mcode").onchange = function() {
			// select 에서 선택한 인덱스 값을 말한다.
			getCook(this.options.selectedIndex);
		}
	}
</script>
<body>
	<div id="wrap">
		<div id="menu">
			<ul>
				<li><a href="">메뉴등록</a></li>
				<li><a href="">메뉴리스트</a></li>
				<li><a href="">주문하기</a></li>
				<li><a href="">주문리스트</a></li>
				<li><a href="">기타</a></li>
			</ul>
		</div>
		<!-- Content 영역 시작 -->
		<div id="content">
			<form method="post" action="menuAdd.jsp">
				<table>
					<tr>
						<td colspan="2">메뉴 등록품
						<td>
					</tr>
					<tr>
						<th>분류</th>
						<td><select name="mcode" id="mcode">
								<option>-- 선택 --</option>
								<option value="JP">일식</option>
								<option value="KR">한식</option>
								<option value="CH">중식</option>
								<option value="BS">분식</option>
								<option value="YS">양식</option>
						</select> <select name="mname" id="mname">
								<option>-- 선택 --</option>
						</select></td>
					</tr>
					<tr>
						<th>가격</th>
						<td><input type="number" step="1000" min="10000" 
						id="mprice" name= "mprice" value="10000" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="등록"></td>
					</tr>
				</table>

			</form>
			<!-- Content 영역 끝 -->
		</div>

	</div>
</body>
</html>