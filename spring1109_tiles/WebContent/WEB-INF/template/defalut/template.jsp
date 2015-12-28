<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>
<title>Insert title here</title>
<!-- <style type="text/css">
	body {margin: 0px;
		  padding: 0px;
		  height: 100%;
		  overflow: hidden;
		}
	.page { min-height: 100%; position: relative;}
	.header { padding: 10px; width: 100%; text-align: center;}
	.menu { padding: 10px; padding-bottom: 20px; overflow: hidden;}
	.content { padding: 10px 10px 0px 10px; width: 100% }
	.footer { width: 100%; background:orange;}
	.body {width: 100%;}
</style> -->
</head>
<body>
	TEMPLEATE DEFALUT
	<div class="container page">
		<tiles:insertAttribute name="header" flush="true" />
		
		<div class="container content">
			<tiles:insertAttribute name="menu" flush="true" />
			<tiles:insertAttribute name="body" flush="true" />
		</div>
		
		<tiles:insertAttribute name="footer" flush="true" />
	</div>
</body>
</html>