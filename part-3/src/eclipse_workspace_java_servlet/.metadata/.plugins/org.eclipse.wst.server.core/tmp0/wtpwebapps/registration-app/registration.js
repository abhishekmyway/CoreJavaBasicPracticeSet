function validateRegistration(){
	var thisFrom = document.forms[0];
	var fn = thisForm.firstName;
	if(fn.value.length == 0){
		alert("plz enter firstName");
		fn.focus();
		return false;
	}
	return true;
}