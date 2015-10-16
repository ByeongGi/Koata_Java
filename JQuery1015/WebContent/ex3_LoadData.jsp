<%-- 
    Document   : ex2_loadData
    Created on : 2014. 9. 19, 오후 3:56:31
    Author     : kosta
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String n = request.getParameter("num");
    System.out.println(n);
    if(n.equals("Click1")){
         String[] sub = {"Java","Oracle","jQuery","SenchaTouch","PhoneGap"};
         for(String e : sub){
             out.print("<li>");
             out.print(e);
             out.println("</li>");
         }
    }else{
         String[] sub = {"자바","제이쿼리","오라클","센차터치","폰갭"};
         for(String e : sub){
             out.print("<li>");
             out.print(e);
             out.println("</li>");
         }  
    }
    
%>