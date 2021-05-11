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
public class NominaTest {

    public NominaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCodigo method, of class Nomina.
     */
    @Test
    public void testGetCodigo() {
        String fechastring = "20-06-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechastring);
        } catch (ParseException ex) {
            Logger.getLogger(NominaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nomina entity = new Nomina(1234, 6000, fecha, 78945);
        Assert.assertEquals("El codigo no se obtuvo correctamente", 1234, entity.getCodigo());
    }

    /**
     * Test of setCodigo method, of class Nomina.
     */
    @Test
    public void testSetCodigo() {
        String fechastring = "20-06-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechastring);
        } catch (ParseException ex) {
            Logger.getLogger(NominaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nomina entity = new Nomina(1234, 6000, fecha, 78945);
        entity.setCodigo(963258);
        Assert.assertEquals("El codigo no se registro correctamente", 963258, entity.getCodigo());
    }

    /**
     * Test of getValor method, of class Nomina.
     */
    @Test
    public void testGetValor() {
        String fechastring = "20-06-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechastring);
        } catch (ParseException ex) {
            Logger.getLogger(NominaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nomina entity = new Nomina(1234, 6000, fecha, 78945);
        Assert.assertEquals("El valor no se obtuvo correctamente", 6000, entity.getValor());
    }

    /**
     * Test of setValor method, of class Nomina.
     */
    @Test
    public void testSetValor() {
        String fechastring = "20-06-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechastring);
        } catch (ParseException ex) {
            Logger.getLogger(NominaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nomina entity = new Nomina(1234, 6000, fecha, 78945);
        entity.setValor(3250);
        Assert.assertEquals("El codigo no se obtuvo correctamente", 3250, entity.getValor());
    }

    /**
     * Test of getFecha method, of class Nomina.
     */
    @Test
    public void testGetFecha() {
        String fechastring = "20-06-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechastring);
        } catch (ParseException ex) {
            Logger.getLogger(NominaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nomina entity = new Nomina(1234, 6000, fecha, 78945);
        Assert.assertEquals("La fecha no se obtuvo correctamente", fecha, entity.getFecha());
    }

    /**
     * Test of setFecha method, of class Nomina.
     */
    @Test
    public void testSetFecha() {
        String fechastring = "20-06-2021";
        String temp = "03-05-2015";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;
        Date fechaTest = null;
        try {
            fecha = formato.parse(fechastring);
            fechaTest = formato.parse(temp);
        } catch (ParseException ex) {
            Logger.getLogger(NominaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nomina entity = new Nomina(1234, 6000, fecha, 78945);
        entity.setFecha(fechaTest);
        Assert.assertEquals("La fecha no se registro correctamente", fechaTest, entity.getFecha());
    }

    /**
     * Test of getEmpleado method, of class Nomina.
     */
    @Test
    public void testGetEmpleado() {
        String fechastring = "20-06-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechastring);
        } catch (ParseException ex) {
            Logger.getLogger(NominaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nomina entity = new Nomina(1234, 6000, fecha, 78945);
        Assert.assertEquals("El empleado no se obtuvo correctamente", 78945, entity.getEmpleado());
    }

    /**
     * Test of setEmpleado method, of class Nomina.
     */
    @Test
    public void testSetEmpleado() {
        String fechastring = "20-06-2021";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechastring);
        } catch (ParseException ex) {
            Logger.getLogger(NominaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nomina entity = new Nomina(1234, 6000, fecha, 78945);
        entity.setEmpleado(654789);
        Assert.assertEquals("El empleado no se registro correctamente", 654789, entity.getEmpleado());
    }

}
