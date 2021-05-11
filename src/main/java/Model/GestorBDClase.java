/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Config.Conexion;
import entidad.Clase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gabriel
 */
public class GestorBDClase {

    private Connection conexion = null;
    private Statement stm = null;
    private ResultSet gimResultSet;
    private int codigo, instructor;
    private double calificacion;
    private String nombre, descripcion, recursos;
    private int resultUpdate = 0;

    public ArrayList<Clase> leerClase() {
        ArrayList<Clase> clases = new ArrayList<Clase>();
        Clase claseHallada;
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from clase");
            if (!gimResultSet.next()) {
                System.out.println("No se encontraron registros");
                conexion.close();
                return null;
            } else {
                do {
                    codigo = gimResultSet.getInt("codigo");
                    nombre = gimResultSet.getString("nombre");
                    descripcion = gimResultSet.getString("descripcion");
                    recursos = gimResultSet.getString("recursos");
                    calificacion = gimResultSet.getDouble("calificacion");
                    instructor = gimResultSet.getInt("instructor");
                    claseHallada = new Clase(codigo, instructor, calificacion, nombre, descripcion, recursos);
                    clases.add(claseHallada);
                } while (gimResultSet.next());
                conexion.close();
                return clases;
            }
        } catch (SQLException e) {
            System.err.println("error en la base de datos");
            e.printStackTrace();
            return null;
        }
    }

    public boolean agregarClase(Clase clase) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("insert into clase (nombre, descripcion, recursos, calificacion, instructor) values('"
                    + clase.getNombre()
                    + "','" + clase.getDescripcion()
                    + "','" + clase.getRecursos()
                    + "'," + clase.getCalificacion()
                    + "," + clase.getInstructor()
                    + ");");
            if (resultUpdate != 0) {
                FacesMessage msg = new FacesMessage("Nuevo clase agregada", String.valueOf(clase.getCodigo()));
                FacesContext.getCurrentInstance().addMessage(null, msg);
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo insertar la clase");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }

    public boolean borrarClase(Clase borrarClase) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("delete from clase where("
                    + "codigo=" + borrarClase.getCodigo() + ");");
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo borrar la clase");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean buscarClase(Clase buscarClase) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from clase where(codigo="
                    + buscarClase.getCodigo() + ");");
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

    public boolean editarClase(Clase claseEditar) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("update clase set nombre='"
                    + claseEditar.getNombre()
                    + "',descripcion='" + claseEditar.getDescripcion()
                    + "',recursos='" + claseEditar.getRecursos()
                    + "',calificacion=" + claseEditar.getCalificacion()
                    + ",instructor=" + claseEditar.getInstructor()
                    + " where codigo=" + claseEditar.getCodigo()
                    + ";");
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo editar la clase");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
}
