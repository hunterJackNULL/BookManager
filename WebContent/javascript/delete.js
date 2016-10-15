/**
 * 
 */
 function $(str){
	return document.getElementById(str);
 }
 function checkDelete(){
	message = "确认删除这本书？";
	if(!confirm(message)){
		$("submit").disabled=true;
		return false;
	}
 }