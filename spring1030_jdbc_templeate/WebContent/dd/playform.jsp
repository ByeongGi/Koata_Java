<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>Insert title here</title>
</head>
<body>
	<div id="wrap">
		<form action="*.kosta" method="post" >
		<input type="hidden" name= "query" value ="playadd">
			<table>
				<tr>
					<td>PName</td>
					<td><input type="text" name="pname" id="pname"></td>

				</tr>
				<tr>
					<td>PRICE</td>
					<td><input type="number" name="price" id="price"></td>
				</tr>
				<tr>
					<td>유저</td>
					<td><input type="text" name="users" id="users"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="가입"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>