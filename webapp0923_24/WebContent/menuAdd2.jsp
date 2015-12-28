<!--2015 년 2015. 9. 23.  오후 3:27:30 Auth by Byeong Gi Kim   -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dao.OrderMenuDao"%>
<%@ page import="vo.MenuVo"%>
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
%>
<%-- MenuVo vo = new MenuVo() 와 같다 --%>
<jsp:useBean id="vo" class="vo.MenuVo"></jsp:useBean>
<!-- 이것은 브라우져에서 보이는 주석 -->

<%-- 아래의 내용을 간소해보자 --%>
<jsp:setProperty property="*" name="vo"/>
<%--vo.setMcode(request.getParameter("mcode")) 와 같다 --%>
<%-- <jsp:setProperty property="mcode" name="vo" param="mcode" /> --%>
<%-- <jsp:setProperty property="mname" name="vo" param="mname" /> --%>
<%-- <jsp:setProperty property="mprice" name="vo" param="mprice" /> --%>
<%
pageContext.findAttribute("vo");
%>
CODE : <%=vo.getMcode() %> <br>
NAME : <%=vo.getMname() %> <br>
PRICE :<%=vo.getMprice() %> <br>
<jsp:getProperty property="mname" name="vo"/>
<%	
	OrderMenuDao.getDao().addMenu(vo); 
	response.sendRedirect("menuList.jsp");
%>





