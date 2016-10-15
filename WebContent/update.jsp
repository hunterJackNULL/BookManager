<%@page import="java.io.Writer"%>
<%@page import="com.book.entity.Book"%>
<%@page import="com.book.dao.impl.BookDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>update</title>
<style type="text/css">
@IMPORT url("bookManager.css");
</style>
</head>
<body background="beauty.jpg">
	<h2>修改图书信息</h2>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		BookDaoImpl bookDaoImpl = new BookDaoImpl();
		Book book = bookDaoImpl.getBook(id);
	%>
	<form action="update.do" method="post">
		<input type="hidden" name="id" value="<%=id %>">
		<center>书名:<input type="text" name="name" value="<%=book.getName()%>"></center><br>
		<center>作者:<input type="text" name="author" value="<%=book.getAuthor()%>"></center><br>
		<center>价格:<input type="text" name="price" value="<%=book.getPrice()%>"></center><br>
		<center>类别:<input type="text" name="style" value="<%=book.getStyle() %>"></center><br>
		<center>出版社:<input type="text" name="press" value="<%=book.getPress() %>"></center><br>
		<center><input type="submit" value="提交"></center>
	</form>
</body>
</html>