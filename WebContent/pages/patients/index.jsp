<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>患者列表</title>
</head>
<body>
	<div class="header">
	<%@include file="../shared/layout.jsp" %>
	</div>
	<div class="content">
	<h1><%=request.getContextPath() %></h1>
	</div>
	<div class="footer">
	<h1><%=request.getAttribute("username") %></h1>
	</div>
	<div class="dialog">
	
	</div>
</body>
</html>