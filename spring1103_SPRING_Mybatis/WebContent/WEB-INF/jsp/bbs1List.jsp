<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<table style="border-style: solid;">
			<thead>
				<tr>
					<th colspan="5"> Bbs1 List </th>
				</tr>
				<tr>
					<td>번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>조회수</td>
					<td>작성날짜</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="vo">
					<tr>
						<td>${vo.num}</td>
						<td><a href="bbs1Detail.kosta?num=${vo.num}">${vo.sub}</a></td>
						<td>${vo.writer}</td>
						<td>${vo.hit}</td>
						<td>${vo.regdate}</td>
					</tr>
				</c:forEach>				
			</tbody>
		</table>
		
</body>
</html>