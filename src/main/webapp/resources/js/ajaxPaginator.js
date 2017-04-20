/**
 * Script to pagination
 */

$(document).ready(function() {
	$(".btn-first-page").click(function() {
		$.ajax({
			url : "/app/firstPage"
		}).done(function() {
			location.reload();
		});
	});

	$(".btn-previous-page").click(function() {
		$.ajax({
			url : "/app/previousPage"
		}).done(function() {
			location.reload();
		});
	});

	$(".btn-next-page").click(function() {
		$.ajax({
			url : "/app/nextPage"
		}).done(function() {
			location.reload();
		});
	});
});