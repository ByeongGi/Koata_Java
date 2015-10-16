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
<script type="text/javascript" src="js/httpRequest.js"></script>
<script type="text/javascript">


$(document).ready(function change() {
	var url = "jsonData.jsp";
	sendRequest(url, null, res, 'get');
});


function res() {
	if (xhr.readyState == 4) {

		if (xhr.status == 200) {
			
			var data=xhr.responseText;
			var res="";
			$.each(JSON.parse(data),function(idx,item){
					res += '<p>'+'ID :'+ item.id +'</p>'
						+ '<p>'+'ID :'+ item.name +'</p>'
						+ '<p>'+'ID :'+ item.loc +'</p>';
				 
			});
				$('div').html(res);
			
		} else {
			alert("실패"+xhr.status);
		}

	}
}



</script>

</head>
<body>

	<div class="container"></div>
</body>
</html>