<%-- 
    Document   : write.jsp
    Created on : 2010. 4. 30, 오후 2:20:59
    Author     : 3강의장
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="//cdn.ckeditor.com/4.5.4/standard/ckeditor.js">	
</script>
<script type="text/javascript">
window.onload = function(){ CKEDITOR.replace( 'content' );};
</script>

<title>list.jsp</title>
</head>
<body>
	<div class="container">
		<!-- row = 6 설정 -->
		<form method="post" action="boardinsert" name="f" id="f">
			<table border="1" align="center" width="450">
				<thead>
					<tr>
						<th colspan="2">게시판 작성 폼</th>
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
						<td colspan="2"><a href="javascript:sendForm()">글작성</a>
							&nbsp; <a href="javascript:goList('list.do','')">글작성</a></td>
					</tr>
				</tbody>
			</table>
		</form>
		<script type="text/javascript">
			// form유효성 검사 이후 폼의 데이터를 전송하는 스크립트
			function sendForm() {
				// 여기서 나중에 지난 시간에 했던 유효성 검사
				document.getElementById("f").submit();
			}
			function goList(url, param) {
				if (!param)
					url = url;
				else
					url = url + "?" + param;
				location = url;
			}
		</script>
	</div>
</body>
</html>
</body>
</html>