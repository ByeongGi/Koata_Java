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

	<div id="wrap" class="row" >
		
			<table>
				<thead>
					<tr>
						<th colspan="2">Bbs1 Detail</th>
					</tr>
				</thead>		
			
				<tbody>
					<tr>
						<td class="fd">제목</td>
						<td>${vo.sub}</td>
					</tr>
					<tr>
						<td class="fd">작성자</td>
						<td>${vo.writer}</td>
					</tr>
					<tr>
						<td class="fd">내용</td>
						<td>${vo.cont}
						</td>
					</tr>
					
				</tbody>
			
				<thead>
					<tr>
						<td colspan="2">
							<input type="button" value="write" 
							onclick="javascript:location='bbs1Form.kosta'">
							
							<input type="button" value="list" 
							onclick="javascript:location='bbs1List.kosta'">
						</td>
					</tr>
				</thead>
			</table>
	</div>
	-------------------------------- 댓글 -----------------------------------
	<div class="row" >
		<form action="bbs1Comm.kosta" method="post">
				<input type="hidden" id="reip" name="reip" value="<%=request.getRemoteAddr() %>">	
				<input type="hidden" id="kcode" name= "kcode" value="${vo.num}">	
			<table class="table">
				<tbody>
					<tr>
						<td>
							<select name="cnt" id="cnt" >
								<option>--- 선택 ---</option>
								<option value="5" >★★★★★</option>
								<option value="4" >★★★★☆</option>
								<option value="3" >★★★☆☆</option>
								<option value="2" >★★☆☆☆</option>
								<option value="1" >★☆☆☆☆</option>
							</select>
						</td>
						<td> <input type="text" name="writer" size="15"> </td>
						<td> <textarea rows="3"  cols="30"  name="comm" ></textarea> </td>
						<td> <input type="submit" value="작성" > </td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
	--------------------------------------------------------------------------
	<div class="row" >
	
	<table class="table">
		<c:forEach items="${cList}" var="coList">
			<tr>
				<c:choose>
					<c:when test="${coList.cnt=='1' }">
						<td>★☆☆☆☆</td>
					</c:when>
					<c:when test="${coList.cnt=='2' }">
						<td>★★☆☆☆</td>
					</c:when>
					<c:when test="${coList.cnt=='3' }">
						<td>★★★☆☆</td>
					</c:when>
					<c:when test="${coList.cnt=='4' }">
						<td>★★★★☆</td>
						
					</c:when>
					<c:when test="${coList.cnt=='5' }">
						<td>★★★★★</td>
					</c:when>
				</c:choose>
				<td>${coList.comm}</td>
				<td>${coList.writer}</td>
				<td>${coList.regdate}/${coList.reip}</td>
			</tr>
		 </c:forEach>

	</table>
	</div>
	
</div>	
</body>
</html>