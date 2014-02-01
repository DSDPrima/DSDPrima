function limpiarRpta(rpta){
		var ind = 0;
		var ext = rpta.indexOf('<'); 
		var ext2 = rpta.indexOf('>'); 
		var limpio = false;
		rpta = rpta.replace(/\r\n|\n|\r/g, "");
		if(ext < 0){ limpio = true; }
		aux = rpta;
		while(limpio == false){
			rpta = aux.substring(ind,ext) + "" + aux.substring(ext2+1);
			ext = rpta.indexOf('<');
			ext2 = rpta.indexOf('>');
			aux = rpta;
			rpta = rpta.replace(" ", "");
			if(ext < 0){ limpio = true; }
		}
		rpta = aux;
		return trim(rpta);
	}
function trim (myString)
{
	return myString.replace(/^\s+/g,'').replace(/\s+$/g,'')
}
function validarPromo(){
	var dni = document.getElementById('txtcodpro').value;
	fConsultaRest('validarPromotor', '&dniPromotor='+dni,2);
}
function validacion(rpta){
	var rpta = limpiarRpta(rpta);
	var obj = jQuery.parseJSON(rpta);
	alert(obj.rpta);
}