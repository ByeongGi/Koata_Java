<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- CDN 방식 -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		// $('tr:even').css({'background':'red','color':'green'});
		// $('tr').filter(':even').css({'background':'red','color':'green'});
		$('tr').filter(function(idx) {
			return idx % 3 ==0 ;
		}).css({background:'olive',color:'red'});
		console.log();
		
		
	});
</script>
</head>
<body>
	<div id="wrap">
		<table>
			<% for(int i=0; i<10; i++){ %>
			<tr>
				<td> Value :<%=i %> </td>
			</tr>
			<% } %>
		</table>
	</div>
</body>
</html>