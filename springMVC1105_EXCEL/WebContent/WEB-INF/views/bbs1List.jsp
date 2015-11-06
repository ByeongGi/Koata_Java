<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
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
		<div class="col-sm-9">
			<a href="downLoad_Excel?searchType=${searchData.searchType}&searchValue=${searchData.searchValue}&orderType=${searchData.orderType}">
			<span class="glyphicon glyphicon-download">EXCEL DOWNLOAD</span></a>
		</div>
		<table class="table"style="border-style: solid;">
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
		<div class="col-sm-9">
			<div align="center">
			<ul class="pagination">
				<li><a
					href="<c:url value='/bbs1List?currentpage=${pagingData.prev_pageno}'/>">«</a></li>
				<c:set var="pageno"  value="${currentpage}"/>
				<c:forEach var="iter" begin="${pagingData.page_sno}"
					end="${pagingData.page_eno}">
					<c:if test="${iter == pageno}">
					<li id="pagination" class="active">
					<a href="<c:url value='/bbs1List?currentpage=${iter}'/>"><b>${iter}</b></a>
					</li>
					</c:if>
					<c:if test="${iter != pageno}">
					<li id="pagination">
					<a href="<c:url value='/bbs1List?currentpage=${iter}'/>"><b>${iter}</b></a>
					</li>
					</c:if>
				</c:forEach>
				<li><a
					href="<c:url value='/bbs1List?currentpage=${pagingData.next_pageno}'/>">»</a></li>
			</ul>
		</div>
		</div>
		<div class="col-sm-9">
			<form action="search_bbs1List" method="get">
				<select name="orderType">
					<option value="">--선택--</option>
					<option value="1">내림차순</option>
					<option value="2">오름차순</option>
				</select>
				<select name="searchType">
					<option value="">--선택--</option>
					<option value="1">제목</option>
					<option value="2">내용</option>
					<option value="3">작성자</option>
				</select>
			<input type="search" name="searchValue">
			<button type="submit" >검색</button>
			</form>
		</div>
	</div>
</div>		
</body>
</html>