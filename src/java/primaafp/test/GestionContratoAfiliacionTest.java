package primaafp.test;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;


import primaafp.negocio.GestionContratoAfiliacion;
import primaafp.excepcion.DAOExcepcion;
import primaafp.modelo.ContratoAfiliacion;


public class GestionContratoAfiliacionTest {

	@Test
		public void insertarTest() {

			GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();

			try {
				negocio.insertar(1234,"11/12/2013","DNI", "456123","PRO1","Luis","Alberto","Sotelo","Cruces","Junin","Huancavelica","Toro Seco","Loma Umbrosa 520","Lima","Lima","Lima","Al cotado de una casa","5555555");

//				Categoria nuevo = negocio.obtener(7);

//				Assert.assertEquals("Categoria de electr�nicos", nuevo.getDescripcion());

			} catch (DAOExcepcion e) {
				Assert.fail("Fallo la inserci�n: " + e.getMessage());
			}
		}

		
	//@Test
		public void listarTest() {

				GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();

				try {
					Collection<ContratoAfiliacion> listado = negocio.listar(9999);

					// System.out.println(listado.size());
					
					for (ContratoAfiliacion c : listado)
					{
						System.out.println(c.getNroFormulario() + ' ' + c.getFechaSuscripcion() + ' ' + c.getTipoDocumento() + ' ' + c.getNroDocumento() + ' ' + c.getCodigoPromotor() + ' ' + c.getPrimerNombre() + ' ' + c.getSegundoNombre() + ' ' + c.getApellidoPaterno() + ' ' + c.getApellidoMaterno() + ' ' + c.getDepartamentoNacimiento() + ' ' + c.getProvinciaNacimiento() + ' ' + c.getDistritoNacimiento() + ' ' + c.getDireccion() + ' ' + c.getDepartamento() + ' ' + c.getProvincia() + ' ' + c.getDistrito() + ' ' + c.getReferencia() + ' ' + c.getTelefono());
					}

					Assert.assertTrue(listado.size() > 0);

				} catch (DAOExcepcion e) {

					Assert.fail("Fall� el listado: " + e.getMessage());

				}

			}
	

	//@Test
		public void actualizarTest() {
		
					GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();
		
					try {
		
						negocio.actualizar(6666,"11/12/2014","DNI", "456123","PRO1","Luis","Alberto","Sotelo","Cruces","Junin","Huancavelica","Toro Seco","Loma Umbrosa 520","Lima","Lima","Lima","Al cotado de una casa","5555555");
		
		//				Categoria nuevo = negocio.obtener(7);
		
		//				Assert.assertEquals("Categoria de electr�nicos 2", nuevo.getDescripcion());
		
					} catch (DAOExcepcion e) {
		
						Assert.fail("Fall� la actualizaci�n: " + e.getMessage());
		
					}
				}

		
	//@Test
		public void eliminarTest() {

			GestionContratoAfiliacion negocio = new GestionContratoAfiliacion();

				try {

					negocio.eliminar(1234);
	

					} catch (DAOExcepcion e) {

						Assert.fail("Fall� la eliminici�n: " + e.getMessage());

	}

	}
}
