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
		<%@include file="../shared/layout.jsp"%>
	</div>
	<div class="container">
		<div id="overview" class="inline">
			<div>
				<span>有效患者数：</span><span id="total_num" class="red"></span>
			</div>
			<div>
				<span>血压控制率：</span><span id="control_rate" class="red"></span>
			</div>
			<div>
				<span>管理生效周期：</span><span id="effective_term" class="red"></span>
			</div>
		</div>
		<div id="level_nav" class="nav">
			<ul class="nav nav-tabs">
				<li><a href="#patients_3"><span>新患者</span><span id="num_3"></span></a></li>
				<li><a href="#patients_1"><span>一级管理患者</span><span id="num_1"></span></a></li>
				<li><a href="#patients_2"><span>二级管理患者</span><span id="num_2"></span></a></li>
				<li><a href="#patients_0"><span>初级管理患者</span><span id="num_0"></span></a></li>
				<li><a href="#patients_end"><span>终止管理患者</span><span id="num_end"></span></a></li>
			</ul>
		</div>
		<div id="patients">
			<div id="patients_3"></div>
			<div id="patients_1"></div>
			<div id="patients_2"></div>
			<div id="patients_0"></div>
			<div id="patients_end"></div>
		</div>
	</div>
	<div class="footer">
		<span class="glyphicon glyphicon-copyright-mark"></span><span>
			2017 浙江大学 宁夏医科大学总医院</span>
	</div>
	<div class="dialog"></div>
</body>
</html>