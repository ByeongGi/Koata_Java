<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>  
<%
    request.setCharacterEncoding("euc-kr");
    String gname = request.getParameter("gname");
    gname = gname.trim();
    System.out.println("GName : "+gname);
    //"유라","헤리","소진","미라"
    String imgName="";
    if(gname.equals("유라")){
         imgName="img/img1.jpg";
    }else if(gname.equals("헤리")){
         imgName="img/img2.jpg";
    }else if(gname.equals("소진")){
         imgName="img/img3.jpg";
    }else if(gname.equals("미라")){
         imgName="img/suzi4.jpg";
         //"보람","지연","효민","은정"","큐리,"소연"
    }else if(gname.equals("보람")){
         imgName="img/suzi5.jpg";
    }else if(gname.equals("지연")){
         imgName="taraImg/jiyun.jpg";
    }else if(gname.equals("효민")){
         imgName="taraImg/hymin.jpg";
    }else if(gname.equals("큐리")){
        imgName="taraImg/jiyun.jpg";
    }else if(gname.equals("소연")){
        imgName="taraImg/soyun.jpg";
    }
%><%=imgName%>