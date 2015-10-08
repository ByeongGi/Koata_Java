/**
 * 
 */

var xhr = null;
function getXmlHttpRequest() {
	if (window.ActiveXObject) {
		xhr = new ActiveXObject("Microsoft.XMLHTTP");
	} else {
		xhr = new XMLHttpRequest();
	}
}

function sendRequest(url, param, callback, method) {
	getXmlHttpRequest();
	method = (method.toLowerCase() == 'get') ? 'GET' : 'POST'; // get / post 선택
	param = (param == null || param =='') ? null : param; // param null 이면 
	if (method == 'GET' && param != null) {
		url = url + '?' + param;
	}
	xhr.onreadystatechange = callback;
	xhr.open(method, url, true);
	// xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xhr.send(method == 'POST' ? param : null);
}