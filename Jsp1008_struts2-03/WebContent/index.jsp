<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#wrap { width: 800px; margin: auto;}
	#top {width: 100%; background-color: blue;}
	top ul li { list-style: none; float: left;}
	a{ text-decoration: none;}
	a:HOVER { background: gray;}
</style>
</head>
<body>
인덱스 페이지 !
	<div id= "wrap">
		<div id= "top">
			<ul>
				<!-- OGNF 기법 #키워드는 sesionScope 영역에 session을 찾아옴 # 키워드는 
				value stack을 참고 하지 않는 키워드다 -->
				<s:if test="#session.loginId== null">
				<li> <a href=""> 회원가입 </a> </li>
				<li> <a href="loginForm"> 로그인 </a> </li>				
				</s:if>
				<s:else>
				<li> <a href="mypage"> ${sessionScope["loginId"]} 님 </a> </li>
				<li> <a href="logout"> 로그아웃 </a> </li>					
				</s:else>
				<li> <a href="boardlist2"> 게시판 </a> </li>
				<s:if test="#session.role == 'admin'">
						<li>관리자모드입니다!</li>
				</s:if>
			</ul>
		</div>
	</div>
</body>
</html>