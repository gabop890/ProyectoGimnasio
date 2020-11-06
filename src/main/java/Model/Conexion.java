/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gabriel
 */
public class Conexion {

    private Connection conexion = null;
    private String servidor = "localhost";
    private String database = "gimnasio";
    private String usuario = "root";
    private String password = "admin";
    private String url = "";

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor + "/" + database+"?serverTimezone=UTC";
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public Connection cerrarConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        conexion = null;
        return conexion;
    }

}
