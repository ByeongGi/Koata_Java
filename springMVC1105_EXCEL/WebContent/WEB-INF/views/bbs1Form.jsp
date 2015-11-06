<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#wrap{ width: 450px; margin: auto;}
	#wrap table{ width: 100%; border: 1px dotted #9900ff; }
	#wrap table .fd{ width: 100px; background-color: #b6b9ff;
		font-weight: bold;
		text-align: center;
	}

</style>
</head>
<body>
	<div id="wrap">
		<form action="bbs1In.kosta" method="post">
			<input type="hidden" id="reip" name="reip" value="<%=request.getRemoteAddr() %>">
			<table>
				<thead>
					<tr>
						<th colspan="2">Bbs 입력폼1</th>
					</tr>
				</thead>		
			
				<tbody>
					<tr>
						<td class="fd">제목</td>
						<td><input type="text" id="sub" name="sub"/></td>
					</tr>
					<tr>
						<td class="fd">작성자</td>
						<td><input type="text" id="writer" name="writer"/></td>
					</tr>
					<tr>
						<td class="fd">비밀번호</td>
						<td><input type="password" id="pwd" name="pwd"/></td>
					</tr>
					<tr>
						<td class="fd">내용</td>
						<td><textarea rows="20" cols="20" 
						id="cont" name="cont">
						</textarea> 
						</td>
					</tr>
					
				</tbody>
			
				<thead>
					<tr>
						<td colspan="2">
							<input type="submit" value="send">
							<input type="button" value="list" 
							onclick="javascript:location='bbs1List.kosta'">
						</td>
					</tr>
				</thead>
			</table>
	
		
		</form>
	</div>
</body>
</html>