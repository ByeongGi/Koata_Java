<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel='stylesheet'
	href='http://fullcalendar.io/js/fullcalendar-2.3.1/lib/cupertino/jquery-ui.min.css' />
<link
	href='http://fullcalendar.io/js/fullcalendar-2.3.1/fullcalendar.css'
	rel='stylesheet' />
<link
	href='http://fullcalendar.io/js/fullcalendar-2.3.1/fullcalendar.print.css'
	rel='stylesheet' media='print' />
<script
	src='http://fullcalendar.io/js/fullcalendar-2.3.1/lib/moment.min.js'></script>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script
	src='http://fullcalendar.io/js/fullcalendar-2.3.1/fullcalendar.min.js'></script>
<script src='http://fullcalendar.io/js/fullcalendar-2.3.1/lang-all.js'></script>
<script>
 $(function(){
  var currentLangCode = 'ko';
  $('#calendar').fullCalendar('destroy');
  $('#calendar').fullCalendar({

   //lang: currentLangCode,

   dragable:false,  //드래그앤 드랍 옵션
            timeFormat: 'hh:mm', //시간 포멧
           // lang: 'ko',  //언어타입
            header: {
		     left: 'prev,next today',
		     center: 'title',
		     right: 'month,agendaWeek,agendaDay'
     				},
    // 클릭이벤트 - 삭제 
    eventClick : function(calEvent,jsEvent,view){ 
    	var r=confirm("Delete " + 
        calEvent.title+":"+calEvent._id);
        if (r===true){
                    $('#calendar').fullCalendar('removeEvents', 
                      calEvent._id);
        }
   },
   defaultView: 'month',//기본 뷰 - 옵션   //첫 페이지 기본 뷰 옵션
   editable: false,                                             //에디터 가능 옵션
   selectable: true,
   selectHelper: true,
   // 캘린더 셀렉트 된 값을 컬럼에 표시...
   select: function(start, end, event) {
   	var title = prompt('Event Title:');
   	var eventData;
   	if (title) {
    eventData = {
      title: title,
      start: start,
      end: end
    };

    $('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
    }
    $('#calendar').fullCalendar('unselect');
    alert("selected from: " + start.format() + ", to: " + end.format());

     // 셀렉트된 결과를 서버로 전송

          $.ajax({
              url: "testAjax.jsp",
              type: "GET",
              data: {
                  q: "test"
              },
              dataType: "html",
              success: function(a) {
                  alert("Data: " + a);

              },

              error: function(a, b) {
                  alert("Request: " + JSON.stringify(a));

              }

          });

   },
   editable: true,
   eventLimit: true,
   events: [

            <%// select * from cal where day1=2015-05 쿼리에 의해서
			// 아래의 리스트값이 해당 월을 기준으로 바뀐다.
			ArrayList<String> list = new ArrayList();
			list.add("2015-10-01");
			list.add("2015-10-10");
			list.add("2015-10-13");
			list.add("2015-10-16");
			list.add("2015-10-17");
			for (String e : list) {%>

      {

       title: 'TEST',
       start: '<%=e%>'
      },
      <%}%>
         {
        title: 'All Day Event',
       start: '2015-10-22'
      }
     ]
  })
 });
</script>
</head>
<body>
	<div id='calendar'></div>
</body>
</html>
