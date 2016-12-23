<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>layout</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/bootstrap.css">
</head>
<body>
	<div>
		<div id="welcome">
			<div>
				<div><span>欢迎您，</span><span id="username"></span></div>
				<button class="btn btn-primary btn-sm" onclick="logOut()">
                    <span>注销登录</span> 
                </button>
			</div>
		</div>
		<div id="hospital-tag"></div>
		<div id="hopital"></div>
		<div id="menu"></div>
		<div id="new-check"></div>
	</div>
	<script src="<%=request.getContextPath() %>/js/jquery/jquery-1.9.1.min.js"></script>
	<script src="<%=request.getContextPath() %>/js/projectjs/layout.js"></script>
</html>