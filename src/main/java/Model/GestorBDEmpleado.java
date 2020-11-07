/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Gabriel
 */
public class GestorBDEmpleado {
    private Connection conexion=null;
    private Statement stm= null;
    private ResultSet gimResultSet;
    private int id, salario;
    private String nombre, cargo;
}
