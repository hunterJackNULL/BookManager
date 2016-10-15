<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>result</title>
</head>
<body background="beauty.jpg">
<%boolean updateSucceed = Boolean.parseBoolean(request.getParameter("updateSucceed")); 
	if(updateSucceed){
%>
	<h1>操作成功！</h1>
<%}else{ %>
	<h2>操作失败！</h2>
<%} %>
${requestScope.contextpath }
<a href= "book.index">返回首页</a>
</body>
</html>