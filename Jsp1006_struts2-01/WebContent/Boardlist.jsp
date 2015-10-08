<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
<title>list.jsp</title>
<style type="text/css">
	#wrap {width: 600px; margin: auto;}
	/* table{width: 100%;}
	thead tr td {border: 1px solid; color: white;font-weight: bold;}
	tbody tr th {border: 1px solid;}
	tfoot tr th {border: 1px solid;} */
	img{width: 100px; height: auto;}
</style>
<script type="text/javascript">
	function goUrl(url) {
		location = url;
	}
</script>
</head>
<body>
	list 페이지 !
	<div id="wrap" class="table-responsive">
		<table class="table table-striped">
			<tr>
				<th colspan="6">미니 게시판 리스트</th>
			</tr>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>내용</th>
				<th>날짜</th>
				
			</tr>
			<s:iterator value="list">
				<tr>
					<td><s:property value="no" /></td>
					<td><img src="upload/<s:property value='img'/>" ></td>
					<td><a href='boardDetail?no=<s:property value="no"/>' ><s:property value="title" /></a></td>
					<td><s:property value="writer" /></td>
					<td><s:property value="content" /></td>
					<td><s:property value="hit" /></td>
					<td><s:property value="regdate" /></td>
					
				</tr>
			</s:iterator>
			<tr>
				<th colspan="6">
					<s:property value="pagingCode" escape="false"/>
				</th>
			</tr>
			<tr>
				<td colspan="6"><button class="btn btn-primary" onclick="goUrl('bform')">게시판 폼</button> </td>
			</tr>
		</table>
	</div>



</body>
</html>