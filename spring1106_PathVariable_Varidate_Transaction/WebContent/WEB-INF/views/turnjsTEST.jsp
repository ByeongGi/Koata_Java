<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript" src="resources/lib/test.js"></script>
<script type="text/javascript" src="resources/lib/turn.min.js"></script>
<script type="text/javascript">
$(function() {
	$("#flipbook").turn({
		width: 400,
		height: 300,
		autoCenter: true
	});

});
</script>
<style type="text/css">

/* Basic sample */

body{
	overflow:hidden;
	background-color:#fcfcfc;
	margin:0;
	padding:0;
}

.flipbook-viewport{
	overflow:hidden;
	width:100%;
	height:100%;
}

.flipbook-viewport .container{
	position:absolute;
	top:50%;
	left:50%;
	margin:auto;
}

.flipbook-viewport .flipbook{
	width:922px;
	height:600px;
	left:-461px;
	top:-300px;
}

.flipbook-viewport .page{
	width:461px;
	height:600px;
	background-color:white;
	background-repeat:no-repeat;
	background-size:100% 100%;
}

.flipbook .page{
	-webkit-box-shadow:0 0 20px rgba(0,0,0,0.2);
	-moz-box-shadow:0 0 20px rgba(0,0,0,0.2);
	-ms-box-shadow:0 0 20px rgba(0,0,0,0.2);
	-o-box-shadow:0 0 20px rgba(0,0,0,0.2);
	box-shadow:0 0 20px rgba(0,0,0,0.2);
}

.flipbook-viewport .page img{
	-webkit-touch-callout: none;
	-webkit-user-select: none;
	-khtml-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
	margin:0;
}

.flipbook-viewport .shadow{
	-webkit-transition: -webkit-box-shadow 0.5s;
	-moz-transition: -moz-box-shadow 0.5s;
	-o-transition: -webkit-box-shadow 0.5s;
	-ms-transition: -ms-box-shadow 0.5s;

	-webkit-box-shadow:0 0 20px #ccc;
	-moz-box-shadow:0 0 20px #ccc;
	-o-box-shadow:0 0 20px #ccc;
	-ms-box-shadow:0 0 20px #ccc;
	box-shadow:0 0 20px #ccc;
}

</style>
</head>
<body>
<div id="flipbook">
	<div class="hard"> Turn.js </div>
	<div class="hard"></div>
	<c:forEach items="${list}" var="listv">
		<div>${listv}</div>
	</c:forEach>
	<div class="hard"></div>
	<div class="hard"></div>
</div>
</body>
</html>