<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>
</head>
<body> 
<div class="container">

	<div class="row">
		<div>
			<a href='<c:url value="/tvo/form"/>'>FORM 으로 갑니다!</a>
		</div>
		<div>
			<table class="table" style="border-style: solid;">
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
						<td><a href='<c:url value="/tvo/detail?num="/>${vo.num}' > ${vo.sub} </a></td>
						<td>${vo.writer}</td>
						<td>${vo.content}</td>
						<td><img src='<c:url value="/img/${vo.mfile}"/>' style="width: 200px; height: auto;"></td>
						<td><a href="<c:url value='/fileDown?fileName=${vo.mfile}'/>">down</a></td>
					</tr>
					</c:forEach>				
				</tbody>
			</table>
		</div>
		
		<hr>
		
 		<div align="center">
			<ul class="pagination">
				<li><a
					href="<c:url value='/tvo/list?currentpage=${pagingData.prev_pageno}'/>">«</a></li>
				<c:set var="pageno"  value="${currentpage}"/>
				<c:forEach var="iter" begin="${pagingData.page_sno}"
					end="${pagingData.page_eno}">
					<c:if test="${iter == pageno}">
					<li id="pagination" class="active">
					<a href="<c:url value='/tvo/list?currentpage=${iter}'/>"><b>${iter}</b></a>
					</li>
					</c:if>
					<c:if test="${iter != pageno}">
					<li id="pagination">
					<a href="<c:url value='/tvo/list?currentpage=${iter}'/>"><b>${iter}</b></a>
					</li>
					</c:if>
				</c:forEach>
				<li><a
					href="<c:url value='/tvo/list?currentpage=${pagingData.next_pageno}'/>">»</a></li>
			</ul>
		</div>
	</div>
	
</div>	
</body>
</html>