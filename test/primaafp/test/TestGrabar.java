/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primaafp.test;

import java.util.Collection;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import primaafp.excepcion.DAOExcepcion;
import primaafp.negocio.GestionContratoAfiliacion;
import primaafp.modelo.ContratoAfiliacion;


/**
 *
 * @author pc
 */
public class TestGrabar {
    
    public TestGrabar() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
		public void insertarTest() {

			GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();

			try {
				negocio.insertar(1234,"11/12/2013","DNI", "456123","PRO1","Luis","Alberto","Sotelo","Cruces","Junin","Huancavelica","Toro Seco","Loma Umbrosa 520","Lima","Lima","Lima","Al cotado de una casa","5555555","20103040506","Jorge Romero Flores","5500","Ing Sistemas","01/01/2012","Soltero","987099980","723-5223", "3319" ,"2","Av Canaval y Moreyra 480","Oficina","Esquina con Rep Panama","Lima","Lima" , "San Isidro");

//				Categoria nuevo = negocio.obtener(7);

//				Assert.assertEquals("Categoria de electr?nicos", nuevo.getDescripcion());

			} catch (DAOExcepcion e) {
				Assert.fail("Fallo la inserci?n: " + e.getMessage());
			}
		}

		
	//@Test
		public void listarTest() {

				GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();

				try {
					Collection<ContratoAfiliacion> listado = negocio.listar(1234);

					// System.out.println(listado.size());
					
					for (ContratoAfiliacion c : listado)
					{
						System.out.println(c.getNroFormulario() + ' ' + c.getFechaSuscripcion() + ' ' + c.getTipoDocumento() + ' ' + c.getNroDocumento() + ' ' + c.getCodigoPromotor() + ' ' + c.getPrimerNombre() + ' ' + c.getSegundoNombre() + ' ' + c.getApellidoPaterno() + ' ' + c.getApellidoMaterno() + ' ' + c.getDepartamentoNacimiento() + ' ' + c.getProvinciaNacimiento() + ' ' + c.getDistritoNacimiento() + ' ' + c.getDireccion() + ' ' + c.getDepartamento() + ' ' + c.getProvincia() + ' ' + c.getDistrito() + ' ' + c.getReferencia() + ' ' + c.getTelefono()+ ' ' + c.getRUC()+ ' ' + c.getDescripcion()+ ' ' + c.getRAM() + ' ' + c.getProfesion()+ ' ' + c.getFechaInicioLaboral()+ ' ' + c.getEstadoCivil()+ ' ' + c.getCelular()+ ' ' + c.getTelefonoOficina()+ ' ' + c.getAnexo()+ ' ' + c.getNroHijos()+ ' ' + c.getDireccionPreferencia()+ ' ' + c.getTipoPreferenciaDireccion()+ ' ' + c.getReferenciaS()+ ' ' + c.getDepartamentoS()+ ' ' + c.getProvinciaS()+ ' ' + c.getDistritoS());
					}

				//	Assert.assertTrue(listado.size() > 0);

				} catch (DAOExcepcion e) {  

					Assert.fail("Fall? el listado: " + e.getMessage());

				}

			} 
	

	//@Test
		public void actualizarTest() {
		
					GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();
		
					try {
		
						
                                                negocio.actualizar(1234,"11/12/2013","DNI", "456123","PRO1","Luis","Alberto","Sotelo","Cruces","Junin","Huancavelica","Toro Seco","Loma Umbrosa 520","Lima","Lima","Lima","Al cotado de una casa","5555555","20103040506","Jorge Romero Flores","5500","Ing Sistemas","01/01/2012","Soltero","987099980","723-5223", "3319" ,"2","Av Canaval y Moreyra 480","Oficina","Esquina con Rep Panama","Lima","Lima" , "San Isidro");
		//				Categoria nuevo = negocio.obtener(7);
		
		//				Assert.assertEquals("Categoria de electr?nicos 2", nuevo.getDescripcion());
		
					} catch (DAOExcepcion e) {
		
						Assert.fail("Fall? la actualizaci?n: " + e.getMessage());
		
					}
				}

		
	//@Test
		public void eliminarTest() {

			GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();

				try {

					negocio.eliminar(1234);
	

					} catch (DAOExcepcion e) {

						Assert.fail("Fall? la eliminici?n: " + e.getMessage());

	}

	}
}