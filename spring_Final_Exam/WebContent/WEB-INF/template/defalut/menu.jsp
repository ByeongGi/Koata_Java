<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true" %>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="menu">
MENU
<ul>
	<li>
		<spring:url value="/home" var="homeUrl" htmlEscape="true"></spring:url>
		<a href="${homeUrl }">Home </a>
	</li>
	<li>
		<spring:url value="/about" var="aboutUrl" htmlEscape="true"></spring:url>
		<a href="${aboutUrl }">About</a>
	</li>
	<li>
		<spring:url value="/tvo/list" var="boardUrl" htmlEscape="true"></spring:url>
		<a href="${boardUrl }">Board</a>
	</li>
</ul>
</div>