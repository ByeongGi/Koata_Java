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
<!-- choose - if else if  
	ex1_chooseForm.jsp
	<select name =level"></select>
	레벨을 선택하면 chooseTest.jsp 파라미터 값을 
	분석해서 교재와 같은 레벨을 선택한 내용를 선택하시오 
-->

<c:choose>
	<c:when test="${param.level == 'trial'}">
		<p> 레벨은 트라이얼  </p>	
	</c:when>
	<c:when test="${param.level == 'reqular'}">
		<p> 레벨은 레귤러  </p>
	</c:when>
	<c:when test="${param.level == 'provider'}">
		<p> 레벨은 프로바이더  </p>	
	</c:when>
	<c:otherwise>
		<p>레벨을 선택하세요 </p>
	</c:otherwise>
</c:choose>
</body>
</html>