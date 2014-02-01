<%-- 
    Document   : index2
    Created on : 29/01/2014, 07:27:04 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>
<html xmlns='http://www.w3.org/1999/xhtml'>
    <head>
             <meta http-equiv='Content-Type' content='text/html; charset=utf-8' /> 
             <link rel='StyleSheet' href='css/estilo.css' title='Contemporaneo'/> 
             <script src='js/jquery-1.10.2.min.js'></script> 
             <script src='http://code.jquery.com/jquery-migrate-1.2.1.min.js'></script> 
             <script src='js/ajax.js'></script> 
             <script src='js/scripts.js'></script> 
             <title>:: AFP - Prima ::</title> 
    </head>
    <body>
             <form name='frm' id='frm' action='Index1' method='post'> 
             <center> 
             <table border='0' cellpadding='0' cellspacing='0' style='width:850px'> 
             <tr> 
             <td class='cabecera'><img src='imagenes/logoPrima.jpg' /></td> 
             </tr> 
             <tr> 
             <td> 
             <div class='bordeExtremo'> 
              
             <div class='menu'> 
             <table border='0' cellpadding='0' cellspacing='0' style='width:700px'><tr><td> 
             <div class='marcado'><a href='index.html'>reg. de contrato de afil.</a></div> 
             <div><a href='consulta.html'>consulta de control afil.</a></div> 
             </td></tr></table> 
             </div> 
          
             <table border='0' cellpadding='0' cellspacing='0' width='100%'> 
             <tr> 
             <td> 
             <fieldset> 
             <legend>datos del formulario</legend> 
             <table> 
             <tr> 
             <td><label>Nro. Formulario:</label></td> 
             <td><input type='text' class='texto' id='txtnfr' name='txtnfr' /></td> 
             <td align='center'><label>Cod. Promotor:</label></td> 
             </tr> 
             <tr> 
             <td><label>Fecha de suscripi&oacute;n:</label></td> 
             <td><input type='text' class='texto' id='txtfsus' name='txtfsus' /></td> 
             <td><input type='text' class='texto' id='txtcodpro' name='txtcodpro' /></td> 
             </tr> 
             </table> 
             </fieldset> 
             </td> 
             <td></td> 
             </tr> 
             <tr> 
             <td colspan='2'> 
             <fieldset> 
             <legend>datos del afiliado</legend> 
             <table border='0' cellpadding='0' cellspacing='0' width='100%'> 
             <tr> 
             <td colspan='3'><label>Tipo Documento</label> 
             <select class='texto' id='cbotip' name='cbotip'> 
             <option value='1'>DNI</option> 
             <option value='2'>Carnet. Extranjeria</option> 
             </select> 
             <input type='text' name='txtnrodoc' id='txtnrodoc' class='texto' /> 
             <img class='imgbot' src='imagenes/lupa_old.png' />
             <input type="submit" name="consultar" type="submit" value="consultar"/>
             </td> 
             <td><label>CUSPP:</label><input type='text' id='txtcuspp' name='txtcuspp' class='texto'/></td> 
             </tr> 
             <tr> 
             <td><label>Primer Nombre</label></td> 
             <td align='center'><label>Seg. Nombre</label></td> 
             <td align='center'><label>Ap. Paterno</label></td> 
             <td align='center'><label>Ap. Materno</label></td> 
             </tr> 
             <tr> 
             <td><input type='text' name='txtpnom' id='txtpnom' class='texto' /></td> 
             <td><input type='text' name='txtsnom' id='txtsnom' class='texto' /></td> 
             <td><input type='text' name='txtamat' id='txtamat' class='texto' style='width:98%' /></td> 
             <td><input type='text' name='txtapat' id='txtapat' class='texto' style='width:98%' /></td> 
             </tr> 
             <tr> 
             <td><label>Dep. Nacimiento</label></td> 
             <td align='center'><label>Prov. Nacimiento</label></td> 
             <td align='center'><label>Dist. Nacimiento</label></td> 
             <td></td> 
             </tr> 
             <tr> 
             <td><input type='text' name='txtdepnac' id='txtdepnac' class='texto' /></td> 
             <td><input type='text' name='txtprovnac' id='txtprovnac' class='texto' /></td> 
             <td><input type='text' name='txtdisnac' id='txtdisnac' class='texto' /></td> 
             <td></td> 
             </tr> 
             <tr> 
             <td colspan='4'> 
             <table border='0' cellpadding='0' cellspacing='0' width='100%' style='margin-top:3px;'> 
             <tr> 
             <td><label>Direcci&oacute;n domicilio :</label></td> 
             <td colspan='2'><input class='texto' type='text' style='width:98%'/></td> 
             <td><label>Referencia :</label></td> 
             <td><input class='texto' type='text'/></td> 
             </tr> 
             <tr> 
             <td><label>Departamento</label></td> 
             <td><label>Provincia</label></td> 
             <td><label>Distrito</label></td> 
             <td><label>Telefono</label></td> 
             <td><label>Cod. Essalud</label></td> 
             </tr> 
             <tr> 
             <td><select class='texto'></select></td> 
             <td><select class='texto'></select></td> 
             <td><select class='texto'></select></td> 
             <td><input class='texto' type='text'/></td> 
             <td><input class='texto' type='text'/></td> 
             </tr> 
             </table> 
             </td> 
             </tr> 
             </table> 
             </fieldset> 
             </td> 
             </tr> 
             <tr> 
             <td colspan='2'> 
             <fieldset> 
             <legend>informaci&Oacute;n adicional del afiliado</legend> 
             <table border='0' cellpadding='0' cellspacing='0' width='100%'> 
             <tr> 
             <td><label>RUC : </label><input type='text' id='txtruc' name='txtruc' class='texto'/></td> 
             <td colspan='2'><img class='imgbot' src='imagenes/lupa_old.png' /><input type='text' id='txtraz' name='txtraz' class='texto' style='width:80%'/></td> 
             <td><label>Fec. Ini. Lab.: </label></td> 
             <td><input type='text' id='txtfinilab' name='txtfinilab' class='texto'/></td> 
             </tr> 
             <tr> 
             <td><label>RAM</label></td> 
             <td colspan='2'><label>Ocupaci&oacute;n ( Profesi&oacute;n )</label></td> 
             <td><label>Estado Civil :</label></td> 
             <td><select class='texto'> 
             <option value=''>Soltero</option> 
             <option value=''>Casado</option> 
             <option value=''>Separado</option> 
             <option value=''>Viudo</option> 
             </select></td> 
             </tr> 
             <tr> 
             <td><input type='text' id='txtcelu' name='txtcelu' class='texto'/></td> 
             <td colspan='2'><input type='text' id='txtcelu' name='txtcelu' class='texto' style='width:80%'/></td> 
             <td></td> 
             <td></td> 
             </tr> 
             <tr> 
             <td><label>Celular</label></td> 
             <td><label>Telf. Oficina</label></td> 
             <td><label>Anexo</label></td> 
             <td><label>Nro. Hijos</label></td> 
             <td></td> 
             </tr> 
             <tr> 
             <td><input type='text' id='txtcelu' name='txtcelu' class='texto'/></td> 
             <td><input type='text' id='txttelfofi' name='txttelfofi' class='texto'/></td> 
             <td><input type='text' id='txtanexo' name='txtanexo' class='texto'/></td> 
             <td><input type='text' id='txtnhijos' name='txtnhijos' class='texto'/></td> 
             <td></td> 
             </tr> 
             </table> 
             </fieldset> 
             </td> 
             </tr> 
             <tr> 
             <td colspan='2'> 
             <fieldset> 
             <legend>direcci&Oacute;n de correspondencia</legend> 
             <table border='0' cellpadding='0' cellspacing='0' width='100%'> 
             <tr> 
             <td><label>Pref. Direc. :</label></td> 
             <td colspan='4'><select class='texto'></select></td> 
             </tr> 
             <tr> 
             <td><label>Direc. :</label></td> 
             <td colspan='2'><input type='text' id='txtcelu' name='txtcelu' class='texto' style='width:90%'/></td> 
             <td><label>Referencia: </label></td> 
             <td><input type='text' id='txtcelu' name='txtcelu' class='texto'/></td> 
             </tr> 
             <tr> 
             <td><label>Departamento</label></td> 
             <td><label>Provincia</label></td> 
             <td><label>Distrito</label></td> 
             <td></td> 
             <td></td> 
             </tr> 
             <tr> 
             <td><select class='texto'></select></td> 
             <td><select class='texto'></select></td> 
             <td><select class='texto'></select></td> 
             <td></td> 
             <td></td> 
             </tr> 
             </table> 
             </fieldset> 
             <div class='dvbotones'><img src='imagenes/eliminar.png' class='imgbot' /><img src='imagenes/grabar.png' class='imgbot'/></div> 
             </td> 
             </tr> 
             </table> 
             </div> 
             </td> 
             </tr> 
             </table> 
             </center> 
             </form> 
    </body>
</html>
