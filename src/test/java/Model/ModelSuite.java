/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Gabriel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Model.GestorBDClienteTest.class, Model.GestorBDClaseTest.class, Model.GestorBDMaquinaTest.class, Model.GestorDBNominaTest.class, Model.GestorBDEmpleadoTest.class, Model.GestorBDMenbresiaTest.class})
public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
