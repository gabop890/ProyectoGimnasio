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
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class MenbresiaTest {

    public MenbresiaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class Menbresia.
     */
    @Test
    public void testGetId() {
        String fechaI = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        try {
            fechaD = formato.parse(fechaI);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        Assert.assertEquals("El codigo no se ha obtenido correctamente", 123, instance.getId());
    }

    /**
     * Test of setId method, of class Menbresia.
     */
    @Test
    public void testSetId() {
        String fechaI = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        try {
            fechaD = formato.parse(fechaI);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        instance.setId(321);
        Assert.assertEquals("El codigo no se ha regitrado correctamente", 321, instance.getId());
    }

    /**
     * Test of getValor method, of class Menbresia.
     */
    @Test
    public void testGetValor() {
        String fechaI = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        try {
            fechaD = formato.parse(fechaI);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        Assert.assertEquals("El valor no se ha obtenido correctamente", 5000, instance.getValor());
    }

    /**
     * Test of setValor method, of class Menbresia.
     */
    @Test
    public void testSetValor() {
        String fechaI = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        try {
            fechaD = formato.parse(fechaI);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        instance.setValor(6250);
        Assert.assertEquals("El codigo no se ha registrado correctamente", 6250, instance.getValor());
    }

    /**
     * Test of getCliente method, of class Menbresia.
     */
    @Test
    public void testGetCliente() {
        String fechaI = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        try {
            fechaD = formato.parse(fechaI);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        Assert.assertEquals("El cliente no se ha obtenido correctamente", 123, instance.getCliente());
    }

    /**
     * Test of setCliente method, of class Menbresia.
     */
    @Test
    public void testSetCliente() {
        String fechaI = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        try {
            fechaD = formato.parse(fechaI);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        instance.setCliente(654);
        Assert.assertEquals("El cliente no se ha registrado correctamente", 654, instance.getCliente());
    }

    /**
     * Test of getFechaInicio method, of class Menbresia.
     */
    @Test
    public void testGetFechaInicio() {
        String fechaI = "26-06-2019";
        String stringFecha = "26-06-2019";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        Date fechaTest = null;
        try {
            fechaD = formato.parse(fechaI);
            fechaTest = formato.parse(stringFecha);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        Assert.assertEquals("La fecha de inicio no se ha obtenido correctamente", fechaTest, instance.getFechaInicio());
    }

    /**
     * Test of setFechaInicio method, of class Menbresia.
     */
    @Test
    public void testSetFechaInicio() {
        String fechaI = "20-05-2021";
        String stringFecha = "26-06-2019";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        Date fechaTest = null;
        try {
            fechaD = formato.parse(fechaI);
            fechaTest = formato.parse(stringFecha);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        instance.setFechaInicio(fechaTest);
        Assert.assertEquals("La fecha de inicio no se ha registrado correctamente", fechaTest, instance.getFechaInicio());
    }

    /**
     * Test of getFechaFin method, of class Menbresia.
     */
    @Test
    public void testGetFechaFin() {
        String fechaI = "20-05-2021";
        String stringFecha = "26-06-2019";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        Date fechaTest = null;
        try {
            fechaD = formato.parse(fechaI);
            fechaTest = formato.parse(stringFecha);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        instance.setFechaFin(fechaTest);
        Assert.assertEquals("La fecha fin no se ha obtenido correctamente", fechaTest, instance.getFechaFin());
    }

    /**
     * Test of setFechaFin method, of class Menbresia.
     */
    @Test
    public void testSetFechaFin() {
        String fechaI = "20-05-2021";
        String stringFecha = "26-06-2019";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        Date fechaTest = null;
        try {
            fechaD = formato.parse(fechaI);
            fechaTest = formato.parse(stringFecha);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        instance.setFechaFin(fechaTest);
        Assert.assertEquals("La fecha de inicio no se ha registrado correctamente", fechaTest, instance.getFechaFin());
    }

    /**
     * Test of getMeses method, of class Menbresia.
     */
    @Test
    public void testGetMeses() {
        String fechaI = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        try {
            fechaD = formato.parse(fechaI);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        Assert.assertEquals("Los meses no se ha obtenido correctamente", 6, instance.getMeses());
    }

    /**
     * Test of setMeses method, of class Menbresia.
     */
    @Test
    public void testSetMeses() {
        String fechaI = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaD = null;
        try {
            fechaD = formato.parse(fechaI);
        } catch (ParseException ex) {
            Logger.getLogger(MenbresiaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menbresia instance = new Menbresia(123, 5000, 123, 6, fechaD);
        instance.setMeses(12);
        Assert.assertEquals("Los meses no se ha registrado correctamente", 12, instance.getMeses());
    }

}
