<%@page import="com.book.entity.Book"%>
<%@page import="com.book.dao.impl.BookDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>delete</title>
<style type="text/css">
@IMPORT url("bookManager.css");
</style>
<script type="text/javascript" src="javascript/delete.js">
</script>
</head>
<body background="beauty.jpg">
	<h2>删除图书信息</h2>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		BookDaoImpl bookDaoImpl = new BookDaoImpl();
		Book book = bookDaoImpl.getBook(id);
	%>

	<h1>书名:<%=book.getName()%></h1><br> 
	<h1>作者:<%=book.getAuthor()%></h1><br> 
	<h1>价格:<%=book.getPrice()%></h1><br>
	<h1> 类别:<%=book.getStyle()%></h1><br> 
	<h1>出版社:<%=book.getPress()%></h1>
	<br>
	<form action="delete.do" method="post" onsubmit="return checkDelete()">
		<input type="hidden" name="id" value="<%=id%>"> 
		<input type="submit" value="删除" id="submit">
	</form>
</body>
</html>