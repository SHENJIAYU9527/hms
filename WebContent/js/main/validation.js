/**
 * 用于验证注册和登陆 作者：duningkai version 0.0.1 2016-10-26
 */
function findStr(str, n) {
	var temp = 0;
	for (var i = 0; i < str.length; i++) {
		if (str.charAt(i) == n) {
			temp++
		}
	}
	return temp;
}
function getLength(str) {
	return str.replace(/[^\x00-xff]/g, "xx").length;

}

window.onload = function() {

	// 抓取所有input元素
	var aInput = $("input");
	var oName = aInput[0];
	var oPwd = aInput[1];
	var oEmail = aInput[2];

	// 选择所有p元素
	var aLabel = $("label");
	var name_msg = aLabel[0];
	var psw_msg = aLabel[1];
	var email_msg = aLabel[2];
	// 根据id选择提示元素
	var count = $("b#count");
	var aEm = $("em");
	var name_length = 0;

	// 正则表达式创建有两种方法
	var re = new RegExp("a", "i");
	var re2 = /a/i;

	$(":submit").first().attr("disabled", true);

	// 用户名验证
	oName.onfocus = function() {
		name_msg.style.display = "block";
		name_msg.innerHTML = '<i class="ati"></i>3-25个字符，推荐使用您的医院工号';

	}
	oName.onkeyup = function() {

	}
	oName.onblur = function() {
		// 含有非法字符
		var reg_username = /[^\w\u4e00-\u9fa5]/g; // 数字、字母（不区分大小写）、汉字、下划线 //
													// \u4e00-\u9fa5 表示所有中文字符
		name_length = getLength(this.value);
		if (reg_username.test(this.value)) {
			name_msg.innerHTML = '<i class="err"></i> 用戶名含有非法字符！'
		}
		// 不能为空
		else if (this.value == "") {
			name_msg.innerHTML = '<i class="err"></i> 用戶名不能为空！'
		}
		// 长度超过25个字符
		else if (name_length > 25) {
			name_msg.innerHTML = '<i class="err"></i> 用戶名长度不能超过25个字符！'
		}

		// 长度少于6个字符
		else if (name_length < 3) {
			name_msg.innerHTML = '<i class="err"></i> 用戶名长度不能少于3个字符！'
		}
		// ok
		else {
			name_msg.innerHTML = '<i class="ok"></i> OK!'
				var aOK=$(".ok").size();
			if(aOK>=3){
				$(":submit").first().removeAttr("disabled");
			}
		}

	}

	// 密码验证
	oPwd.onfocus = function() {

		psw_msg.style.display = "block";
		psw_msg.innerHTML = '<i class="ati"></i>4-16个字符，推荐字母加数字加符号的组合密码。'

	}

	oPwd.onblur = function() {
		var m = findStr(oPwd.value, oPwd.value[0]);
		var re_n = /[^\d]/g;
		var re_w = /[^a-zA-Z]/g;

		// 不能为空
		if (this.value == "") {
			psw_msg.innerHTML = '<i class="err"></i>密码不能为空！'
		}
		// 长度应为6-16
		else if (this.value.length < 4 || this.value.length > 16) {
			psw_msg.innerHTML = '<i class="err"></i>密码长度应在6-16个字符之间！'
		}

		// 不能用相同字符
		else if (m == this.value.length) {
			psw_msg.innerHTML = '<i class="err"></i>密码不能全为相同字符！'
		}

		// 不能全为数字
//		else if (!re_n.test(this.value)) {
//			psw_msg.innerHTML = '<i class="err"></i>密码不能全为数字！'
//		}

		// 不能全为字母
//		else if (!re_w.test(this.value)) {
//			psw_msg.innerHTML = '<i class="err"></i>密码不能全为字母！'
//		}
		// OK
		else {
			psw_msg.innerHTML = '<i class="ok"></i>OK!'
			var aOK=$(".ok").size();
			if(aOK>=3){
				$(":submit").first().removeAttr("disabled");
			}
		}

	}

	// 邮箱验证
	oEmail.onfocus = function() {

		email_msg.style.display = "block";
		email_msg.innerHTML = '<i class="ati"></i>请输入您正确的姓名信息。'

	}
	oEmail.onblur = function() {
		var re_email = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		// 不能为空
		if (this.value == "") {
			email_msg.innerHTML = '<i class="err"></i>姓名不能为空！'
		}
//		// 邮箱格式正确
//		else if (!re_email.test(this.value)) {
//			email_msg.innerHTML = '<i class="err"></i>请输入正确的邮箱格式！'
//		} 
		else {
			
			email_msg.innerHTML = '<i class="ok"></i>OK!'
				var aOK=$(".ok").size();
			if(aOK>=3){
				$(":submit").first().removeAttr("disabled");
			}
		}

	}

}
