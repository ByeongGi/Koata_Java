<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
	<!-- 사용자의 바이너리 데이터를 서버로 전송할 때 폼 양식 : enctype
			이 때 전송방식은 반드시 post여야 한다. 관계 type="file"- -->
	<form action="uploadres" method="post"
	enctype="multipart/form-data"	><table>
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
				<select name="groupno">
						<option value="">선택</option>
						<option value="100">100번</option>
						<option value="200">200번</option>
						<option value="300">300번</option>
						<option value="400">400번</option>
						<option value="500">500번</option>
				</select></td>
				<tr>
					<td>내용</td>
					<td><textarea rows="10" cols="55" 
					name="context" id="context"></textarea></td>
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