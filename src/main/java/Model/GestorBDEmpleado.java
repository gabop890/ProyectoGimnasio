/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import entidad.Empleado;
import Config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gabriel
 */
public class GestorBDEmpleado {

    private Connection conexion = null;
    private Statement stm = null;
    private ResultSet gimResultSet;
    private int id, salario;
    private String nombre, cargo, direccion;
    private int resultUpdate = 0;
    private long celular;

    public ArrayList<Empleado> leerEmpleado() {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
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
                    empleados.add(empleadoHallado);
                } while (gimResultSet.next());
                conexion.close();
                return empleados;
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
                    + ",'" + empleado.getPassword()
                    + "','" + empleado.getDireccion()
                    + "'," + empleado.getCelular()
                    + ");");
            if (resultUpdate != 0) {
                FacesMessage msg = new FacesMessage("Nuevo empleado agregado", String.valueOf(empleado.getId()));
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

    public boolean borrarEmpleado(Empleado borrarEmpleado) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("delete from empleado where("
                    + "id=" + borrarEmpleado.getId() + ");");
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo borrar el empleado");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean buscarEmpleado(Empleado buscarEmpleado) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from empleado where(id="
                    + buscarEmpleado.getId() + ");");
            if (!gimResultSet.next()) {
                System.out.println("No se encontraron registros");
                conexion.close();
                return false;
            } else {
                conexion.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }

    public boolean editarEmpleado(Empleado empleadoEditar) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("update empleado set nombre='"
                    + empleadoEditar.getNombre()
                    + "',cargo='" + empleadoEditar.getCargo()
                    + "',salario=" + empleadoEditar.getSalario()
                    + ",direccion='" + empleadoEditar.getDireccion()
                    + "',celular=" + empleadoEditar.getCelular()
                    + " where id=" + empleadoEditar.getId()
                    + ";");
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo editar el empleado");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean validarEmpleado(Empleado empleado) {
        try {
            System.out.println("usuario: "+empleado.getId()+"\n pass: "+empleado.getPassword());
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select id, password from empleado where(id="
                    + empleado.getId() + " and password='"
                    + empleado.getPassword() + "');");
            if (!gimResultSet.next()) {
                System.out.println("usuario o contrasela incorrectos");
                conexion.close();
                return false;
            } else {
                conexion.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }
}
