<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="${pageContext.request.contextPath}/img/${vo.mfile}"> <br>
	제목: ${vo.sub}
	작성자 : ${vo.writer}  <br>
	내용 : ${vo.content}  <br>
	비밀번호 : ${vo.pwd}  <br>
	<div>
		<a href="uplist.kosta">LIST로 갑니다!</a>
	</div>
</body>
</html>