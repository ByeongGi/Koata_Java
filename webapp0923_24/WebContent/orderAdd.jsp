<!--2015 년 2015. 9. 24.  오후 4:15:16 Auth by Byeong Gi Kim   -->
<%@page import="dao.OrderMenuDao"%>
<%@page import="vo.OrderCookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="vo.OrderCookVo" ></jsp:useBean >
<jsp:setProperty property="*" name="vo"/>
<%  


/* 
ONO 	// 시퀀서 
MNO 	// 메뉴번호
ONAME 	// 이름 
QTY 	// 수량 
ODATE   // 주문 일 
*/
	request.setCharacterEncoding("UTF-8");
	System.out.println("menuAdd 검사 ! ");
	 
	// OrderCookVo vo = new OrderCookVo();
	
	/* vo.setOname(request.getParameter("oname"));
	vo.setMno(Integer.parseInt(request.getParameter("mno")));
	vo.setQty(Integer.parseInt(request.getParameter("qty"))); */
	OrderMenuDao.getDao().addOrder(vo);
	response.sendRedirect("orderList.jsp");
%>

