<!--2015 년 2015. 9. 23.  오후 4:00:35 Auth by Byeong Gi Kim   -->
<%@page import="java.util.ArrayList"%>
<%@page import="vo.MenuVo"%>
<%@page import="java.util.List"%>
<%@page import="dao.OrderMenuDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<%@include file="top.jsp" %>	
		<!-- Content 영역 시작 -->
		<div class="container">
		<table id="mlist" class="table">
			<thead>
				<tr>
					<th>번호</th>
					<th>코드</th>
					<th>메뉴이름</th>
					<th>가격</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<!-- 데이터 반복영역  -->
			<% 	
			
			List<MenuVo> list = OrderMenuDao.getDao().getMenuList();
			for (MenuVo vo : list) {	
				
			%>
				<tr>
					<td><%=vo.getMno() %></td>
					<td><%=vo.getMcode() %></td>
					<td><%=vo.getMname() %></td>
					<td><%=vo.getMprice() %></td>
					<td><a href="">삭제</a></td>
				</tr>
				
			<% } %>	
		<!-- 데이터 반복영역  -->
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5">
						<input type="button" value ="메뉴 등록">
					</td>
				</tr>
			</tfoot>
		</table>
		</div>
		<!-- Content 영역 끝 -->





</body>
</html>