<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<%-- 
insert into article values(article_seq.nextVal, #{group_id}, #{sequence_no}, 
sysdate, #{read_count}, #{writer_name}, #{password}, #{title}, #{content}
) 
		
--%>
	
<div id="wrap" class="table-responsive">
	<form action="" method="post">
		<table class="table table-striped">
			<thead>
				<tr>
					<th colspan="2"> 쓰기</th>
				</tr>
			</thead>
			<tbody>
				
				<tr>
					<td> 그룹번호 </td>
					<td><input type="text" id="group_id"> </td>
				</tr>
				<tr>
					<td> 시퀀서 번호 </td>
					<td><input type="text" id="sequence_no"> </td>
				</tr>
				<tr>
					<td> 읽은수 </td>
					<td><input type="text" id="read_count"/></td>
				</tr>

				<tr>
					<td> 비밀번호 </td>
					<td> <input type="password" id="password"/></td>
				</tr>

				<tr>
					<td> 제목 </td>
					<td><input type="text" id="title" /></td>
				</tr>

				<tr>
					<td>내용</td>
					<td><input type="text" id="content" /></td>
				</tr>

				<tr>
					<td></td>
					
				</tr>
			</tbody>
			<tfoot>
				<tr>

				</tr>
				<tr>
					<th colspan="2">&nbsp; <input type="button" value="게시글 목록으로 가기 "
						onclick="goUrl('')" /></th>
				</tr>
			</tfoot>
		</table>
	</form>
	</div>
</body>
</html>