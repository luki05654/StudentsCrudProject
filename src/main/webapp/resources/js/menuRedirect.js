$(document).ready(function() {
	$("#button-plain-user").click(function () {
		$.ajax({
			type : "GET",
			url : "/plainUser"
		});
	});
});