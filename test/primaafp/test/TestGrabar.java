/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primaafp.test;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import primaafp.excepcion.DAOExcepcion;
import primaafp.negocio.GestionContratoAfiliacion;

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
				negocio.insertar(1234,"11/12/2013","DNI", "456123","PRO1","Luis","Alberto","Sotelo","Cruces","Junin","Huancavelica","Toro Seco","Loma Umbrosa 520","Lima","Lima","Lima","Al cotado de una casa","5555555",);

//				Categoria nuevo = negocio.obtener(7);

//				Assert.assertEquals("Categoria de electr�nicos", nuevo.getDescripcion());

			} catch (DAOExcepcion e) {
				Assert.fail("Fallo la inserci�n: " + e.getMessage());
			}
		}
}
