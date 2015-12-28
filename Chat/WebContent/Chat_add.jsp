<%@page import="dao.ChatDao"%>
<%@page import="vo.Chat_Vo"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	// 허용할 회사 도메인을 작성하면 됩니다.
	// 크로스 모메인 허용 설정 , JSONP 두가지중에 허용 설정 
	response.setHeader("Access-Control-Allow-Origin", "*");
	response.setHeader("Access-Control-Allow-Credentials", "true");
	String u_id = URLDecoder.decode(request.getParameter("u_id"), "utf-8");
	String chat = URLDecoder.decode(request.getParameter("chat"), "utf-8");
	
	System.out.println("u_id"+u_id);
	System.out.println("chat"+chat);
	Chat_Vo vo = new Chat_Vo();
	vo.setU_id(u_id);
	vo.setChat(chat);
	vo.setReip(request.getRemoteAddr());
	ChatDao.getDao().add(vo); 

%>    