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
	$(document).ready(function() {
		$('#ggChoice').change(function() {
			var url = "ex4_Girl.jsp";
			var params = "groupName=" + $(this).val();
			$.ajax({
				url: url,
				data: params,
				success : function(args) {
					$('#result > select').html(args);
				},
				error: function(e) {
					alert(e.responseText);
				}
				
			});
		});	
		
		$('#ggChoice2').change(function() {
			var url = "ex4_ajaxImgData.jsp";
			var params = "gname=" + $(this).val();
			alert($(this).val());
			$.ajax({
				url: url,
				data: params,
				success : function(args) {
					$('#target').attr("src",args);
				},
				error: function(e) {
					alert(e.responseText);
				}
				
			});
			
		});
		
		
		
		
		
	});

</script>
</head>
<body>
	<div id="wrap">
            <div><select id="ggChoice">
                    <option>=선택=</option>
                    <option value="1">걸스데이</option>
                    <option value="2">티아라</option>
                </select>
            </div>
            <div id="result">
                <select id="ggChoice2"> <option>=선택=</option></select>
            </div>
            <!--연습문제 -->
            <div id="imgTarget">
                 <img src="images/default.PNG" id="target">
            </div>
        </div>
</body>
</html>