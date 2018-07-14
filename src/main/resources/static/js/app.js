function validate() {
	var name = document.getElementById("message").value;
	if (name == '') {
		alert('Please enter a valid message.');
		return false;
	} else {
		return true;
	}
}