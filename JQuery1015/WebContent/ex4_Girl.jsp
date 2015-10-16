<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@page import="ex1.Ex3_Girl"%>
<% 
	String code = request.getParameter("groupName");
	Ex3_Girl girl = new Ex3_Girl();
	String[] gg = girl.getGirlGroup(code);
%>
<option value="">-- 선택 --</option>
<% for(String e : gg){	%>
	<option value="<%=e%>"> <%=e%> </option>
<% } %>

 