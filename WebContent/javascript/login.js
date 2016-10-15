/**
 * 
 */
function $(str){
	return document.getElementById(str);
}
function mover(){
	event.srcElement.focus();
	}
function mclick(){
	if($("submit").disabled==true)
		$("submit").disabled=false;
	if(event.srcElement.name=="name"&&event.srcElement.value=="请输入用户名:"){
		event.srcElement.value="";
	}
}
function mblur(){//失去焦点
	if(event.srcElement.name=="name"&&event.srcElement.value==""){
	event.srcElement.value="请输入用户名:";
	}
	if(event.srcElement.name=="password"&&event.srcElement.value=="")
	{
		alert("密码不能为空");
	}
	}
function check(){
	name = $("identity").value;
	password = $("password").value;
	message="";	
	if(!name.match("[^#@$.\"]{4,8}")){
		message+="用户名非法";
	}
	if(!password.match("\\w{6,11}")){
		message+="密码不符合规范";
	}
	if(message!=""){
		alert(message);
		$("submit").disabled=true;		
		return(false);
	}
	
}