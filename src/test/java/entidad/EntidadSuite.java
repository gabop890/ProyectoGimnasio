/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Gabriel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({entidad.MenbresiaTest.class, entidad.MaquinaTest.class, entidad.ClaseTest.class, entidad.EmpleadoTest.class, entidad.ClienteTest.class, entidad.NominaTest.class})
public class EntidadSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
