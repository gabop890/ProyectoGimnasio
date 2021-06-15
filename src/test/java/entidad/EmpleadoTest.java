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
public class EmpleadoTest {

    public EmpleadoTest() {
    }

//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }

    /**
     * Test of getId method, of class Empleado.
     */
    @Test
    public void testGetId() {
        Empleado entity = new Empleado(159, 1500, 3214569874l, "Marcela forero", "entrenador", "Av. esperanza 560");
        Assert.assertEquals("El id no se ha obtenido correctamente", 159, entity.getId());
    }
    /**
     * Test of setId method, of class Empleado.
     */
    @Test
    public void testSetId() {
        int id = 768;
        Empleado instance = new Empleado(2345, 600, 3214567966l, "Monica correa", "vigilante", "av coyocan 345");
        instance.setId(id);
        Assert.assertEquals("El codigo no ha sido registrado correctamente", id, instance.getId());
    }
    
     /**
     * Test of setDireccion method, of class Empleado.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "cra 67 cll 45";
        Empleado instance = new Empleado(2345, 600, 3214567, "Monica correa", "vigilante", "av coyocan 345");
        instance.setDireccion(direccion);
        Assert.assertEquals("la direccion no ha sido registrado correctamente", direccion, instance.getDireccion());
    }

    /**
     * Test of setPassword method, of class Empleado.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "dgbdfg";
        Empleado instance = new Empleado(2345, 600, 3214567, "Monica correa", "vigilante", "av coyocan 345");
        instance.setPassword(password);
        Assert.assertEquals("la contraseña no ha sido registrado correctamente", password, instance.getPassword());
    }
/**
     * Test of setSalario method, of class Empleado.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        int salario = 0;
        Empleado instance = new Empleado(2345, 600, 3214567, "Monica correa", "vigilante", "av coyocan 345");
        instance.setSalario(salario);
        Assert.assertEquals("El salario no ha sido registrado correctamente", salario, instance.getSalario());
    }
    /**
     * Test of setCelular method, of class Empleado.
     */
    @Test
    public void testSetCelular() {
        System.out.println("setCelular");
        long celular = 6541252463l;
        Empleado instance = new Empleado(2345, 600, 3214567, "Monica correa", "vigilante", "av coyocan 345");
        instance.setCelular(celular);
        Assert.assertEquals("El celular no ha sido registrado correctamente", celular, instance.getCelular());
    }
    /**
     * Test of setNombre method, of class Empleado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "qwerty";
        Empleado instance = new Empleado(2345, 600, 3214567, "Monica correa", "vigilante", "av coyocan 345");
        instance.setNombre(nombre);
        Assert.assertEquals("El nombre no ha sido registrado correctamente", nombre, instance.getNombre());
    }
    /**
     * Test of getSalario method, of class Empleado.
     */
    @Test
    public void testGetSalario() {
        Empleado instance = new Empleado(2345, 600, 3214567966l, "Monica correa", "vigilante", "av coyocan 345");
        Assert.assertEquals("El salario no ha sido obtenido correctamente", 600, instance.getSalario());
    }
    

    /**
     * Test of getCelular method, of class Empleado.
     */
    @Test
    public void testGetCelular() {
        Empleado instance = new Empleado(2345, 600, 3214567966l, "Monica correa", "vigilante", "av coyocan 345");
        Assert.assertEquals("El celular no ha sido obtenido correctamente", 3214567966l, instance.getCelular());
    }
    

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        Empleado instance = new Empleado(2345, 600, 3214567966l, "Monica correa", "vigilante", "av coyocan 345");
        Assert.assertEquals("El nombre no ha sido obtenido correctamente", "Monica correa", instance.getNombre());
    }
    

    /**
     * Test of getCargo method, of class Empleado.
     */
    @Test
    public void testGetCargo() {
        Empleado instance = new Empleado(2345, 600, 3214567966l, "Monica correa", "vigilante", "av coyocan 345");
        Assert.assertEquals("El cargo no ha sido obtenido correctamente", "vigilante", instance.getCargo());
    }

    

    /**
     * Test of getDireccion method, of class Empleado.
     */
    @Test
    public void testGetDireccion() {
        Empleado instance = new Empleado(2345, 600, 3214567966l, "Monica correa", "vigilante", "av coyocan 345");
        Assert.assertEquals("La dirección no ha sido obtenida correctamente", "av coyocan 345", instance.getDireccion());
    }
   
    /**
     * Test of getPassword method, of class Empleado.
     */
    @Test
    public void testGetPassword() {
        Empleado instance = new Empleado(2345, 600, 3214567966l, "Monica correa", "vigilante", "av coyocan 345");
        instance.setPassword("qwe123");
        Assert.assertEquals("La contraseña no ha sido obtenida correctamente", "qwe123", instance.getPassword());
    }

}
