<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>list.jsp</title>
</head>
<body>
	<div id="wrap" class="table-responsive">
	<!-- 사용자의 바이너리 데이터를 서버로 전송할 때 폼 양식 : enctype
			이 때 전송방식은 반드시 post여야 한다. 관계 type="file"- -->
	<form action="uploadres" method="post"
	enctype="multipart/form-data"	>
		<table class="table table-striped">
			<thead>
				<tr>
					<th colspan="2">이미지 게시판</th>
				</tr>
			</thead>


			<tbody>
				<tr>
					<td>제목</td>
					<td><input type="text" name="title" id="title"></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><input type="text" name="writer" id="writer"></td>
				</tr>
				<tr>
					<td>이미지</td>
					<td><input type="file" name="upload" id="upload"></td>
				</tr>
				<td>그룹번호</td>
				<td>
				<select name="groupno" id="groupno">
				
						<option name= "groupno" value="">선택</option>
						<option name= "groupno" value="100">100번</option>
						<option name= "groupno" value="200">200번</option>
						<option name= "groupno" value="300">300번</option>
						<option name= "groupno" value="400">400번</option>
						<option name= "groupno" value="500">500번</option>
				</select></td>
				<tr>
					<td>내용</td>
					<td><textarea rows="10" cols="55" 
					name="content" id="content"></textarea></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2"><input type="submit" value="글작성">&nbsp;
						<input type="button" value="리스트"></th>
				</tr>
			</tfoot>
		</table>
		</form>
	</div>
</body>
</html>