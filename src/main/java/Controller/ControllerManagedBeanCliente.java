/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.GestorBDCliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Gabriel
 */
@ManagedBean(name = "controllerManagedBeanCliente")
@SessionScoped
public class ControllerManagedBeanCliente implements Serializable {

    private Cliente cliente;
    private GestorBDCliente gestorbd;
    private static ArrayList<Cliente> clienteList;

    public ControllerManagedBeanCliente() {
        gestorbd = new GestorBDCliente();
        clienteList = gestorbd.leerCliente();
        cliente = new Cliente();
    }

    public void guardarCliente() {
//        cliente=new Cliente(cliente.getClave(), cliente.getNombre(), cliente.getEdad(), cliente.getCorreo(), cliente.getPeso(), cliente.getEstatura());
        if (gestorbd.agregarCliente(cliente)) {
            clienteList = gestorbd.leerCliente();
            cliente = new Cliente();
        }
    }

    public void borrarAfiliado(Cliente c) {
//        Cliente borrarAfiliado= new Cliente();
        if (gestorbd.borrarAfiliado(c)) {
            try {
                clienteList = gestorbd.leerCliente();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
    public void buscarAfiliado(Cliente c){
        cliente=new Cliente();
        cliente=c;
        if(gestorbd.buscarAfiliado(c)){
            System.out.println("se cargaron los datos");
        }else{
            try {
                clienteList=gestorbd.leerCliente();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
            
    }

    public void editarAfiliado() {
        if (gestorbd.editarAfiliado(cliente)) {
            try {
                clienteList = gestorbd.leerCliente();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
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
