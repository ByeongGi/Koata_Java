<!--2015 년 2015. 9. 23.  오후 3:27:30 Auth by Byeong Gi Kim   -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dao.OrderMenuDao" %>
<%@ page import="vo.MenuVo" %>
<!-- 
	menuAdd.jsp에서 구현해야 될것들 
	1. 폼에서 전송된 파라미터 변수에 저장 
	2. Dao 를 생성하고 
	3. VO 를 생성 해서 1번의 값을 vo에 setter 호출해서 각각 저장
	4. 2번의 dao 로 부터 add 메서드로 vo 로 전달 
	5. 리스트로 이동  

 -->
<%
	request.setCharacterEncoding("UTF-8");
	System.out.println("menuAdd 검사 ! ");
	// MenuVo에 파라미터로 넘어 온 값을 저장 
	MenuVo vo = new MenuVo();
	// OrderMenuDao의 addMenu(MenuVo vo)에게 vo를 전달
	vo.setMcode(request.getParameter("mcode"));
	vo.setMname(request.getParameter("mname"));
	vo.setMprice(Integer.parseInt(request.getParameter("mprice")));
	// OrderMenuDao.getDao().addMenu();
	OrderMenuDao.getDao().addMenu(vo);
	response.sendRedirect("menuList.jsp");
%>