<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
				<th>조회수</th>
				<th>작성일</th>
				
			</tr>
			<s:iterator value="list" status="stat">
				<s:url action="view" id ="goView">
					<s:param name="no" value="no" />
				</s:url>
				<tr>
					<td align="center"> ${stat.count} </td>
					<td>		
					<!-- 답변글일 경우 제목에 공백 처리 -->
						
					<s:a href="%{goView}">
					<c:forEach begin="1" end ="${lvl}" >
						&nbsp;&nbsp;&nbsp;
					</c:forEach>
					<s:if test="%{lvl} != 0">
						<img alt="" src="images/re.PNG" border="0">
					</s:if>
					<s:property value="subject" /></s:a>
					</td>
					<td><s:property value="writer" /></td>
					<td align="center"><s:property value="hit" /></td>
					<td><s:property value="regdate" /></td>
				</tr>
			</s:iterator>
			<tr>
				<th colspan="5">
					<s:url id="goWrite" action="writer"></s:url>
					<s:a href="%{goWrite}">글작성</s:a>
				</th>
			</tr>
			
		</table>
	</div>



</body>
</html>