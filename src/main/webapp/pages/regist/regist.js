/**
 * 
 * 注册脚本
 * @ xuxideng
 */
jQuery(function($){
	$('#userRegist').click(function(){
		var name = $('#name').val();
		var email = $('#email').val();
		var mobile = $('#mobile').val();
		var userpass = $('#subject').val();
		var question1 = $('#question1').val();
		var answer1 = $('#answer1').val();
		var question2 = $('#question2').val();
		var answer2 = $('#answer2').val();
		var params = {};
		params.name = name;
		params.email = email;
		params.mobile = mobile;
		params.userpass = userpass;
		params.question1 = question1;
		params.answer1 = answer1;
		params.question2 = question2;
		params.answer2 = answer2;
		
		
		$.ajax({
			url: './customer/regist',
			type: 'POST',
			data: params,
			dataType: 'Json',
			success: function(data){
				alert("注册成功！");
				window.location.href = "index.html";
				$("#nologin").hide();
				$("#userws").append("<div><p>"+ username +"</p></div>");
			}
			
		})
	});
})