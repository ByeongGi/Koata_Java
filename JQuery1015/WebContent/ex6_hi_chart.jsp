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
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script type="text/javascript">
	var url = "js/ajax.json";
	var res = "";
	var options;

	$(function() {

		options = {
			chart : {
				renderTo : 'container',
				type : 'line',
			},
			title : {
				text : 'Monthly Average Temperature',
				x : -20
			//center
			},
			subtitle : {
				text : 'Source: WorldClimate.com',
				x : -20
			},
			xAxis : {
				categories : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul',
						'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ]
			},
			yAxis : {
				title : {
					text : 'Temperature (°C)'
				},
				plotLines : [ {
					value : 0,
					width : 1,
					color : '#808080'
				} ]
			},
			tooltip : {
				valueSuffix : '°C'
			},
			legend : {
				layout : 'vertical',
				align : 'right',
				verticalAlign : 'middle',
				borderWidth : 0
			},
			series : []
		};

		$.ajax({
			url : url,
			success : function(list) {
				

				$.each(list, function(i, item) {
					var newseries = { name : '', data : [] };
					newseries.name = item.name;
					newseries.data = item.data;
					options.series.push(newseries);
					console.log(newseries.name);
					console.log(newseries.data);
					console.log(options.series);
					
				});

				$('#container').highcharts(options);

			},
			error : function(e) {
				// alert(e.responseText);
			}

		});

		/*   
		   $.getJSON(chartDataUrl,
		       function(data) {
		           avgByDayOptions.xAxis.categories = data['chart_data']['dates'];
		           avgByDayOptions.series[0].name = 'Avg Glucose (mg/dL)';
		           avgByDayOptions.series[0].data = data['chart_data']['values'];
		           var chart = new Highcharts.Chart(avgByDayOptions);
		   });
		 */

	});

	/* for(var idx=0; idx<args.data.length; idx++) {
		var series_name = args.data[idx].NOTATTENDTYPE;
		var series_data = args.data[idx].NOTATTEND;
		var series = [
		series_name,
		series_data
		]; 
		jsondata.push(series); 
		}

		options.series[0].type = 'pie';
		options.series[0].name = '근무자유형';
		options.series[0].data = jsondata; 
		
	 */
</script>
</head>
<body>
	<div id="container"></div>
</body>
</html>