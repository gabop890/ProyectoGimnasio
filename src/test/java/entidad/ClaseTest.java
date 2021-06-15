/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Gabriel
 */
public class ClaseTest {

    public ClaseTest() {
    }

//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }

    /**
     * Test of getCodigo method, of class Clase.
     */
//    @Test
//    public void testGetCodigo() {
//        System.out.println("getCodigo");
//        Clase instance = new Clase();
//        int expResult = 0;
//        int result = instance.getCodigo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of setCodigo method, of class Clase.
     */
    @Test
    public void testSetCodigo() {
        Clase clase = new Clase(123, 456, 4.0, "Maria lara", "clase de Spinning", "Bicicletas estaticas");
        clase.setCodigo(1234);
        Assert.assertEquals("El codigo no es correcto", 1234, clase.getCodigo());
    }

    /**
     * Test of setRecursos method, of class Clase.
     */
    @Test
    public void testSetRecursos() {
        Clase clase = new Clase(123, 456, 4.0, "Maria lara", "clase de Spinning", "Bicicletas estaticas");
        clase.setRecursos("Trotadoras");
        Assert.assertEquals("Los recursos no han sido registrados correctamente", "Trotadoras", clase.getRecursos());
    }

    /**
     * Test of setInstructor method, of class Clase.
     */
    @Test
    public void testSetInstructor() {
        Clase clase = new Clase(123, 456, 4.0, "Maria lara", "clase de Spinning", "Bicicletas estaticas");
        clase.setInstructor(1234);
        Assert.assertEquals("El instructor no ha sido registrado correctamente", 1234, clase.getInstructor());
    }

    /**
     * Test of setNombre method, of class Clase.
     */
    @Test
    public void testSetNombre() {
        Clase clase = new Clase(123, 456, 4.0, "Maria lara", "clase de Spinning", "Bicicletas estaticas");
        clase.setNombre("maria jose perez");
        Assert.assertEquals("El nombre no ha sido registrado correctamente", "maria jose perez", clase.getNombre());
    }

    /**
     * Test of setDescripcion method, of class Clase.
     */
    @Test
    public void testSetDescripcion() {
        Clase clase = new Clase(123, 456, 4.0, "Maria lara", "clase de Spinning", "Bicicletas estaticas");
        clase.setDescripcion("Clase de yoga");
        Assert.assertEquals("La descripción no ha sido registrado correctamente", "Clase de yoga", clase.getDescripcion());
    }
    /**
     * Test of getInstructor method, of class Clase.
     */
//    @Test
//    public void testGetInstructor() {
//        System.out.println("getInstructor");
//        Clase instance = new Clase();
//        int expResult = 0;
//        int result = instance.getInstructor();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getCalificacion method, of class Clase.
     */
//    @Test
//    public void testGetCalificacion() {
//        System.out.println("getCalificacion");
//        Clase instance = new Clase();
//        double expResult = 0.0;
//        double result = instance.getCalificacion();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of setCalificacion method, of class Clase.
     */
//    @Test
//    public void testSetCalificacion() {
//        float cal = (float) 3.5;
//        Clase clase = new Clase(123, 456, 4.0, "Maria lara", "clase de Spinning", "Bicicletas estaticas");
//        clase.setCalificacion(cal);
//        Assert.assertEquals("La calificación no ha sido registrada correctamente", cal, clase.getCalificacion());
//    }
    /**
     * Test of getNombre method, of class Clase.
     */
//    @Test
//    public void testGetNombre() {
//        System.out.println("getNombre");
//        Clase instance = new Clase();
//        String expResult = "";
//        String result = instance.getNombre();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getDescripcion method, of class Clase.
     */
//    @Test
//    public void testGetDescripcion() {
//        System.out.println("getDescripcion");
//        Clase instance = new Clase();
//        String expResult = "";
//        String result = instance.getDescripcion();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getRecursos method, of class Clase.
     */
//    @Test
//    public void testGetRecursos() {
//        System.out.println("getRecursos");
//        Clase instance = new Clase();
//        String expResult = "";
//        String result = instance.getRecursos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
