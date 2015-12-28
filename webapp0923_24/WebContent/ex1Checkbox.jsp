<!--2015 년 2015. 9. 23.  오후 2:13:11 Auth by Byeong Gi Kim   -->
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function chk(ch) { // Btn 버튼을 클릭할때 , value를 토글의 기준으로 
	// 체크 박스 객수를 모두 true (체크 ) / false(언 체크) 하는 함수 
	if (document.getElementById("btn").value=="CheckAll") {
		for (var j = 0; j < ch.length; j++) {
			ch[j].checked = true;
			document.getElementById('btn').value="UnCheckALL";
		}
	} else {
		for (var i = 0; i < ch.length; i++) {
			ch[i].checked = false;
			document.getElementById('btn').value="CheckAll";
		}
		
	}
	
}

</script>
</head>
<body>
<%
	Map<String,String> map = new HashMap<String,String>();
	map.put("dog","개");
	map.put("cat", "야옹이");
	map.put("pig", "꿀꿀이");
	map.put("foal", "망아지");
	map.put("sheep", "양");
%>
<div style="width: 500px; margin: auto;">
	<form action="ex1Checkbox.jsp" method="post" id= "f" name="f">
		<input type="button" value="CheckAll" id ="btn" 
		onclick="chk(document.f.pet)" > <br>
		<%
		
		for(Map.Entry<String,String> e: map.entrySet()){
		%>		
		<input type="checkbox" name="pet" value ="<%=e.getKey() %>" >
		<%=e.getValue() %> <br>
		<%
		}
		%>		
	</form>
</div>
</body>
</html>