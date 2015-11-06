<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<a href="upform.kosta">FORM 으로 갑니다!</a>
	</div>
	<div>
		<table style="border-style: solid;">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>내용</th>
					<th>이미지</th>
					<th>다운로드</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="vo">
				<tr>
					<td>${vo.num}</td>
					<td><a href="upDetail.kosta?num=${vo.num}">${vo.sub}</a></td>
					<td>${vo.writer}</td>
					<td>${vo.content}</td>
					<td><img src="${pageContext.request.contextPath}/img/${vo.mfile}" style="width: 200px; height: auto;"></td>
					<td><a href="fileDown.kosta?fileName=${vo.mfile}">down</a></td>
				</tr>
				</c:forEach>				
			</tbody>
		</table>
		
		
	</div>
	
	
</body>
</html>