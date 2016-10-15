<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.jw.com/mytag/core" prefix="myTag"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<myTag:UpperCase time="5">jack!!!</myTag:UpperCase>
	<%
		HashMap<String, String> map = new HashMap<>();
		map.put("jw", "one");
		map.put("dd", "two");
		map.put(null, "df");
		String str = "message";
		request.setAttribute("map", map);
	%>
	<c:choose>
		<c:when test=""></c:when>
	</c:choose>
	<myTag:foreach items="${map }" var="entry">
		${entry.key }    ${entry.value}<br>
	</myTag:foreach>
	<myTag:choose>
		<myTag:when test="${param.age>18}">${"adult!!!" }</myTag:when>
		<myTag:when test="${param.age>12}">${"child!!!" }</myTag:when>
		<myTag:otherwise>${"hello" }</myTag:otherwise>
	</myTag:choose>
</body>
</html>