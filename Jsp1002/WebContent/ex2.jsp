<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/httpRequest.js"></script>
<script type="text/javascript">
	function change() {
		var pv = document.getElementById("se").value;
		var url = "controller?cmd=ajaxdata&name="+pv;
		sendRequest(url, null, res, 'get');
	}
	
	function res() {
		if (xhr.readyState == 4) {

			if (xhr.status == 200) {
				var view = document.getElementById("view");
				var se2 = document.getElementById("se2");
				
				var data=xhr.responseText;
				var datas =data.split(",");
				
				for(i=1 ;i <= datas.length; ++i){
					se2.options[i] = null;
				}
				
				for(i=1;i <= datas.length; ++i){
					se2.options[i] = new Option;
					se2.options[i].value= i;
					se2.options[i].innerHTML= datas[i-1];
				}
				// view.innerHTML = xhr.responseText;
			} else {
				alert("실패"+xhr.status);
			}

		}
	}
	
	
	function change2() {
		var pv1 = document.getElementById("se").value;
		var pv2 = document.getElementById("se2").value;
		var url = "controller?cmd=ajaxdata&img="+ pv2 + "&name=" + pv1;
		//console.log(url);
		sendRequest(url, null, res2, 'get');
	}
	
	
	
	function res2() {
		if (xhr.readyState == 4) {

			if (xhr.status == 200) {
				/* var view = document.getElementById("view");
				var se2 = document.getElementById("se2");
				 */
				var data=xhr.responseText;
				var datas = data.split(",");
				var pv2 = document.getElementById("se2").value;
				var res = datas[pv2-1].trim();
				console.log(res);
				view.innerHTML = '<img src=img/'+res+' >';
			} else {
				alert("실패"+xhr.status);
			}

		}
	}
	
	
</script>
</head>

<body>

	<input type="hidden" value="" id= "data">
	<center>
		<select onchange="change()" id="se" >
			<option value="">선택</option>
			<option value="w">원더걸스</option>
			<option value="s">소녀시대</option>
			<option value="b">빅뱅</option>
		</select>
		<select onchange="change2()" id="se2" >
			<option value="">선택</option>
		</select>
		<p>
		<div id="view"
			style="width: 600px; height: 400px; background-color: gray; color: white;">
		</div>
	</center>
</body>
</html>