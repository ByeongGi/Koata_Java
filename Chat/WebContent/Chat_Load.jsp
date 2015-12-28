<%@page import="dao.ChatDao"%>
<%@page import="java.util.List"%>
<%@page import="vo.Chat_Vo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%   
	response.setContentType("text/event-stream");
	response.setHeader("cache-control", "no-cache");
	response.setHeader("Access-Control-Allow-Origin", "*");
	response.setHeader("Access-Control-Allow-Credentials","true");
	List<Chat_Vo> list = ChatDao.getDao().getList();
	StringBuffer outs = new StringBuffer();
	outs.append("data:");
	for ( Chat_Vo v: list){
		outs.append(v.getU_id());
		outs.append("/");
		outs.append(v.getChat());
		outs.append(":");
	}
	
	out.write(outs.toString());
	out.newLine();out.newLine();
	out.flush();
	System.out.print(outs.toString());
%>