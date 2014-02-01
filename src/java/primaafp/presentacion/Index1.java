/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primaafp.presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import junit.framework.Assert;

import primaafp.dao.ContratoAfiliacionDAO;
import primaafp.excepcion.DAOExcepcion;
import primaafp.negocio.GestionContratoAfiliacion;
import upc.edu.reniec.Persona;
import upc.edu.reniec.ServicioReniec_Service;
import upc.edu.sunat.Empresa;
import upc.edu.sunat.ServicioSUNAT_Service;

/**
 *
 * @author pc
 */
@WebServlet(name = "Index1", urlPatterns = {"/Index1"})
public class Index1 extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/env-3370651.jelastic.servint.net/ServicioSUNAT/ServicioSUNAT.wsdl")
    private ServicioSUNAT_Service service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/env-3370651.jelastic.servint.net/ServicioReniec/ServicioReniec.wsdl")
    private ServicioReniec_Service service;

    public Persona personaconsulta = new Persona();  
    public Empresa empresaconsulta = new Empresa();
    
    String primernombre=" ";
    String segundonombre=" ";
    String primerapellido=" ";
    String segundoapellido=" ";
    String distrito=" ";
    String provincia=" ";
    String departamento=" ";
    String telefono=" ";
    String essalud=" ";
    String distrito1="";
    String provincia1="";
    String departamento1="";
    String dni="";
    
    String RUC="";
    String Descripcion="";
    String RAM="";
    String Profesion="";
    String FechaInicioLaboral="";
    String EstadoCivil="";
    String Celular="";
    String TelefonoOficina="";
    String Anexo="";
    String NroHijos="";
    
    String DireccionPreferencia="";
    String TipoPreferenciaDireccion="";
    String Referencia="";
    String DepartamentoS="";
    String ProvinciaS="";
    String DistritoS="";
    String Observacion="";
    
    String Mensaje="";
    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>");
            out.println("<html xmlns='http://www.w3.org/1999/xhtml'> ");
            out.println("<head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />");
            out.println("<link rel='StyleSheet' href='css/estilo.css' title='Contemporaneo'/>");
            out.println("<script src='js/jquery-1.10.2.min.js'></script>");
            out.println("<script src='http://code.jquery.com/jquery-migrate-1.2.1.min.js'></script>");
            out.println("<script src='js/ajax.js'></script>");
            out.println("<script src='js/scripts.js'></script>");
            out.println("<title>:: AFP - Prima -servelt ::</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form name='frm' id='frm' action='Index1' method='post'>");
            out.println("<center>");
            out.println("<table border='0' cellpadding='0' cellspacing='0' style='width:850px'>");
            out.println("<tr>");
            out.println("<td class='cabecera'><img src='imagenes/logoPrima.jpg' /></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<div class='bordeExtremo'>");
            /*Menu Afiliado*/
            
            out.println("<div class='menu'>");
            out.println("<table border='0' cellpadding='0' cellspacing='0' style='width:700px'><tr><td>");
            out.println("<div class='marcado'><a href='index.html'>reg. de contrato de afil.</a></div>");
            out.println("<div><a href='consulta.html'>consulta de control afil.</a></div>");
            out.println("</td></tr></table>");
            out.println("</div>");
            /*Cuerpo Pagina*/
            out.println("<table border='0' cellpadding='0' cellspacing='0' width='100%'>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<fieldset>");
            out.println("<legend>datos del formulario</legend>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td><label>Nro. Formulario:</label></td>");
            out.println("<td><input type='text' class='texto' id='txtnfr' name='txtnfr' /></td>");
            out.println("<td align='center'><label>Cod. Promotor:</label></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Fecha de suscripi&oacute;n:</label></td>");
            out.println("<td><input type='text' class='texto' id='txtfsus' name='txtfsus' /></td>");
            out.println("<td><input type='text' class='texto' id='txtcodpro' name='txtcodpro' /><input type='button' class='boton' value='Validar' onclick=\"validarPromo()\"/></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</fieldset>");
            out.println("</td>");
            out.println("<td></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='2'>");
            out.println("<fieldset>");
            out.println("<legend>datos del afiliado</legend>");
            out.println("<table border='0' cellpadding='0' cellspacing='0' width='100%'>");
            out.println("<tr>");
            out.println("<td colspan='3'><label>Tipo Documento</label>");
            out.println("<select class='texto' id='cbotip' name='cbotip'>");
            out.println("<option value='1'>DNI</option>");
            out.println("<option value='2'>Carnet. Extranjeria</option>");
            out.println("</select>");
            out.println("<input type='text' name='txtnrodoc' id='txtnrodoc' class='texto' value='"+ dni+"'/>");
            out.println("<input type='submit' class='boton' value='ValidarDNI' /></td>");
            out.println("<td><label>CUSPP:</label><input type='text' id='txtcuspp' name='txtcuspp' class='texto'/></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Primer Nombre</label></td>");
            out.println("<td align='center'><label>Seg. Nombre</label></td>");
            out.println("<td align='center'><label>Ap. Paterno</label></td>");
            out.println("<td align='center'><label>Ap. Materno</label></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><input type='text' name='txtpnom' id='txtpnom' class='texto' value='"+ primernombre+"' /></td>");
            out.println("<td><input type='text' name='txtsnom' id='txtsnom' class='texto' value='"+ segundonombre+"'/></td>");
            out.println("<td><input type='text' name='txtamat' id='txtamat' class='texto' style='width:98%' value='"+ primerapellido+"'/></td>");
            out.println("<td><input type='text' name='txtapat' id='txtapat' class='texto' style='width:98%' value='"+ segundoapellido+"'/></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Dep. Nacimiento</label></td>");
            out.println("<td align='center'><label>Prov. Nacimiento</label></td>");
            out.println("<td align='center'><label>Dist. Nacimiento</label></td>");
            out.println("<td></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><input type='text' name='txtdepnac' id='txtdepnac' class='texto' value='"+ departamento+"'/></td>");
            out.println("<td><input type='text' name='txtprovnac' id='txtprovnac' class='texto' value='"+ provincia+"'/></td>");
            out.println("<td><input type='text' name='txtdisnac' id='txtdisnac' class='texto' value='"+ distrito+"'/></td>");
            out.println("<td></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='4'>");
            out.println("<table border='0' cellpadding='0' cellspacing='0' width='100%' style='margin-top:3px;'>");
            out.println("<tr>");
            out.println("<td><label>Direcci&oacute;n domicilio :</label></td>");
            out.println("<td colspan='2'><input class='texto' type='text' style='width:98%'/></td>");
            out.println("<td><label>Referencia :</label></td>");
            out.println("<td><input class='texto' type='text'/></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Departamento</label></td>");
            out.println("<td><label>Provincia</label></td>");
            out.println("<td><label>Distrito</label></td>");
            out.println("<td><label>Telefono</label></td>");
            out.println("<td><label>Cod. Essalud</label></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><input type='text' name='txtdepnac1' id='txtdepnac1'class='texto'  value='"+ departamento+"'/></td>");
            out.println("<td><input type='text' name='txtprovnac1' id='txtprovnac1' class='texto'  value='"+ provincia+"'/></td>");
            out.println("<td><input type='text' name='txtdisnac1' id='txtdisnac1' class='texto'  value='"+ distrito+"'/></td>");
            out.println("<td><input type='text' name='txttelefono' id='txttelefono' class='texto'  value='"+ telefono+"'/></td>");
            out.println("<td><input type='text' name='txtEssalud' id='txtEssalud' class='texto'  value='"+ essalud+"'/></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</fieldset>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='2'>");
            out.println("<fieldset>");
            out.println("<legend>informaci&Oacute;n adicional del afiliado</legend>");
            out.println("<table border='0' cellpadding='0' cellspacing='0' width='100%'>");
            out.println("<tr>");
            out.println("<td><label>RUC : </label><input type='text' id='txtruc' name='txtruc' class='texto' value='" + RUC +"'/></td>");
            out.println("<td colspan='2'><input type='text' id='txtraz' name='txtraz' class='texto' style='width:80%' value='" + Descripcion +"'/></td>");
            out.println("<td><label>Fec. Ini. Lab.: </label></td>");
            out.println("<td><input type='text' id='txtfinilab' name='txtfinilab' class='texto' value='"+ FechaInicioLaboral+"'/></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>RAM</label></td>");
            out.println("<td colspan='2'><label>Ocupaci&oacute;n ( Profesi&oacute;n )</label></td>");
            out.println("<td><label>Estado Civil :</label></td>");
            out.println("<td><input type='text' id='txtestado' name='txtestado' class='texto' value='"+ EstadoCivil +"'/></td>");
            /*out.println("<td><select class='texto'>");
            out.println("<option value=''>Soltero</option>");
            out.println("<option value=''>Casado</option>");
            out.println("<option value=''>Separado</option>");
            out.println("<option value=''>Viudo</option>");
            out.println("</select></td>");*/
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><input type='text' id='txtram' name='txtram' class='texto' value='"+ RAM +"'/></td>");
            out.println("<td colspan='2'><input type='text' id='txtprofesion' name='txtprofesion' class='texto' style='width:80%' value='"+ Profesion +"'/></td>");
            out.println("<td></td>");
            out.println("<td></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Celular</label></td>");
            out.println("<td><label>Telf. Oficina</label></td>");
            out.println("<td><label>Anexo</label></td>");
            out.println("<td><label>Nro. Hijos</label></td>");
            out.println("<td><input type='submit' class='boton' style='width:100%' value='ValidarSUNAT'/></td>");
            out.println("<td></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><input type='text' id='txtcelu' name='txtcelu' class='texto' value='"+ Celular +"'/></td>");
            out.println("<td><input type='text' id='txttelfofi' name='txttelfofi' class='texto' value='"+ TelefonoOficina +"'/></td>");
            out.println("<td><input type='text' id='txtanexo' name='txtanexo' class='texto' value='"+ Anexo +"'/></td>");
            out.println("<td><input type='text' id='txtnhijos' name='txtnhijos' class='texto' value='"+ NroHijos +"'/></td>");
            out.println("<td></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</fieldset>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='2'>");
            out.println("<fieldset>");
            out.println("<legend>direcci&Oacute;n de correspondencia</legend>");
            out.println("<table border='0' cellpadding='0' cellspacing='0' width='100%'>");
            out.println("<tr>");
            out.println("<td><label>Pref. Direc. :</label></td>");
            out.println("<td colspan='2'><input type='text' id='txttipopreferenciadireccion' name='txttipopreferenciadireccion' class='texto' style='width:90%' value='"+ TipoPreferenciaDireccion +"'/></td>");
            //out.println("<td colspan='4'><select class='texto'></select></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Direc. :</label></td>");
            out.println("<td colspan='2'><input type='text' id='txtdireccion' name='txtdireccion' class='texto' style='width:90%' value='"+ DireccionPreferencia +"'/></td>");
            out.println("<td><label>Referencia: </label></td>");
            out.println("<td><input type='text' id='txtreferencia' name='txtreferencia' class='texto' value='"+ Referencia +"'/></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Departamento</label></td>");
            out.println("<td><label>Provincia</label></td>");
            out.println("<td><label>Distrito</label></td>");
            out.println("<td></td>");
            out.println("<td></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><input type='text' id='txtDepartamentoS' name='txtDepartamentoS' class='texto' value='"+ DepartamentoS +"'/></td>");
            out.println("<td><input type='text' id='txtProvinciaS' name='txtProvinciaS' class='texto' value='"+ ProvinciaS +"'/></td>");
            out.println("<td><input type='text' id='txtDistritoS' name='txtDistritoS' class='texto' value='"+ DistritoS +"'/></td>");
            //out.println("<td><select class='texto'></select></td>");
            //out.println("<td><select class='texto'></select></td>");
            //out.println("<td><select class='texto'></select></td>");
            out.println("<td></td>");
            out.println("<td></td>");
            out.println("<td><input type='submit' class='boton' style='width:100%' value='Grabar'/></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Observacion</label></td>");
            out.println("<td><input type='text' id='txtObservacion' name='txtObservacion' class='texto' value='"+ Observacion +"'/></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</fieldset>");
            //out.println("<div class='dvbotones'><img src='imagenes/eliminar.png' class='imgbot' /><img src='imagenes/grabar.png' class='imgbot' /></div>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</center>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String DNI = request.getParameter("txtnrodoc");
            personaconsulta = consultaPorDni(DNI);
            dni=DNI;
            if(dni.equalsIgnoreCase(""))
            {
            primernombre="";
            segundonombre="";
            primerapellido="";
            segundoapellido="";
            distrito="";
            provincia="";
            departamento="";
            telefono="";
            essalud="";
            distrito1="";
            provincia1="";
            departamento1="";
            }else
            {
            primernombre=personaconsulta.getPrimerNombre();
            segundonombre=personaconsulta.getSegundoNombre();
            primerapellido=personaconsulta.getPrimerApellido();
            segundoapellido=personaconsulta.getSegundoApellido();
            
            distrito=personaconsulta.getDistrito();
            distrito1=personaconsulta.getDistrito();
            
            provincia=personaconsulta.getProvincia();
            provincia1=personaconsulta.getProvincia();
            
            departamento=personaconsulta.getDepartamento();
            departamento1=personaconsulta.getDepartamento();
            telefono= personaconsulta.getTelefono();
            essalud = personaconsulta.getUbigeo();
            
            Profesion= empresaconsulta.getProfesion();
            }
            
            //TODO: cambiar condicion por validacion de cuando se deba grabar.
            //cuando todos los campos esten completos(diferentes de vacio) por ejemplo.
            
            //TODO: busquen javascript para validar la cantidad de caracteres y el ingreso de solo numeros en el texto del DNI
            // y mas validacion si se puede.! 
            
            
            //Aki realizar la consulta por RUC
            
    String ruc = request.getParameter("txtruc");
            empresaconsulta =  consultaPorRUC(ruc);
            RUC=ruc;
            if(ruc.equalsIgnoreCase(""))
            {
            RUC="";
            Descripcion="";
            RAM="";
            Profesion="";
            FechaInicioLaboral="";
            EstadoCivil="";
            Celular="";
            TelefonoOficina="";
            Anexo="";
            NroHijos="";
    
            TipoPreferenciaDireccion="";
            DireccionPreferencia="";
            Referencia="";
            DepartamentoS="";
            ProvinciaS="";
            DistritoS="";
    
    //String Mensaje="";
            }else
            {
            RAM = empresaconsulta.getRAM();
            Descripcion=empresaconsulta.getDescripcion();
            Profesion=empresaconsulta.getProfesion();
            FechaInicioLaboral=empresaconsulta.getFechaInicioLaboral();
            EstadoCivil = empresaconsulta.getEstadoCivil();
            Celular=empresaconsulta.getCelular();
            TelefonoOficina=empresaconsulta.getTelefonoOficina();
            Anexo=empresaconsulta.getAnexo();
            NroHijos=empresaconsulta.getNroHijos();
            TipoPreferenciaDireccion=empresaconsulta.getTipoPreferenciaDireccion();
            DireccionPreferencia=empresaconsulta.getDireccionPreferencia();
            Referencia=empresaconsulta.getReferencia();
            DepartamentoS=empresaconsulta.getDepartamento();
            ProvinciaS=empresaconsulta.getProvincia();
            DistritoS=empresaconsulta.getDistrito();
            Observacion=request.getParameter("txtObservacion");
            }
            
            //TODO: cambiar condicion por validacion de cuando se deba grabar.
            //cuando todos los campos esten completos(diferentes de vacio) por ejemplo.
            
            //TODO: busquen javascript para validar la cantidad de caracteres y el ingreso de solo numeros en el texto del DNI
            // y mas validacion si se puede.! 
                        
            if(!primernombre.equalsIgnoreCase("") && !Descripcion.equalsIgnoreCase("") && !Observacion.equalsIgnoreCase("") )
            {
                            
                DNI =request.getParameter("txtnrodoc");
                personaconsulta = consultaPorDni(DNI);
            
             GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();
            
            try {
		       negocio.insertar(1234,personaconsulta.getFechaNacimiento(),"DNI",personaconsulta.getDni() ,"PRO1",personaconsulta.getPrimerNombre(),personaconsulta.getSegundoNombre(),
                       personaconsulta.getPrimerApellido(),personaconsulta.getSegundoApellido(),personaconsulta.getProvincia(),
                       personaconsulta.getDepartamento(),personaconsulta.getDistrito(),personaconsulta.getDireccion(),personaconsulta.getProvincia(),
                       personaconsulta.getDepartamento(),personaconsulta.getDistrito(),"Al cotado de una casa","5555555",empresaconsulta.getRUC(),empresaconsulta.getDescripcion(),
                       empresaconsulta.getRAM(),empresaconsulta.getProfesion(),empresaconsulta.getFechaInicioLaboral(),empresaconsulta.getEstadoCivil(),empresaconsulta.getCelular(),
                       empresaconsulta.getTelefonoOficina(),empresaconsulta.getAnexo(),empresaconsulta.getNroHijos(),empresaconsulta.getDireccionPreferencia(),empresaconsulta.getTipoPreferenciaDireccion(),
                       empresaconsulta.getReferencia(),empresaconsulta.getDepartamento(),empresaconsulta.getProvincia(),empresaconsulta.getDistrito());

			} 
            catch (DAOExcepcion e) {
				Assert.fail("Fallo la inserci�n: " + e.getMessage());
			}
            }
            
            processRequest(request, response);
            
            
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Persona consultaPorDni(java.lang.String dni) {
        upc.edu.reniec.ServicioReniec port = service.getServicioReniecPort();
        return port.consultaPorDni(dni);
    }

    private Empresa consultaPorRUC(java.lang.String name) {
        upc.edu.sunat.ServicioSUNAT port = service_1.getServicioSUNATPort();
        return port.consultaPorRUC(name);
    }
}
