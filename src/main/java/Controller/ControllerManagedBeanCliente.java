/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.GestorBDCliente;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gabriel
 */
@ManagedBean(name = "controllerManagedBeanCliente")
@SessionScoped
public class ControllerManagedBeanCliente implements Serializable{
    
    private Cliente cliente;
    private GestorBDCliente gestorbd;
    private static ArrayList<Cliente> clienteList;
    

    public ControllerManagedBeanCliente() {
        gestorbd=new GestorBDCliente();
        clienteList=gestorbd.leerCliente();
        cliente = new Cliente();
    }
    
    public String guardarCliente(){
//        cliente=new Cliente(cliente.getClave(), cliente.getNombre(), cliente.getEdad(), cliente.getCorreo(), cliente.getPeso(), cliente.getEstatura());
        if (gestorbd.agregarCliente(cliente)) {
            try {
                clienteList=gestorbd.leerCliente();
                FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
            } catch (IOException e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE,null, e);
            }
        }
        return "index";
    }
    
    public void buscarClientexID(){
        if(gestorbd.BuscarClientexID(cliente.getClave())){
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("#");
            } catch (IOException e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE,null, e);
            }
        }
    }

    public ArrayList<Cliente> getClienteList() {
        return clienteList;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
       
}
