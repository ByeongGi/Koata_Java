<!--2015 년 2015. 9. 24.  오후 5:10:33 Auth by Byeong Gi Kim   -->
<%@page import="vo.MenuVo"%>
<%@page import="java.util.List"%>
<%@page import="dao.OrderMenuDao"%>
<%@page import="vo.OrderCookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="top.jsp" %>	
		<!-- Content 영역 시작 -->
		<div class="container">
		<table id="mlist" class="table">
			<thead>
				<tr>
					<th>주문 번호</th>
					<th>메뉴 번호</th>
					<th>주문자명</th>
					<th>메뉴 코드</th>
					<th>메뉴 이름</th>
					<th>주문 갯수</th>
					<th>주문총액수</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<!-- 데이터 반복영역  -->
			<% 	
			
			List<OrderCookVo> list = OrderMenuDao.getDao().getOrderList();
			MenuVo mvo=null;
			for (OrderCookVo vo : list) {	
				mvo=vo.getMvo();
				 
			%>
				<tr>
					<td><%=vo.getOno() %></td>
					<td><%=vo.getMno() %></td>
					<td><%=vo.getOname() %></td>
					<td><%=mvo.getMcode()%></td>
					<td><%=mvo.getMname()%></td>					
					<td><%=vo.getQty() %></td>
					<td><%=mvo.getMprice()%></td>
					<td><a href="">삭제</a></td>
				</tr>
				
			<% } %>	
				<!-- 데이터 반복영역  -->
			</tbody>
			<tfoot>
				<tr>
					<td colspan="8">
						
					</td>
				</tr>
			</tfoot>
		</table>
		</div>
		<!-- Content 영역 끝 -->
</body>
</html>