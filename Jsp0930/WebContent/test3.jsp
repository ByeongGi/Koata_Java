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
	${list[0]} <br>
	${list[1]} <br>
	
	
	${list2[0].name} <br>
	${list2[0].email} <br>
	${list2[0].phone} <br>
	
	
	${list2[1].name} <br>
	${list2[1].email} <br>
	${list2[1].phone} <br>	
	
	<c:forEach items="${list2}"  var="list">
		${list.name} <br>	
	</c:forEach>

</body>
</html>