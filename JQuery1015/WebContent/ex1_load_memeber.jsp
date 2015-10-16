<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 

JQuery AJAX 
1. var xhr 
2. callback
3. open
4. send
5. responseText,responseXML
JQuery 는 DOM 구조를 통제 , Ext.js Object 중심
=> $.get , $.ajax , $.load

--%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Cache-Control" content="No-Cache">
<meta http-equiv="Pragma" content="No-Cache">
<title>Insert title here</title>
<!-- CDN 방식 -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<style type="text/css">
	#warp{ width: 350px; margin: auto;}
</style>
<script type="text/javascript">
	$(function() {
		$('#id').keyup(function() {
			console.log($(this).val());
			var $val =$(this).val()
			if ($val.length>0) {
			$('#target').load('idk.jsp?id='+$(this).val());
			}
		});
	});
</script>
</head>
<body>
	<form action="mem.jsp" method="post">
		<table>
			<tr>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>
				<!-- autocomplete - HTML5 속성 : 자동완성 꺼주는 기능  -->
				<input type="text" name="id" id="id"/ autocomplete="off">
				<div id="target" ></div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>