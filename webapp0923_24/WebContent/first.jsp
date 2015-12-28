<!--2015 오전 10:54:48 Auth by Byeong Gi Kim   -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%! 
	// 자바 주석 선언부 : 여기는 멤버 입니다.	
	private String msg;
	public void testMsg(String msg){
		this.msg= msg + "하트";
	}
	

 %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 스크립트릿 서비스 메서드 영역 
		String mm = "하하"; //지역변수 
		testMsg("하이");
	
	%>
	<p><%=msg %></p>
	<p><%=mm %></p>
	
</body>
</html>