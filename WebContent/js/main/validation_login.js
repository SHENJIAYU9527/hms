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


	// 选择所有p元素
	var aLabel = $("label");
	var name_msg = aLabel[0];
	var psw_msg = aLabel[1];

	// 根据id选择提示元素
	var count = $("b#count");
	var name_length = 0;


	$(":submit").first().attr("disabled", true);

	// 用户名验证
	oName.onfocus = function() {
		name_msg.style.display = "block";
		name_msg.innerHTML = '<i class="ati"></i>用户名为6-25个字符';

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
		else if (name_length < 6) {
			name_msg.innerHTML = '<i class="err"></i> 用戶名长度不能少于6个字符！'
		}
		// ok
		else {
			name_msg.innerHTML = '<i class="ok"></i> OK!'
				var aOK=$(".ok").size();
			if(aOK>=2){
				$(":submit").first().removeAttr("disabled");
			}
		}

	}

	// 密码验证
	oPwd.onfocus = function() {

		psw_msg.style.display = "block";
		psw_msg.innerHTML = '<i class="ati"></i>密码应为6-16个字符。'

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
		else if (this.value.length < 6 || this.value.length > 16) {
			psw_msg.innerHTML = '<i class="err"></i>密码长度应在6-16个字符之间！'
		}

		// 不能用相同字符
		else if (m == this.value.length) {
			psw_msg.innerHTML = '<i class="err"></i>密码不能全为相同字符！'
		}

		// 不能全为数字
		else if (!re_n.test(this.value)) {
			psw_msg.innerHTML = '<i class="err"></i>密码不能全为数字！'
		}

		// 不能全为字母
		else if (!re_w.test(this.value)) {
			psw_msg.innerHTML = '<i class="err"></i>密码不能全为字母！'
		}
		// OK
		else {
			psw_msg.innerHTML = '<i class="ok"></i>OK!'
				debugger;
			var aOK=$(".ok").size();
			
			if(aOK>=2){
				$(":submit").first().removeAttr("disabled");
			}
		}

	}

	
	

}
