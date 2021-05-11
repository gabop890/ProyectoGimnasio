/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Gabriel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Controller.ControllerManagedBeanMaquinaTest.class, Controller.ControllerManagedBeanMenbresiaTest.class, Controller.ControllerManagedBeanClaseTest.class, Controller.ControllerManagedBeanClienteTest.class, Controller.controllerManagedBeanNominaTest.class, Controller.ControllerManagedBeanEmpleadoTest.class})
public class ControllerSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
