<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#warp {
	width: 500px;
	margin: auto;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
	<div id="wrap" class="container" >
		<fieldset>
			<legend>MiniboardDetail</legend>
			<p>
				<label>번호</label>
				${vo.num}
			</p>
			<p>
				<label>제목</label>
				<s:property value="vo.sub"/>
			</p>
			<p>
				<label>내용</label>
				<s:property value="vo.cont" escapeHtml="false" escapeJavaScript="ture"/>
			</p>
			<p>
				<label>작성자</label>
				<s:property value="vo.writer"/>
			</p>
		</fieldset>
			<a href="javascript:location='list'">리스트</a>
	</div>
</body>
</html>