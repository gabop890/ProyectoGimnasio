/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Config.Conexion;
import entidad.Menbresia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gabriel
 */
public class GestorBDMenbresia {

    private Connection conexion = null;
    private Statement stm = null;
    private ResultSet gimResultSet;
    private int id, valor, cliente, meses;
    private Date fechaInicio, fechaFin;
    private int resultUpdate = 0;

    public ArrayList<Menbresia> leerMenbresia() {
        ArrayList<Menbresia> menbresias = new ArrayList<Menbresia>();
        Menbresia menbresiaHallada;
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from menbresia");
            if (!gimResultSet.next()) {
                System.out.println("No se encontraron registros");
                conexion.close();
                return null;
            } else {
                do {
                    id = gimResultSet.getInt("codigo");
                    fechaInicio = gimResultSet.getDate("fechainicio");
                    valor = gimResultSet.getInt("valor");
                    fechaFin = gimResultSet.getDate("fechafin");
                    cliente = gimResultSet.getInt("cliente");
                    meses = gimResultSet.getInt("meses");
                    menbresiaHallada = new Menbresia(id, valor, cliente, meses, fechaInicio);
                    menbresias.add(menbresiaHallada);
                } while (gimResultSet.next());
                conexion.close();
                return menbresias;
            }
        } catch (Exception e) {
            System.err.println("error en la base de datos");
            e.printStackTrace();
            return null;
        }
    }

    public boolean agregarMenbresia(Menbresia menbresia) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentTime = sdf.format(menbresia.getFechaInicio());
            resultUpdate = stm.executeUpdate("insert into menbresia (valor, fechainicio, cliente, meses, fechafin) values("
                    + menbresia.getValor()
                    + ",'" + currentTime
                    + "'," + menbresia.getCliente()
                    + "," + menbresia.getMeses()
                    + ",'" + calcularMeses(fechaInicio, meses)
                    + ");");
            if (resultUpdate != 0) {
                FacesMessage msg = new FacesMessage("Nueva menbresia agregada", String.valueOf(menbresia.getId()));
                FacesContext.getCurrentInstance().addMessage(null, msg);
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo insertar la menbresia");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error en la base de datos" + resultUpdate);
            return false;
        }
    }

    public Date calcularMeses(Date fecha, int meses) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(calendar.MONTH, meses);
        return calendar.getTime();
    }

    public boolean borrarMenbresia(Menbresia borrarMenbresia) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            resultUpdate = stm.executeUpdate("delete from menbresia where("
                    + "codigo=" + borrarMenbresia.getId() + ");");
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo borrar la menbresia");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean buscarmenbresia(Menbresia buscarMenbresia) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from menbresia where(codigo="
                    + buscarMenbresia.getId() + ");");
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

    public boolean editarMenbresia(Menbresia menbresiaEditar) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentTime = sdf.format(menbresiaEditar.getFechaInicio());
            resultUpdate = stm.executeUpdate("update menbresia set valor="
                    + menbresiaEditar.getValor()
                    + ",fechainicio='" + currentTime
                    + "',meses=" + menbresiaEditar.getMeses()
                    + ",valor=" + menbresiaEditar.getValor()
                    + " where codigo=" + menbresiaEditar.getId()
                    + ";");
            if (resultUpdate != 0) {
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo editar la menbresia");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
        }
    }
}
