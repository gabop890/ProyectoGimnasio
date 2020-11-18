/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Config.Conexion;
import entidad.Maquina;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gabriel
 */
public class GestorBDMaquina {

    private Connection conexion = null;
    private Statement stm = null;
    private ResultSet gimResultSet;
    private int id;
    private String estado, descripcion;
    private Date fechaConpra, fechaMantenimiento;
    private int resultUpdate = 0;

    public ArrayList<Maquina> leerMaquina() {
        ArrayList<Maquina> maquinas = new ArrayList<Maquina>();
        Maquina maquinaHallado;
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from maquina");
            if (!gimResultSet.next()) {
                System.out.println("No se encontraron registros");
                conexion.close();
                return null;
            } else {
                do {
                    id = gimResultSet.getInt("id");
                    fechaConpra = gimResultSet.getDate("fechacompra");
                    fechaMantenimiento = gimResultSet.getDate("fechamantenimiento");
                    estado = gimResultSet.getString("estado");
                    descripcion = gimResultSet.getString("descripcion");

                    maquinaHallado = new Maquina(id, estado, descripcion, fechaConpra, fechaMantenimiento);
                    maquinas.add(maquinaHallado);
                } while (gimResultSet.next());
                conexion.close();
                return maquinas;
            }
        } catch (Exception e) {
            System.err.println("error en la base de datos");
            e.printStackTrace();
            return null;
        }
    }

    public boolean agregarMaquina(Maquina maquina) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentTimefc = sdf.format(maquina.getFechaConpra());
            String currenTimeFM = sdf.format(maquina.getFechaMantenimiento());
            resultUpdate = stm.executeUpdate("insert into maquina values("
                    + maquina.getId()
                    + ",'" + currentTimefc
                    + "','" + currenTimeFM
                    + "','" + maquina.getEstado()
                    + "','" + maquina.getDescripcion()
                    + "');");
            if (resultUpdate != 0) {
                FacesMessage msg = new FacesMessage("Nueva maquina agregada", String.valueOf(maquina.getId()));
                FacesContext.getCurrentInstance().addMessage(null, msg);
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo insertar la maquina");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }

    public boolean borrarMaquina(Maquina borrarMaquina) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("delete from maquina where("
                    + "id=" + borrarMaquina.getId() + ");");
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo borrar la maquina");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean buscarMaquina(Maquina buscarMaquina) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from maquina where(id="
                    + buscarMaquina.getId() + ");");
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

    public boolean editarMaquina(Maquina maquinaEditar) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentTimeFC = sdf.format(maquinaEditar.getFechaConpra());
            String currenTimeFM = sdf.format(maquinaEditar.getFechaMantenimiento());
            resultUpdate = stm.executeUpdate("update maquina set fechacompra='"
                    + currentTimeFC
                    + "',fechamantenimiento='" + currenTimeFM
                    + "',estado='" + maquinaEditar.getEstado()
                    + "',descripcion= '" + maquinaEditar.getDescripcion()
                    + " ' where id=" + maquinaEditar.getId()
                    + ";");
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo editar la maquina");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
}
