<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach items="${list}" var="data">
	<tr style="border: 1px solid;">
		<td>${data.num}</td>
		<td>${data.name}</td>
		<td>${data.roadAddress}</td>
	</tr>
</c:forEach>