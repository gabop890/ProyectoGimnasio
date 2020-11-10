/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gabriel
 */
public class GestorBDEmpleado {
    private Connection conexion=null;
    private Statement stm= null;
    private ResultSet gimResultSet;
    private int id, salario;
    private String nombre, cargo, direccion;
    private int resultUpdate = 0;
    private long celular;
    
    public ArrayList<Empleado> leerEmpleado() {
        ArrayList<Empleado> empleado = new ArrayList<Empleado>();
        Empleado empleadoHallado;
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from empleado");
            if (!gimResultSet.next()) {
                System.out.println("No se encontraron registros");
                conexion.close();
                return null;
            } else {
                do {
                    id = gimResultSet.getInt("id");
                    nombre = gimResultSet.getString("nombre");
                    cargo = gimResultSet.getString("cargo");
                    salario = gimResultSet.getInt("salario");
                    direccion = gimResultSet.getString("direccion");
                    celular = gimResultSet.getLong("celular");
                    empleadoHallado = new Empleado(id, salario, celular, nombre, cargo, direccion);
                    empleado.add(empleadoHallado);
                } while (gimResultSet.next());
                conexion.close();
                return empleado;
            }
        } catch (Exception e) {
            System.err.println("error en la base de datos");
            e.printStackTrace();
            return null;
        }
    }
    
     public boolean agregar(Empleado empleado) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            
            resultUpdate = stm.executeUpdate("insert into empleado values("
                    + empleado.getId()
                    + ",'" + empleado.getNombre()
                    + "','" + empleado.getCargo()
                    + "'," + empleado.getSalario()
                    + ",'" + empleado.getDireccion()
                    + "'," + empleado.getCelular()
                    + ");");
            if (resultUpdate != 0) {
                FacesMessage msg = new FacesMessage("Nuevo empleado agregado", String.valueOf(empleado.getNombre()));
                FacesContext.getCurrentInstance().addMessage(null, msg);
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo insertar el empleado");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }
}
