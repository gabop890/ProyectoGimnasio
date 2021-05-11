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
public class MaquinaTest {

    public MaquinaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class Maquina.
     */
    @Test
    public void testGetId() {
        String fechaI = "20-05-2021";
        String fechaM = "26-08-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDI = null;
        Date fechaDF = null;
        try {
            fechaDI = formato.parse(fechaI);
            fechaDF = formato.parse(fechaM);
        } catch (ParseException ex) {
            Logger.getLogger(MaquinaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maquina instance = new Maquina(123, "Vigente", "escaladora", fechaDI, fechaDF);
        Assert.assertEquals("El id no se obtuvo correctamente", 123, instance.getId());
    }

    /**
     * Test of setId method, of class Maquina.
     */
    @Test
    public void testSetId() {
        String fechaI = "20-05-2021";
        String fechaM = "26-08-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDI = null;
        Date fechaDF = null;
        try {
            fechaDI = formato.parse(fechaI);
            fechaDF = formato.parse(fechaM);
        } catch (ParseException ex) {
            Logger.getLogger(MaquinaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maquina instance = new Maquina(123, "Vigente", "escaladora", fechaDI, fechaDF);
        instance.setId(13456);
        Assert.assertEquals("El id no se registro correctamente", 13456, instance.getId());
    }

    /**
     * Test of getEstado method, of class Maquina.
     */
    @Test
    public void testGetEstado() {
        String fechaI = "20-05-2021";
        String fechaM = "26-08-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDI = null;
        Date fechaDF = null;
        try {
            fechaDI = formato.parse(fechaI);
            fechaDF = formato.parse(fechaM);
        } catch (ParseException ex) {
            Logger.getLogger(MaquinaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maquina instance = new Maquina(123, "Vigente", "escaladora", fechaDI, fechaDF);
        Assert.assertEquals("El estado no se obtuvo correctamente", "Vigente", instance.getEstado());
    }

    /**
     * Test of setEstado method, of class Maquina.
     */
    @Test
    public void testSetEstado() {
        String fechaI = "20-05-2021";
        String fechaM = "26-08-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDI = null;
        Date fechaDF = null;
        try {
            fechaDI = formato.parse(fechaI);
            fechaDF = formato.parse(fechaM);
        } catch (ParseException ex) {
            Logger.getLogger(MaquinaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maquina instance = new Maquina(123, "Vigente", "escaladora", fechaDI, fechaDF);
        instance.setEstado("Dañada");
        Assert.assertEquals("El estado no se registro correctamente", "Dañada", instance.getEstado());
    }

    /**
     * Test of getDescripcion method, of class Maquina.
     */
    @Test
    public void testGetDescripcion() {
        String fechaI = "20-05-2021";
        String fechaM = "26-08-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDI = null;
        Date fechaDF = null;
        try {
            fechaDI = formato.parse(fechaI);
            fechaDF = formato.parse(fechaM);
        } catch (ParseException ex) {
            Logger.getLogger(MaquinaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maquina instance = new Maquina(123, "Vigente", "escaladora", fechaDI, fechaDF);
        Assert.assertEquals("La descripción no se obtuvo correctamente", "escaladora", instance.getDescripcion());
    }

    /**
     * Test of setDescripcion method, of class Maquina.
     */
    @Test
    public void testSetDescripcion() {
        String fechaI = "20-05-2021";
        String fechaM = "26-08-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDI = null;
        Date fechaDF = null;
        try {
            fechaDI = formato.parse(fechaI);
            fechaDF = formato.parse(fechaM);
        } catch (ParseException ex) {
            Logger.getLogger(MaquinaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maquina instance = new Maquina(123, "Vigente", "escaladora", fechaDI, fechaDF);
        instance.setDescripcion("caminadora");
        Assert.assertEquals("La descripción no se registro correctamente", "caminadora", instance.getDescripcion());
    }

    /**
     * Test of getFechaConpra method, of class Maquina.
     */
    @Test
    public void testGetFechaConpra() {
        String fechaI = "20-05-2021";
        String fechaM = "26-08-2021";
        String fechaTest = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDI = null;
        Date fechaDF = null;
        Date fechaDT = null;
        try {
            fechaDI = formato.parse(fechaI);
            fechaDF = formato.parse(fechaM);
            fechaDT = formato.parse(fechaTest);
        } catch (ParseException ex) {
            Logger.getLogger(MaquinaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maquina instance = new Maquina(123, "Vigente", "escaladora", fechaDI, fechaDF);
        instance.setFechaConpra(fechaDT);
        Assert.assertEquals("La fecha de compra no se obtuvo correctamente", fechaDT, instance.getFechaConpra());
    }

    /**
     * Test of setFechaConpra method, of class Maquina.
     */
    @Test
    public void testSetFechaConpra() {
        String fechaI = "20-05-2021";
        String fechaM = "26-08-2021";
        String fechaTest = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDI = null;
        Date fechaDF = null;
        Date fechaDT = null;
        try {
            fechaDI = formato.parse(fechaI);
            fechaDF = formato.parse(fechaM);
            fechaDT = formato.parse(fechaTest);
        } catch (ParseException ex) {
            Logger.getLogger(MaquinaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maquina instance = new Maquina(123, "Vigente", "escaladora", fechaDI, fechaDF);
        Assert.assertEquals("La fecha de compra no se registro correctamente", fechaDT, instance.getFechaConpra());
    }

    /**
     * Test of getFechaMantenimiento method, of class Maquina.
     */
    @Test
    public void testGetFechaMantenimiento() {
        String fechaI = "20-05-2021";
        String fechaM = "26-08-2021";
        String fechaTest = "26-08-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDI = null;
        Date fechaDF = null;
        Date fechaDT = null;
        try {
            fechaDI = formato.parse(fechaI);
            fechaDF = formato.parse(fechaM);
            fechaDT = formato.parse(fechaTest);
        } catch (ParseException ex) {
            Logger.getLogger(MaquinaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maquina instance = new Maquina(123, "Vigente", "escaladora", fechaDI, fechaDF);
        Assert.assertEquals("La fecha de mantenimiento no se obtuvo correctamente", fechaDT, instance.getFechaMantenimiento());
    }

    /**
     * Test of setFechaMantenimiento method, of class Maquina.
     */
    @Test
    public void testSetFechaMantenimiento() {
        String fechaI = "20-05-2021";
        String fechaM = "26-08-2021";
        String fechaTest = "20-05-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDI = null;
        Date fechaDF = null;
        Date fechaDT = null;
        try {
            fechaDI = formato.parse(fechaI);
            fechaDF = formato.parse(fechaM);
            fechaDT = formato.parse(fechaTest);
        } catch (ParseException ex) {
            Logger.getLogger(MaquinaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maquina instance = new Maquina(123, "Vigente", "escaladora", fechaDI, fechaDF);
        instance.setFechaMantenimiento(fechaDT);
        Assert.assertEquals("La fecha de mantenimiento no se registro correctamente", fechaDT, instance.getFechaMantenimiento());
    }

}
