<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.email{ background: pink}
	.error{ background: red;}

</style>	
	
</head>
<body>
	<div id="wrap">
		<p> Login Form </p>
		<!-- commandName: userForm은 컨트롤러에서 받을 폼의 데이터를 저장하는 
			 CommandObject이다. Valadataion 을 사용하기 위한 필수 속성	
		 -->
		<form:form action="login" commandName="userForm">
			<table>
				<tbody>
					<tr>
						<td>아이디 :</td>
						<td><form:input path="email" cssClass="email" /> </td>
						<td><form:errors path="email" cssClass="error" /> </td>
					</tr>
					<tr>
						<td>비밀번호 :</td>
						<td><form:input path="pwd" cssClass="pwd" /> </td>
						<td><form:errors path="pwd" cssClass="error" /> </td>
					</tr>
					<tr>
						
						<td colspan="3"><input type="submit" value="Login" /> </td>
					</tr>
				
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>