<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
<style type="text/css">
@IMPORT url("bookManager.css");
</style>
</head>
<body background="beauty.jpg" >
	<!--  <iframe src="top.html"  ></iframe>-->
	<img alt="top" src="bookmanager.jpg" width="40%" >
	<form action="add.do" method="post">
		书名:<input type="text" name="name"> 作者:<input type="text"
			name="author"> 价格:<input type="text" name="price">
		类别:<select name="style">
			<option value="computer">computer</option>
			<option value="science">science</option>
			<option value="math">math</option>
		</select> 出版社:<input type="text" name="press"> 
		<input type="submit" value="添加">
	</form>
</body>
</html>