<%@page import="ex1.TestVo"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- var ���� ���� value �� ���� �� ����  --%>
<c:set var="member" value ="���ȸ��" ></c:set>
<%-- requestScope�� ����� v ���� ����  --%>
<c:set target="${v}" property="name" value="��浿"></c:set>	
${member} / ${v.name}
</body>
</html>