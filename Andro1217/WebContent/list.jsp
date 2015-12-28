<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>                              
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"href="./lib/mobile/jquery.mobile-1.4.5.min.css" />
<script src="./lib/jqurey/jquery-2.1.4.min.js" ></script>                             
<script src="./lib/mobile/jquery.mobile-1.4.5.min.js"></script>      
<script type="text/javascript">           
$(document).ready(function() {       
	                
	var addr= "http://221.141.152.29:8090/Andro1217/json_data.jsp?serverkey=?";
	$.getJSON(addr,function(data) {
		console.log(data);         
		$.each(data,function(k,v){
			var tag = "<a href=\"#photo\"><img src="+v.pimage+"><h3>"+
				v.pname+"</h3><p>p엘리멘트입니다.</p></a>";
				$("#content ul").append("<li>"+tag+"</li>");    
				$("#content img").addClass("ul-li-has-thumb");
				$(".listview").listview('refresh');
				console.log("test");          
		});    
	});
});
</script>
<style type="text/css">
 #logo{
 	width : 310px;
 	height : 70px;
 	text-indent: -999px;
 	background-image: url("img/log.gif");
 	background-repeat: no-repeat;
 	margin-top: 5px;
 	margin-right: auto;
 	margin-bottom: 5px;
 	margin-left: auto;
 }
</style>
<title>Insert title here</title>
</head>
<body>
	<section data-role="page" id="first">
         <header data-role="header" data-theme="a">
          <h1> My First Page!</h1>
         </header>
         <div data-role="content" id="content">  
          <ul data-role="listview" class="listview" data-insert="true">
               
          </ul> 
         </div>
         <footer data-role="footer" data-position="fixed">
          <h2> Footer! </h2>
         </footer>
        </section>
</body>
</html>