/**
 * 
 */

$(document).ready(function() {
	$("#link-search").click(function() {
		
		var filter = $("#input-search").val();
		if(filter.length > 0) {			
			$.ajax({
				url : "/app/students/searchByFirstName/" + filter
			}).done(function() {
				location.reload();
			});
		}
		else {
			$.ajax({
				url : "/app/students/noFilter"
			}).done(function() {
				location.reload();
			});
		}		
	});
});