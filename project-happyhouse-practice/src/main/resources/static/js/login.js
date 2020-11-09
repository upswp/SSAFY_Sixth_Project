$(document).ready(function() {
	$("#loginBtn").click(function() {
		
		if($("#userid").val() == "") {
			alert("아이디 입력!!!");
			return;
		} else if($("#userpwd").val() == "") {
			alert("비밀번호 입력!!!");
			return;
		} else {
			$("#loginform").attr("action", "login").submit();
		}
	});
	 
	$('#mvRegisterBtn').focusin(function() {
		$(location).attr("href", "${root}/");
	});
});
	  
function moveJoin() {
	document.location.href = "${root}/member?act=join";
}	