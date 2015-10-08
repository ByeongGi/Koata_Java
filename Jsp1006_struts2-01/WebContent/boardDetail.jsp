<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
<title>list.jsp</title>
</head>
<body>

	<div id="wrap" class="table-responsive">
		<table class="table table-striped">
			<thead>
				<tr>
					<th colspan="2">이미지 게시판</th>
				</tr>
			</thead>


			<tbody>
				<tr>
					<td>제목</td>
					<td><input type="text" name="title" id="title"
						value="<s:property value='vo.title'/>" /> <s:property
							value='vo.title' /></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><input type="text" name="writer" id="writer"
						value="<s:property value='vo.writer'/>"></td>
				</tr>
				<tr>
					<td>이미지</td>
					<td><img src="upload/<s:property value='vo.img'/>"></td>
				</tr>

				<tr>
					<td>내용</td>
					<td><textarea rows="10" cols="55" name="content" id="content"
							value="<s:property value='vo.content'/>"></textarea></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2">&nbsp; <input type="button" value="리스트"
						onclick="javascript:location=boardlist2"></th>
				</tr>
			</tfoot>
		</table>

	</div>
</body>
</html>