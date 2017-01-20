/**
 * 用于随访界面数据加载和操作 作者：duningkai version 0.0.1 2016-12-30
 */
function getDueFU(para) {
	var fuType = para;
	var doctor = "0734";
	debugger;
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "patients",
		data : {
			doctor : doctor,
			followupType : fuType
		}
	}).done(function(results) {
		var target = $('#due_followups');
		if (fuType != 0) {
			target = $('#temp_followups');
		}
		target.append('<h3>' + JSON.stringify(results) + '</h3>');

	});
}
