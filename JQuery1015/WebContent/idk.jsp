<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>

<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String dbid= "wwww3426";
	String msg = "";
	if(dbid.equals(id)){
		msg="<p style='color:red'> 이미 존재하는 아이디 입니다.</p>";
	} else{
		msg="<p style='color:blue'> 사용 가능한 아이디 입니다. </p>";
	}
%>
<%=msg %>