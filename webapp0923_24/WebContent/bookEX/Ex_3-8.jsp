<!--2015 오전 11:33:54 Auth by Byeong Gi Kim   -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int sum = 0;
	for(int i= 0; i<=10 ; i++){
		sum = sum + i;
	}

%>
1부터 10 까지 합은 <%=sum %> 입니다.
</body>
</html>