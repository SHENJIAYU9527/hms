<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<TITLE>登陆界面</TITLE>


<STYLE>
body {
	background: #ebebeb;
	font-family: "Helvetica Neue", "Hiragino Sans GB", "Microsoft YaHei",
		"\9ED1\4F53", Arial, sans-serif;
	color: #222;
	font-size: 12px;
}

* {
	padding: 0px;
	margin: 0px;
}

.top_div {
	background: #008ead;
	width: 100%;
	height: 400px;
}

.ipt {
	border: 1px solid #d3d3d3;
	padding: 10px 10px;
	width: 290px;
	border-radius: 4px;
	padding-left: 35px;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	-webkit-transition: border-color ease-in-out .15s, -webkit-box-shadow
		ease-in-out .15s;
	-o-transition: border-color ease-in-out .15s, box-shadow ease-in-out
		.15s;
	transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s
}

.ipt:focus {
	border-color: #66afe9;
	outline: 0;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px
		rgba(102, 175, 233, .6);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px
		rgba(102, 175, 233, .6)
}

.u_logo {
	background: url("images/login/email.png") no-repeat;
	padding: 10px 10px;
	position: absolute;
	top: 43px;
	left: 40px;
}

.p_logo {
	background: url("images/login/password.png") no-repeat;
	padding: 10px 10px;
	position: absolute;
	top: 12px;
	left: 40px;
}
.ati {
	background: url("images/status/tip.png") no-repeat;
	padding: 10px 10px;
	position: relative;
	top: 12px;
	right: 5px;
}

.err {
	background: url("images/status/error.png") no-repeat;
	padding: 10px 10px;
	position: relative;
	top: 12px;
	right: 5px;
}

.ok {
	background: url("images/status/success.png") no-repeat;
	padding: 10px 10px;
	position: relative;
	top: 12px;
	right: 5px;
}
a {
	text-decoration: none;
}

.tou {
	background: url("images/login/tou.png") no-repeat;
	width: 97px;
	height: 92px;
	position: absolute;
	top: -87px;
	left: 140px;
}

.left_hand {
	background: url("images/login/left_hand.png") no-repeat;
	width: 32px;
	height: 37px;
	position: absolute;
	top: -38px;
	left: 150px;
}

.right_hand {
	background: url("images/login/right_hand.png") no-repeat;
	width: 32px;
	height: 37px;
	position: absolute;
	top: -38px;
	right: -64px;
}

.initial_left_hand {
	background: url("images/login/hand.png") no-repeat;
	width: 30px;
	height: 20px;
	position: absolute;
	top: -12px;
	left: 100px;
}

.initial_right_hand {
	background: url("images/login/hand.png") no-repeat;
	width: 30px;
	height: 20px;
	position: absolute;
	top: -12px;
	right: -112px;
}

.left_handing {
	background: url("images/login/left-handing.png") no-repeat;
	width: 30px;
	height: 20px;
	position: absolute;
	top: -24px;
	left: 139px;
}

.right_handinging {
	background: url("images/login/right_handing.png") no-repeat;
	width: 30px;
	height: 20px;
	position: absolute;
	top: -21px;
	left: 210px;
}

#hospital {
	position: relative;
	top: 80px;
	font-size: 50px;
	font-color: 0000f;
}
</STYLE>
<META name="GENERATOR" content="MSHTML 11.00.9600.17496">
</head>
<BODY>
	<div class="top_div">
		<h1 id="hospital" align="center">宁夏医科大学总医院慢病管理工作平台</h1>
	</div>
	<DIV
		style="background: rgb(255, 255, 255); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231); border-image: none; width: 400px; height: 230px; text-align: center;">

		<form action="DoLogin" method="post" id="login_form" name="login_form">
			<DIV style="width: 165px; height: 96px; position: absolute;">
				<DIV class="tou"></DIV>
				<DIV class="initial_left_hand" id="left_hand"></DIV>
				<DIV class="initial_right_hand" id="right_hand"></DIV>
			</DIV>



			<div style="padding: 30px 0px 10px; position: relative;">
				<SPAN class="u_logo"></SPAN> <INPUT class="ipt" type="text"
					placeholder="请输入用户名或邮箱" name="loginname"><label></label>
			</div>
			<div style="position: relative;">
				<SPAN class="p_logo"></SPAN> <INPUT class="ipt" id="password"
					type="password" placeholder="请输入密码" name="loginpass"><label></label>
			</div>

			<DIV
				style="height: 50px; line-height: 50px; margin-top: 30px; border-top-color: rgb(231, 231, 231); border-top-width: 1px; border-top-style: solid;">
				<P style="margin: 0px 35px 20px 45px;">
					<SPAN style="float: left;"><A
						style="color: rgb(204, 204, 204);" href="#">忘记密码?</A></SPAN> <SPAN
						style="float: right;"><A
						style="color: rgb(204, 204, 204); margin-right: 10px;"
						href="/javaiseasy/register">注册</A> <input type="submit"
						value="登陆"
						style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;">
					</SPAN>
				</P>
			</DIV>
		</form>
	</DIV>
	<div style="text-align: center;"></div>
	<SCRIPT src="js/jquery/jquery-1.9.1.min.js" type="text/javascript"></SCRIPT>
	<SCRIPT src="js/main/validation_login.js" type="text/javascript"></SCRIPT>
	<SCRIPT type="text/javascript">
		$(function() {
			//得到焦点
			$("#password").focus(function() {
				$("#left_hand").animate({
					left : "150",
					top : " -38"
				}, {
					step : function() {
						if (parseInt($("#left_hand").css("left")) > 140) {
							$("#left_hand").attr("class", "left_hand");
						}
					}
				}, 2000);
				$("#right_hand").animate({
					right : "-64",
					top : "-38px"
				}, {
					step : function() {
						if (parseInt($("#right_hand").css("right")) > -70) {
							$("#right_hand").attr("class", "right_hand");
						}
					}
				}, 2000);
			});
			//失去焦点
			$("#password").blur(function() {
				$("#left_hand").attr("class", "initial_left_hand");
				$("#left_hand").attr("style", "left:100px;top:-12px;");
				$("#right_hand").attr("class", "initial_right_hand");
				$("#right_hand").attr("style", "right:-112px;top:-12px");
			});
		});
	</SCRIPT>
</BODY>
</html>