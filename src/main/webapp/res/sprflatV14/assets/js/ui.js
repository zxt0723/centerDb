/**
 * @author zxt_0723@163.com
 * 
 */
var hishoryUrl;
var currUrl;
bootbox.setDefaults("locale", "zh_CN");
function initMy() {

	$("a[target=navTab]").each(function() {
		console.log($(this).attr("href"));
		// alert('ddd');
		$(this).unbind('click').click(function(event) {

			var $ts = $(this);

			var url = unescape($ts.attr("href"));
			hishoryUrl = currUrl;
			currUrl = url;
			// $('#loading').modal('show');
			htmlobj = $.ajax({
				url : url,
				async : false
			});

			$("#content-wrapper").html(htmlobj.responseText);
			// $('#loading').modal('hidden');
			event.preventDefault();
			initMy();
		});
	});
	// 返回对话框
	$("#return").attr("href", hishoryUrl);

	$("a[target=ajaxTodo]").each(function() {
		var $this = $(this);

		$(this).unbind('click').click(function(event) {

			if ($this.hasClass('disabled')) {
				return false;
			}
			var url = unescape($this.attr("href"))
			var title = $this.attr("title");
			if (title) {
				bootbox.confirm({
					message : title,
					title : "确定吗?",
					callback : function(result) {
						console.log(result);
						if (result) {
							ajaxTodo(url, $this.attr("callback"));
						}
						;
					}
				});
			}
			event.preventDefault();
		});
	});
};

function ajaxTodo(url, callback) {
	var $callback = callback || navTabAjaxDone;
	if (!$.isFunction($callback))
		$callback = eval('(' + callback + ')');
	$.ajax({
		type : 'GET',
		url : url,
		dataType : "json",
		cache : false,
		success : $callback,
		error : ajaxError
	});
};

function validateCallback(form, callback, confirmMsg) {

	var $form = $(form);

	var _submitFn = function() {
		// $form.find(':focus').blur();
		var params = $form.serialize();
		$.ajax({
			type : form.method || 'POST',
			url : $form.attr("action"),
			data : params,
			encoding : "UTF-8",
			dataType : "json",
			cache : false,
			success : callback || ajaxDone,
			error : ajaxError
		});
	}

	if (confirmMsg) {
		bootbox.confirm({
			message : confirmMsg,
			title : "确定吗?",
			callback : function(result) {
				console.log(result);
				if (result) {
					_submitFn();
				} else {
					return false;
				}
			}
		});
	} else {
		_submitFn();
	}

	return false;
}





/*
 * tab ajax 刷新
 */

function navTabAjaxDone(json) {
	checkStatus(json)
	if (json["statusCode"] == "200") {
		if ("forward" == json.callbackType) {
			// navTab.reload(json.forwardUrl);
			htmlobj = $.ajax({
				url : json.forwardUrl,
				async : false
			});
			//
			$("#content-wrapper").html(htmlobj.responseText);
			//msg(json.message);
			//alert("dddd");
			initMy();
		}
	}
}
/*
 * 提示框
 */
function msg(txt) {
	$.extend($.gritter.options, {
		position : 'bottom-right',
	});
	$.gritter.add({
		// (string | mandatory) the heading of the notification
		title : 'Success !!!',
		// (string | mandatory) the text inside the notification
		text : txt,
		// (int | optional) the time you want it to be alive for before fading
		// out
		time : '',
		// (string) specify font-face icon class for close message
		close_icon : 'en-cross',
		// (string) specify font-face icon class for big icon in left. if are
		// specify image this will not show up.
		icon : 'ec-users',
		// (string | optional) the class name you want to apply to that specific
		// message
		class_name : 'error-notice'
	});
}
/*
 * 检查 ajax 返回值的状体
 */

function checkStatus(json) {
	if (json["statusCode"] == "300") {
		if (json["message"])
			bootbox.alert(json["message"]);
	} else if (json["statusCode"] == "301") {
		bootbox.alert("超时");
		// 加载超时处理 调到主页面
	} else if (json["statusCode"] == "200") {
		if (json["message"])
			msg(json["message"]);
	}
	;
}
/*
 * ajax 错误提示
 */
function ajaxError(xhr, ajaxOptions, thrownError) {
	bootbox.alert({
		message : "<div>Http status: " + xhr.status + " " + xhr.statusText
				+ "</div>" + "<div>ajaxOptions: " + ajaxOptions + "</div>"
				+ "<div>thrownError: " + thrownError + "</div>" + "<div>"
				+ xhr.responseText + "</div>",
		size : 'large'
	});
}
