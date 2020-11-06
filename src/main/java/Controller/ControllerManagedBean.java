/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.GestorBD;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Gabriel
 */
@ManagedBean(name = "controllerManagedBean")
@SessionScoped
public class ControllerManagedBean implements Serializable{
    
    private int id;
    private String nombre, edad, correo;
    private double peso, estatura;
    private GestorBD gestorbd;
    private static ArrayList<Cliente> clienteList;

    public ControllerManagedBean() {
        gestorbd=new GestorBD();
        clienteList=gestorbd.leerCliente();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public ArrayList<Cliente> getClienteList() {
        return clienteList;
    }
    
    
}
