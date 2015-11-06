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
 LIST 페이지
 <table style="border-style: solid;">
			<thead>
				<tr>
					<th colspan="5"> Bbs1 List </th>
				</tr>
				<tr>
					<td>번호</td>
					<td>아이디</td>
					<td>비밀번호</td>
					<td>이름</td>
					<td>성별</td>
					<td>작성날짜</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="vo">
					<tr>
						<td>${vo.num}</td>
						<td>${vo.id}</td>
						<td>${vo.pwd}</td>
						<td>${vo.name}</td>
						<td>${vo.gender}</td>
						<td>${vo.regdate}</td>
					</tr>
				</c:forEach>				
			</tbody>
		</table>
		-------------------------------- TEST
 		<div align="center">
			<ul class="pagination">
				<li><a
					href="memList.kosta?currentpage=${pagingData.prev_pageno}">«</a></li>
				<c:forEach var="iter" begin="${pagingData.page_sno}"
					end="${pagingData.page_eno}">
					<li id="pagination"><a href="memList.kosta?currentpage=${iter}"><b>${iter}</b></a></li>
				</c:forEach>
				<li><a
					href="memList.kosta?currentpage=${pagingData.next_pageno}">»</a></li>
			</ul>
		</div>
 
</body>
</html>