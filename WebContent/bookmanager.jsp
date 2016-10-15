<%@page import="java.util.Iterator"%>
<%@page import="com.book.dao.impl.BookDaoImpl"%>
<%@page import="com.book.entity.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
@IMPORT url("bookManager.css");
</style>
<title>bookmanager</title>
</head>
<body background="beauty.jpg">
	<h1 align="center">图&nbsp;书&nbsp;管&nbsp;理&nbsp;系&nbsp;统</h1>
	<h2>${sessionScope.name}
		welcome to bookmanager!!!
	</h2>
	<a href="logout.do" >注销</a>

	<table>
		<tr>
			<td colspan="4"><a href="add.jsp">添加图书</a></td>
			<td colspan="3"><a href="seek.jsp">查找图书</a></td>
		</tr>
		<tr>
			<th>书名</th>
			<th>价格</th>
			<th>作者</th>
			<th>出版社</th>
			<th>类别</th>
		</tr>
		<c:forEach items="${requestScope.bookList}" var="book">
		<tr>
			<td>${book.name}</td>
			<td>${book.price}</td>
			<td>${book.author}</td>
			<td>${book.press}</td>
			<td>${book.style}</td>
			<td><a href="update.jsp?id=${book.id}">修改信息</a></form></td>
			<td><a href="delete.jsp?id=${book.id}">删除图书</a></td>
		</tr>
		</c:forEach>	
	</table>




</body>
</html>