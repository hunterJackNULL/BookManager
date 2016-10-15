<%@page import="java.io.Writer"%>
<%@page import="com.book.entity.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookManager</title>
<style type="text/css">
@IMPORT url("login.css");
</style>
<script type="text/javascript" src="javascript/login.js"></script>
</head>
<body background="background.jpg">
	<h1 align="center">图&nbsp;书&nbsp;管&nbsp;理&nbsp;系&nbsp;统</h1>
	<form action="login" method="post" onsubmit="return check()">
		<table width="30%">
			<tr>
				<div class="error">
					<td colspan="2">${requestScope.errorMessage}</td>
				</div>
			</tr>
			<tr>
				<td>student:<input type="radio" name="identity"></td>
				<!-- 身份 -->
				<td>admin:<input type="radio" name="identity"></td>
			</tr>
	
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="name"
					value="${cookie.name.value}" id="identity"
					onclick="mclick()" onblur="mblur()"></td>
			</tr>
			<tr>
				<td>密&nbsp;码:</td>
				<td><input type="password" name="password" id="password"
					onclick="mclick()" onblur="mblur()"></td>
			</tr>
			<tr>
				<td><img alt="checkCode" src="${pageContext.request.contextPath}/validateColor"></td>
				<td><input type="text" name="checkCode">
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" class="submit" id="submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>