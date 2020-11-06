/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorBD {
    private Connection conexion=null;
    private Statement stm= null;
    private ResultSet gimResultSet;
    private Integer clave;
    private String nombre, edad, correo;
    private Double peso, estatura;
    
    public ArrayList<Cliente> leerCliente(){
        ArrayList<Cliente> clientes=new ArrayList<Cliente>();
        Cliente clienteHallado;
        try {
            Conexion conectaDB=new Conexion();
            conexion=conectaDB.getConexion();
            stm=conexion.createStatement();
            gimResultSet=stm.executeQuery("select * from afiliado");
            if (!gimResultSet.next()) {
                System.out.println("No se encontraron registros");
                conexion.close();
                return null;
            }else{
                do{
                    clave=gimResultSet.getInt("id");
                    nombre=gimResultSet.getString("nombre");
                    edad=gimResultSet.getString("edad");
                    correo=gimResultSet.getString("correo");
                    peso=gimResultSet.getDouble("peso");
                    estatura=gimResultSet.getDouble("estatura");
                    clienteHallado=new Cliente(clave, nombre, edad, correo, peso, estatura);
                    clientes.add(clienteHallado);
                }while (gimResultSet.next());                
                    conexion.close();
                    return clientes;                
            }
        } catch (Exception e) {
            System.err.println("error en la base de datos");
            e.printStackTrace();
            return null;
        }
    }
}
