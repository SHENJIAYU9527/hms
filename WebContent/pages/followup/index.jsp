<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>随访患者</title>
</head>
<body>
	<div class="header">
		<%@include file="../shared/layout.jsp"%>
	</div>
	<div class="container">
		<div id="level_nav" class="nav">
			<ul class="nav nav-tabs">
				<li><a href="#due_followups"><span>待随访患者</span><span
						id="num_0"></span></a></li>
				<li><a href="#temp_followups"><span>随访暂存患者</span><span
						id="num_2"></span></a></li>
			</ul>
		</div>
		<div id="due_followups"></div>
		<div id="temp_followups"></div>
	</div>
	<div class="footer">
		<span class="glyphicon glyphicon-copyright-mark"></span><span>
			2017 浙江大学 宁夏医科大学总医院</span>
	</div>
	<div class="dialog"></div>
	<script
		src="<%=request.getContextPath()%>/js/jquery/jquery.dataTables.js"></script>
	<script src="<%=request.getContextPath()%>/js/cdms/followup.js"></script>
	<script type="text/javascript">
		$(function() {
			//getDueFU(0);
		});
	</script>

</body>
</html>