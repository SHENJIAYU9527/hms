<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>layout</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/bootstrap.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/layout.css">

</head>
<body>
	<div id="layout" class="navbar navbar-inverse navbar-fixed-top">
		<div id="welcome">
			<div>
				<div><span>欢迎您，</span><span id="username"></span></div>
				<a class="btn btn-primary btn-sm" href="<%=request.getContextPath() %>/user/dologout">
                    <span>注销登录</span> 
                </a>
			</div>
		</div>
		<div id="hospital-tag">
			<img alt="宁夏医科大学总医院" src="<%=request.getContextPath() %>/images/ningxia.png" id="img_hospital">
		</div>
		<div id="hopital"><span>宁夏医科大学总医院慢病管理工作平台</span></div>
		<div id="menu"></div>
		<div id="new-check"></div>
	</div>
	<script src="<%=request.getContextPath() %>/js/jquery/jquery-1.9.1.min.js"></script>
	<script src="<%=request.getContextPath() %>/js/projectjs/layout.js"></script>
</html>