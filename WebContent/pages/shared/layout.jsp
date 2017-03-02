<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>layout</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/style.css">

</head>
<body>
	<div id="layout" class="navbar navbar-inverse navbar-fixed-top">

		<div id="hospital-tag">
			<img alt="宁夏医科大学总医院"
				src="<%=request.getContextPath()%>/images/ningxiatag.png"
				id="img_hospital">
		</div>

		<div id="hospital">
			<span>慢病管理工作平台</span>
		</div>
		<div id="menu" class="menu">
			<ul>
				<li><a href="<%=request.getContextPath()%>/warning/show">预警患者</a></li>
				<li><a href="<%=request.getContextPath()%>/followup/phone">随访患者</a></li>
				<li><a href="<%=request.getContextPath()%>/patients/show">患者列表</a></li>
				<li><a href="<%=request.getContextPath()%>/summary/show">工作总结</a></li>
			</ul>
			<div class="cls"></div>
		</div>

		<div id="new-check">
			<a class="btn btn-primary btn-lg"
				href="<%=request.getContextPath()%>/user/add"> <span
				class="glyphicon glyphicon-plus"></span><span>新建患者</span>
			</a> <a class="btn btn-primary btn-lg"
				href="<%=request.getContextPath()%>/user/check"> <span
				class="glyphicon glyphicon-check"></span><span>注册审核</span>
			</a>
		</div>
		<div id="welcome">
		    <%String name=(String)session.getAttribute("username"); %>
		    <%String id=(String)session.getAttribute("userid"); %>
			<div>
				<div>
					<span>欢迎您，</span><span id="username"><%=name%></span><input id="doctor_id" type="hidden" value="<%=id%>"/>
				</div>
				&nbsp;&nbsp;<a class="btn btn-primary btn-sm"
					href="<%=request.getContextPath()%>/user/dologout"> <span>注销登录</span>
				</a>
			</div>
		</div>
	</div>
	<script src="<%=request.getContextPath()%>/js/jquery/jquery-1.9.1.min.js"></script>
	<script language="javascript">
		$(document).ready(
				function() {

					$("#menu li a").wrapInner('<span class="out"></span>');

					$("#menu li a").each(
							function() {
								$(
										'<span class="over">' + $(this).text()
												+ '</span>').appendTo(this);
							});

					$("#menu li a").hover(function() {
						$(".out", this).stop().animate({
							'top' : '40px'
						}, 300); // move down - hide
						$(".over", this).stop().animate({
							'top' : '0px'
						}, 300); // move down - show

					}, function() {
						$(".out", this).stop().animate({
							'top' : '0px'
						}, 300); // move up - show
						$(".over", this).stop().animate({
							'top' : '-40px'
						}, 300); // move up - hide
					});

				});
	</script>
</html>