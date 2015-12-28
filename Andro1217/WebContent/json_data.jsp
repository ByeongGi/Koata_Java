<%@ page language="java" contentType="text/json; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@page trimDirectiveWhitespaces="true" %> 
<%
	String fname=request.getParameter("serverkey");
	if(fname!=null){    
		String path="http://221.141.152.29:8090/Andro1217/img/";
	
%>        
<%=fname%>([{'pno':'p1','pname':'아이유팬클럽','pimage':'<%=path%>w1.png'},
{'pno':'p2','pname':'아이유 삼촌 팬클럽','pimage':'<%=path%>w2.png'},
{'pno':'p3','pname':'아이유 사랑 모임','pimage':'<%=path%>w3.png'},
{'pno':'p5','pname':'아이유 커뮤니티','pimage':'<%=path%>w4.png'},
{'pno':'p6','pname':'아이유 스토리','pimage':'<%=path%>w4.png'},
{'pno':'p7','pname':'아이유 유이아','pimage':'<%=path%>w5.png'}
])   
<% 
	}
%>    