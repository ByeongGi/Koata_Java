<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="contaier">
		<form action="reply_In" method="post">
			<input type="text" name="ref" value="${ref}" /> 
			<input type="text" name="seq" value="${seq+1}" /> 
			<input type="text" name="lvl" value="${lvl+1}" />
			<table class="table">
				<thead>
					<tr>
						<th>답변글 작성폼</th>
					</tr>
				</thead>
				<tbody>
				<tr>
						<td>제목</td>
						<td><input type="text" name="subject" id="subject" /></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td><input type="text" name="writer" id="writer" /></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" name="pwd" id="pwd" /></td>
					</tr>
					<tr>
						<td>내용</td>
						<td>
						
						<textarea name="content" id="content" rows="5" cols="15">
                            </textarea></td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="reply insert">
						</td>
					</tr>
				</tbody>

			</table>
		</form>
	</div>
</body>
</html>