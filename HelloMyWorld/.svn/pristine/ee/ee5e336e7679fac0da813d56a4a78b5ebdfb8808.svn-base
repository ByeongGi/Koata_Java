<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP Page</title>
</head>
<body>
	<table border="1" align="center" width="550">
		<thead>
			<tr>
				<th>글 번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" status="stat">
				<s:url action="view" id="goView">
					<s:param name="article_id" value="article_id" />
				</s:url>
				<tr>
					<td align="center">${stat.count}</td>
					<td>
					 <s:a href="%{goView}">
						<%-- 답변글일경우 제목에 공백을 처리 
							<c:forEach begin="1" end="${lvl}">
                            &nbsp;&nbsp;&nbsp;
                        </c:forEach>
							<s:if test="%{lvl != 0}">
								<img src="images/re.PNG" border="0" />
							</s:if>
							--%>
							<s:property value="title" />
						</s:a>
					</td>
					<td><s:property value="writer_name" /></td>
					<td align="center"><s:property value="read_count" /></td>
					<td><s:property value="posting_date" /></td>
				</tr>
			</s:iterator>
			<tr>
				<td colspan="5"><s:url id="goWrite" action="" /><s:a
						href="%{goWrite}">글작성</s:a></td>
			</tr>
		</tbody>
	</table>
</body>
</html>