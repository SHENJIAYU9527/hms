/**
 * 用于随访界面数据加载和操作 作者：duningkai version 0.0.1 2016-12-30
 */
function getDueFU(para) {
    var fuType = para;
    $.ajax({
        type: "POST",
        dataType: "json",
        url: "due",
        data: {
            followupType: fuType
        }
    }).done(function(results) {
    	
    	

    });
}
