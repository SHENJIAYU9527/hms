/**
 * 患者列表界面加载和操作 作者：duningkai version 0.0.1 2017-02-28
 */
//将Timestamp日期格式转变为指定格式的字符串
function getMyDate(time) {
	var oDate = new Date(time), oYear = oDate.getFullYear(), oMonth = oDate
			.getMonth() + 1, oDay = oDate.getDate(),
	// oHour = oDate.getHours(),
	// oMin = oDate.getMinutes(),
	// oSen = oDate.getSeconds(),
	oTime = oYear + '-' + getzf(oMonth) + '-' + getzf(oDay);// 最后拼接时间
	if (oYear < 2000) {
		oTime = "";
	}

	return oTime;
};
//根据日期获取年龄
function getAge(time) {
	var oDate = new Date(time);
	var oYear = oDate.getFullYear();
	var age = new Date().getFullYear() - oYear;
	return age;
};

// 补0操作,当时间数据小于10的时候，给该数据前面加一个0
function getzf(num) {
	if (parseInt(num) < 10) {
		num = '0' + num;
	}
	return num;
}


	
//获取患者列表，并以datatable进行显示
function getPatients(type) {

	var doctor = $("#doctor_id").val();
	var patientsType = type;
	$
			.ajax({
				type : "POST",
				dataType : "json",
				url : "/hms/patients/plist",
				data : {
					doctor : doctor,
					type : patientsType
				},
				success : function(data) {

					$('#patients');
					var target = $('#patients');
					target.empty();
					target
							.append('<table id="patients_table" class="display" cellspacing="0" width="100%"><thead><tr><th>序号</th><th>状态</th><th>姓名</th><th>ID</th><th>性别</th><th>年龄</th><th>管理日期</th><th>诊断结论</th><th>主治医生</th><th>最近随访</th><th>患者详情</th><th></th></tr></thead></table>');
					var t = $("#patients_table").DataTable({

						data : data,
						"oLanguage": {
							"sLengthMenu": "每页显示 _MENU_ 条记录",
							"sZeroRecords": "抱歉， 没有找到",
							//"sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
							"sInfoEmpty": "没有数据",
							//"sInfoFiltered": "(从 _MAX_ 条数据中检索)",
							"oPaginate": {
							"sFirst": "首页",
							"sPrevious": "前一页",
							"sNext": "后一页",
							"sLast": "尾页"
							},
							"sZeroRecords": "没有检索到数据",
							"sProcessing": "<img src='./loading.gif' />"
							},
						"aaSorting" : [ [ 1, "asc" ] ],
						columns : [ {
							data : null
						}, {
							data : 'complication'
						}, {
							data : 'fullName'
						}, {
							data : 'patientIdentifier'
						}, {
							data : 'sexCode'
						}, {
							data : function(obj) {
								return getAge(obj.birthDate)// 通过调用函数来格式化所获取的时间戳
							}
						}, {
							data : function(obj) {
								return getMyDate(obj.admitDateTime)
							}
						}, {
							data : 'diagnosisItemName'
						}, {
							data : 'manageDoctor'
						}, {
							data : function(obj) {
								return getMyDate(obj.latestFollowTime)
							}
						},{
							data : ""
						} ],
						"info" : false,
						"aoColumnDefs" : [ {
							"bSortable" : true,
							"aTargets" : [ 0 ]
						}, {
							"bSortable" : true,
							"aTargets" : [ 1 ]
						}, {
							"bSortable" : true,
							"aTargets" : [ 2 ]
						}, {
							"bSortable" : true,
							"aTargets" : [ 3 ]
						}, {
							"bSortable" : true,
							"aTargets" : [ 4 ]
						}, {
							"bSortable" : true,
							"aTargets" : [ 5 ]
						}, {
							"bSortable" : true,
							"aTargets" : [ 6 ]
						}

						]
					});
					t.on('order.dt search.dt', function() {
						t.column(0, {
							search : 'applied',
							order : 'applied'
						}).nodes().each(function(cell, i) {
							cell.innerHTML = i + 1;
						});
					}).draw();

				}

			});
}
