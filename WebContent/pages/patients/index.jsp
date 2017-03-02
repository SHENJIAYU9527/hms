<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>患者列表</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/jquery.dataTables.css">
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

			<ul id="level_ul" class="nav nav-tabs">
				<li onclick="getPatients(3)" class="greybg"><a><span>新患者</span><span
						id="num_3"></span></a></li>
				<li onclick="getPatients(1)"><a><span>一级管理患者</span><span
						id="num_1"></span></a></li>
				<li onclick="getPatients(2)"><a><span>二级管理患者</span><span
						id="num_2"></span></a></li>
				<li onclick="getPatients(0)"><a><span>初级管理患者</span><span
						id="num_0"></span></a></li>
				<li onclick="getEndPatients()"><a><span>终止管理患者</span><span
						id="num_end"></span></a></li>
			</ul>
		</div>
		<div id="patients"></div>
	</div>


	<div class="footer">
		<span class="glyphicon glyphicon-copyright-mark"></span><span>
			2017 浙江大学 宁夏医科大学总医院</span>
	</div>
	<div class="dialog"></div>
	<script
		src="<%=request.getContextPath()%>/js/jquery/jquery.dataTables.js"></script>
	<script
		src="<%=request.getContextPath()%>/js/cdms/patients/patientList.js"></script>
	<script type="text/javascript">
	//修改导航栏样式
	$(document).ready(function(){
		  var lis=$("#level_ul li");
		  debugger;
		  lis.click(function(){
		    lis.each(function(){
		      $(this).removeClass("greybg");
		    })
		    $(this).addClass("greybg");
		  })
		})
		$(function() {
			
			getPatients(3);
		});
	</script>
</body>
</html>