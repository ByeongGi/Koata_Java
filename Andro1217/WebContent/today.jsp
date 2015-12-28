<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String val = request.getParameter("user");
SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
String date = f.format(new Date());
System.out.println(val);          
%>{"id":"<%=date%><%=val%>"}