<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/board.js"></script>
<title>list.jsp</title>
</head>
<body>
	
	<div id="wrap" class="table-responsive">
		<table class="table table-striped">
			<thead>
				<tr>
					<th colspan="2">VIEW</th>
					<td>번호</td>
					<td>이름</td>
					<td>제목</td>
					<td>아이피</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="vo" var="data">
					<tr>
						<td>${data.pname}</td>
					</tr>
					<tr>
						<td></td>
					</tr>
					<tr>
						<td></td>
					</tr>
	
					<tr>
						<td></td>
					</tr>
				</c:forEach>

					
			</tbody>
			<tfoot>
				<tr>

				</tr>
				<tr>
					<th colspan="2">&nbsp; <input type="button" value="리스트"
						onclick="goUrl('boardlist2')" /></th>
				</tr>
			</tfoot>
		</table>
	</div>
	

</body>
</html>