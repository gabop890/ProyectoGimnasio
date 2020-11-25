/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Config.Conexion;
import entidad.Clase;
import entidad.Nomina;
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
public class GestorDBNomina {

    private Connection conexion = null;
    private Statement stm = null;
    private ResultSet gimResultSet;
    private int codigo, valor;
    private Date fecha;
    private long empleado;
    private int resultUpdate = 0;

    public ArrayList<Nomina> leerNomina() {
        ArrayList<Nomina> nominas = new ArrayList<Nomina>();
        Nomina nominaHallada;
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from nomina");
            if (!gimResultSet.next()) {
                System.out.println("No se encontraron registros");
                conexion.close();
                return null;
            } else {
                do {
                    codigo = gimResultSet.getInt("codigo");
                    fecha = gimResultSet.getDate("fecha");
                    valor = gimResultSet.getInt("valor");
                    empleado = gimResultSet.getLong("empleado");
                    nominaHallada = new Nomina(codigo, valor, fecha, empleado);
                    nominas.add(nominaHallada);
                } while (gimResultSet.next());
                conexion.close();
                return nominas;
            }
        } catch (Exception e) {
            System.err.println("error en la base de datos");
            e.printStackTrace();
            return null;
        }
    }

    public boolean agregarNomina(Nomina nomina) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentTime = sdf.format(nomina.getFecha());
            resultUpdate = stm.executeUpdate("insert into nomina (fecha, valor, empleado) values('"
                    + currentTime
                    + "'," + nomina.getValor()
                    + "," + nomina.getEmpleado()
                    + ");");
            if (resultUpdate != 0) {
                FacesMessage msg = new FacesMessage("Nueva nomina agregada", String.valueOf(nomina.getCodigo()));
                FacesContext.getCurrentInstance().addMessage(null, msg);
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo insertar la nomina");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }

    public boolean borrarNomina(Nomina borrarNomina) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("delete from nomina where("
                    + "codigo=" + borrarNomina.getCodigo() + ");");
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo borrar la nomina");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean buscarNomina(Nomina buscarNomina) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from nomina where(codigo="
                    + buscarNomina.getCodigo() + ");");
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

    public boolean editarNomina(Nomina nominaEditar) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentTime = sdf.format(nominaEditar.getFecha());
            resultUpdate = stm.executeUpdate("update nomina set fecha='"
                    + currentTime
                    + "',valor=" + nominaEditar.getValor()
                    + ",empleado=" + nominaEditar.getEmpleado()
                    + " where codigo=" + nominaEditar.getCodigo()
                    + ";");
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo editar la nomina");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
}
