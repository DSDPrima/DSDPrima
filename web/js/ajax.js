function creaAjax() {
var req;
try {
	req = new XMLHttpRequest();
} catch(err1) {
	try {
		req = new ActiveXObject("Msxml2.XMLHTTP");
	} catch (err2) {
		try {
			req = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (err3) {
				req = false;
			}
		}
	}
	return req;
}

vAjax = creaAjax();
function fConsultaRest(method, vars, option){
	ruta = "http://www.edugonzales.com/rest/ServerRest/?method="+method;
	/*ruta = "http://localhost/mysite/rest/ServerRest/?method="+method;*/
	
	myRand = parseInt(Math.random()*999999999999999);
	var modurl = ruta +"&rand=" + myRand + vars; 
	vAjax.open("GET", modurl, true);
	switch(option){
		case 1:
			vAjax.onreadystatechange = rPruebaSes;
			break;
		case 2:
			vAjax.onreadystatechange = rValidaRest;
			break;
		case 3:
			vAjax.onreadystatechange = rListaRest;
			break;
	}
	vAjax.send(null);
}
/* Prueba Rest */
function rPruebaSes() {
	if (vAjax.readyState == 4) {
		if(vAjax.status == 200) {
			prueba(vAjax.responseText);
		}
	}
}
/* Validar Rest */
function rValidaRest() {
	if (vAjax.readyState == 4) {
		if(vAjax.status == 200) {
			validacion(vAjax.responseText);
		}
	}
}
/* Lista Rest */
function rListaRest() {
	if (vAjax.readyState == 4) {
		if(vAjax.status == 200) {
			listado(vAjax.responseText);
		}
	}
}