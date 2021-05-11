/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Gabriel
 */
public class ClienteTest {

    public ClienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getClave method, of class Cliente.
     */
//    @Test
//    public void testGetClave() {
//        System.out.println("getClave");
//        Cliente instance = new Cliente();
//        Integer expResult = null;
//        Integer result = instance.getClave();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setClave method, of class Cliente.
     */
    @Test
    public void testSetClave() {
        Cliente cliente;
        String fecha = "2020-05-23";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechad = null;
        try {
            fechad = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente = new Cliente(65515, "pedro perez", "pedro@gmail.com", "prueba", fechad, 80.0, 1.75, 651151415);
        cliente.setClave(12345);
        Assert.assertEquals("La clave no ha sido registrada correctamente", 12345, cliente.getClave().longValue());
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
//    @Test
//    public void testGetNombre() {
//        System.out.println("getNombre");
//        Cliente instance = new Cliente();
//        String expResult = "";
//        String result = instance.getNombre();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        Cliente cliente;
        String fecha = "2020-05-23";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechad = null;
        try {
            fechad = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente = new Cliente(65515, "pedro perez", "pedro@gmail.com", "prueba", fechad, 80.0, 1.75, 651151415);
        cliente.setNombre("Maria laura");
        Assert.assertEquals("El nombre no se registro correctamente", "Maria laura", cliente.getNombre());
    }

    /**
     * Test of getEdad method, of class Cliente.
     */
//    @Test
//    public void testGetEdad() {
//        System.out.println("getEdad");
//        Cliente instance = new Cliente();
//        Date expResult = null;
//        Date result = instance.getEdad();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setEdad method, of class Cliente.
     */
    @Test
    public void testSetEdad() {
        Cliente cliente;
        String fecha = "2020-05-23";
        String fechaTemp = "2020-05-23";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechad = null;
        Date fechaForm = null;
        try {
            fechad = formato.parse(fecha);
            fechaForm = formato.parse(fechaTemp);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente = new Cliente(65515, "pedro perez", "pedro@gmail.com", "prueba", fechad, 80.0, 1.75, 651151415);
        cliente.setEdad(fechad);
        Assert.assertEquals("La edad no es correcta", fechaForm, cliente.getEdad());
    }

    /**
     * Test of getCorreo method, of class Cliente.
     */
//    @Test
//    public void testGetCorreo() {
//        System.out.println("getCorreo");
//        Cliente instance = new Cliente();
//        String expResult = "";
//        String result = instance.getCorreo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setCorreo method, of class Cliente.
     */
    @Test
    public void testSetCorreo() {
        Cliente cliente;
        String fecha = "2020-05-23";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechad = null;
        try {
            fechad = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente = new Cliente(65515, "pedro perez", "pedro@gmail.com", "prueba", fechad, 80.0, 1.75, 651151415);
        cliente.setCorreo("ana@gmail.com");
        Assert.assertEquals("El correo no se registro correctamente", "ana@gmail.com", cliente.getCorreo());
    }

    /**
     * Test of getPeso method, of class Cliente.
     */
//    @Test
//    public void testGetPeso() {
//        System.out.println("getPeso");
//        Cliente instance = new Cliente();
//        Double expResult = null;
//        Double result = instance.getPeso();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setPeso method, of class Cliente.
     */
    @Test
    public void testSetPeso() {
        Cliente cliente;
        String fecha = "2020-05-23";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechad = null;
        try {
            fechad = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente = new Cliente(65515, "pedro perez", "pedro@gmail.com", "prueba", fechad, 80.0, 1.75, 651151415);
        cliente.setPeso(75.3);
        Assert.assertEquals("El peso no se registro correctamente", 75.3, cliente.getPeso(), 0.001);
    }

    /**
     * Test of getEstatura method, of class Cliente.
     */
//    @Test
//    public void testGetEstatura() {
//        System.out.println("getEstatura");
//        Cliente instance = new Cliente();
//        Double expResult = null;
//        Double result = instance.getEstatura();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setEstatura method, of class Cliente.
     */
    @Test
    public void testSetEstatura() {
        Cliente cliente;
        String fecha = "2020-05-23";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechad = null;
        try {
            fechad = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente = new Cliente(65515, "pedro perez", "pedro@gmail.com", "prueba", fechad, 80.0, 1.75, 651151415);
        cliente.setEstatura((double)1.75);
        Assert.assertEquals("La estatura no se registro correctamente", 1.75, cliente.getEstatura(), 0.001);
    }

    /**
     * Test of getCelular method, of class Cliente.
     */
//    @Test
//    public void testGetCelular() {
//        System.out.println("getCelular");
//        Cliente instance = new Cliente();
//        long expResult = 0L;
//        long result = instance.getCelular();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setCelular method, of class Cliente.
     */
    @Test
    public void testSetCelular() {
        Cliente cliente;
        String fecha = "2020-05-23";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechad = null;
        try {
            fechad = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente = new Cliente(65515, "pedro perez", "pedro@gmail.com", "prueba", fechad, 80.0, 1.75, 651151415);
        cliente.setCelular(3214567899L);
        Assert.assertEquals("El nombre no se registro correctamente", 3214567899L, cliente.getCelular());
    }

    /**
     * Test of getPassword method, of class Cliente.
     */
//    @Test
//    public void testGetPassword() {
//        System.out.println("getPassword");
//        Cliente instance = new Cliente();
//        String expResult = "";
//        String result = instance.getPassword();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setPassword method, of class Cliente.
     */
    @Test
    public void testSetPassword() {
        Cliente cliente;
        String fecha = "2020-05-23";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechad = null;
        try {
            fechad = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente = new Cliente(65515, "pedro perez", "pedro@gmail.com", "prueba", fechad, 80.0, 1.75, 651151415);
        cliente.setPassword("123qwe");
        Assert.assertEquals("El nombre no se registro correctamente", "123qwe", cliente.getPassword());
    }

}
