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
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gabriel
 */
public class GestorBDCliente {

    private Connection conexion = null;
    private Statement stm = null;
    private ResultSet gimResultSet;
    private Integer clave;
    private String nombre, correo;
    private Date edad;
    private Double peso, estatura;
    private int resultUpdate = 0;

    public ArrayList<Cliente> leerCliente() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente clienteHallado;
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from afiliado");
            if (!gimResultSet.next()) {
                System.out.println("No se encontraron registros");
                conexion.close();
                return null;
            } else {
                do {
                    clave = gimResultSet.getInt("id");
                    nombre = gimResultSet.getString("nombre");
                    edad = gimResultSet.getDate("edad");
                    correo = gimResultSet.getString("correo");
                    peso = gimResultSet.getDouble("peso");
                    estatura = gimResultSet.getDouble("estatura");
                    clienteHallado = new Cliente(clave, nombre, edad, correo, peso, estatura);
                    clientes.add(clienteHallado);
                } while (gimResultSet.next());
                conexion.close();
                return clientes;
            }
        } catch (Exception e) {
            System.err.println("error en la base de datos");
            e.printStackTrace();
            return null;
        }
    }

    public boolean agregarCliente(Cliente cliente) {
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentTime = sdf.format(cliente.getEdad());
            resultUpdate = stm.executeUpdate("insert into afiliado values("
                    + cliente.getClave()
                    + ",'" + cliente.getNombre()
                    + "','" + currentTime
                    + "','" + cliente.getCorreo()
                    + "'," + cliente.getPeso()
                    + "," + cliente.getEstatura()
                    + ");");
            if (resultUpdate != 0) {
                FacesMessage msg = new FacesMessage("Nuevo cliente agregado", String.valueOf(cliente.getClave()));
                FacesContext.getCurrentInstance().addMessage(null, msg);
                conexion.close();
                return true;
            } else {
                conexion.close();
                System.out.println("No se pudo insertar el cliente");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }

    public boolean BuscarClientexID(int id) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente clienteHallado;
        try {
            Conexion conectaDB = new Conexion();
            conexion = conectaDB.getConexion();
            stm = conexion.createStatement();
            gimResultSet = stm.executeQuery("select * from afiliado where (id="
                    + clave + ");");
            if (!gimResultSet.next()) {
                System.out.println("No se encontraron registros");
                conexion.close();
                return false;
            } else {
                clave = gimResultSet.getInt("id");
                nombre = gimResultSet.getString("nombre");
                edad = gimResultSet.getDate("edad");
                correo = gimResultSet.getString("correo");
                peso = gimResultSet.getDouble("peso");
                estatura = gimResultSet.getDouble("estatura");
                clienteHallado = new Cliente(clave, nombre, edad, correo, peso, estatura);
                clientes.add(clienteHallado);
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
