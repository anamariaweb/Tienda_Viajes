$(document).ready(function(){
	$('a.active').removeClass('active');
	$('a[href="'+ location.pathname + '"]').addClass('active');
	
	
});