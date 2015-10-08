<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#wrap {
	width: 800px;
	margin: auto;
}
#wrap2 {
	width: 800px;
	margin: auto;
}
</style>
<script type="text/javascript" src="js/httpRequest.js"></script>
<script type="text/javascript">

	function del(num) {
		if (confirm("정말로 삭제를 하시겠습니까?")) {
			location = "command?cmd=memdelete&num=" + num;
		}
		// alert(num);

	}

	function update(num) {
		location = "command?cmd=memupdate&handler=form&num=" + num;
	}
	
	
	function search() {
		var name = document.getElementById("search").value;
		name=encodeURI(name);
		var url = "command?cmd=findMember&name="+name;
		sendRequest(url, null, res, "get");
	}

	function res() {
		if (xhr.readyState==4) {
			if (xhr.status==200) {
				var res = xhr.responseText;
				document.getElementById("t1").innerHTML="";
				document.getElementById("t1").innerHTML+=res;
				console.log(res);
				
			} else {
				alert("실패" +xhr.status);
			}
		}
	}
</script>
</head>
<body>
	<div id=wrap>
		<table style="border: 1px solid;">
			<tr style="border: 1px solid;">
				<td>번호</td>
				<td>이름</td>
				<td>주소</td>
			</tr>
			<c:forEach items="${list}" var="data">
				<tr style="border: 1px solid;">
					<td>${data.num}</td>
					<td>${data.name}</td>
					<td>${data.roadAddress}</td>
					<!--  td><a href="command?cmd=memdelete&num=${data.num}" >삭제<a></td-->
					<td><a href="javascript:update('${data.num}')">수정<a></td>
					<td><a href="javascript:del('${data.num}')">삭제<a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="4"><a href="memberjoin.jsp">가입폼</a></td>
			</tr>
		</table>
	</div>
	<div id=wrap2>
		<table style="border: 1px solid;">
			<tr>
				<td colspan="2">이름 :<input type="search" id= "search" /></td>
				<td><input type="button" value = "찾기" onclick="search()" /></td>
			</tr>
			<tr style="border: 1px solid;">
				<td>번호</td>
				<td>이름</td>
				<td>주소</td>
			</tr>
		</table>
		<table style="border: 1px solid;" id="t1">
		</table>
		
	</div>
</body>
</html>