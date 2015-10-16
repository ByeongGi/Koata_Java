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
var arr = [
	       {name:'김길동',addr:'경기도 판교1'},
	       {name:'김승아',addr:'경기도 판교2'},
	       {name:'이지현',addr:'경기도 판교3'}];
			console.log("LOG :::" +arr[1].name );
$(function() {
		var print ="";
		// $each('배열데이터',handler);
		$.each(arr,function(idx,item){
			print += "<h1><p> NAME ["+item.name+"]</h1></p> "
					+"<h1><p> ADDR ["+item.addr+"]</h1></p>"
		});		
		$('div').html(print);
		
});
</script>
</head>
<body>
	<div>S</div>
</body>
</html>