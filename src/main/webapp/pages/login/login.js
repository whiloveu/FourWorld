jQuery(function($){
	$('#sfclogin').click(function(){
		var username = $.trim($("#sfcusername").val());
		var userpass = $.trim($("#sfcuserpass").val());
		var params = {};
		params.username = username;
		params.userpass = userpass;
		$.ajax({
			url: "./customer/login",
			type: "POST",
			data: params,
			dataTypes: "Json",
			success: function(data){
				window.location.href = "index.html";
				$("#nologin").hide();
				$("#userws").append("<div><p>"+ username +"</p></div>");
			}
		
			
		})
	})
		
	         
	
})