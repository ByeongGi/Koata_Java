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
<script type="text/javascript" src="js/board.js"></script>
<title>list.jsp</title>
</head>
<body>

	<div id="wrap" class="table-responsive">
		<table class="table table-striped">
			<thead>
				<tr>
					<th colspan="2">VIEW</th>
				</tr>
			</thead>


			<tbody>
				<tr>
					<td>번호</td>
					<td><s:property value='vo.no' /></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><s:property value='vo.writer' /></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><s:property value='vo.subject' /></td>
				</tr>

				<tr>
					<td>아이피</td>
					<td><s:property value='vo.reip' /></td>
				</tr>

				<tr>
					<td>읽은수</td>
					<td><s:property value='vo.hit' /></td>
				</tr>

				<tr>
					<td>내용</td>
					<td><s:property value='vo.content' escapeHtml="false" /></td>
				</tr>

				<tr>
					<td></td>
					<td><s:url id="goReply" action="reply">
							<s:param name="ref" value="vo.ref" />
							<s:param name="seq" value="vo.seq" />
							<s:param name="lvl" value="vo.lvl" />
						</s:url> <s:url id="goUp" action="">
							<s:param name="no" value="vo.no" />
						</s:url> <s:url id="goDel" action="">
							<s:param name="no" value="vo.no" />
						</s:url> <s:url id="goList" action="boardlist2">
							<s:param name="no" value="vo.no" />
						</s:url> <s:a href="%{goUp}">수정</s:a> <s:a href="%{goDel}">삭제</s:a> <s:a
							href="%{goReply}">답변</s:a> <s:a href="%{goList}">리스트</s:a></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>

				</tr>
				<tr>
					<th colspan="2">&nbsp; <input type="button" value="리스트"
						onclick="goUrl('boardlist2')" /></th>
				</tr>
			</tfoot>
		</table>
	</div>
	<div class="contaier">
		<form action="commIn" method="post">
			<input type="hidden" name="no" value="${vo.no}"/>
			<table class="table">
				<tr>					
					<td>내용<input type="text" name="comm" /></td>
					<td>작성<input type="text" name="writer" /></td>
					<td>비밀번호<input type="password" name="pwd" /></td>
				</tr>
				<tr>					
					<td>작성<input type="submit" value="글작성" /></td>
				</tr>

			</table>
		</form>
	</div>
	<div class="contaier">
		<form action="commIn" method="post">
			
			<table class="table">
				<tr>
					<td>내용</td>
					<td>작성자</td>
					<td>날짜</td>
				</tr>
				<s:iterator value="list" status="stat">
					<tr>
						<td><s:property value="comm" /></td>
						<td><s:property value="writer" /></td>
						<td><s:property value="regdate" /></td>
					</tr>
				</s:iterator>
			</table>

		</form>
	</div>

</body>
</html>