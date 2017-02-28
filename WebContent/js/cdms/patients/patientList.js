/**
 * 患者列表界面加载和操作 作者：duningkai version 0.0.1 2017-02-28
 */
function getPatients(doctor, type) {
	
	var doctor = doctor;
	var patientsType=type;
	debugger;
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "patients/",
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
