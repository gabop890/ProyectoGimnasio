/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Empleado;
import Model.GestorBDEmpleado;
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
@ManagedBean(name = "controllerManagedBeanEmpleado")
@SessionScoped
public class ControllerManagedBeanEmpleado implements Serializable{
    private int id, salario;
    private String nombre, cargo;
    private GestorBDEmpleado gestorbdEmpleado;
    private static ArrayList<Empleado> EmpleadoList;
    private Empleado empleado;

    public ControllerManagedBeanEmpleado() {
        gestorbdEmpleado=new GestorBDEmpleado();
        EmpleadoList=gestorbdEmpleado.leerEmpleado();
        empleado=new Empleado();
    }
    
    public String guardarEmpleado(){
        if(gestorbdEmpleado.agregar(empleado)){
            try {
                EmpleadoList=gestorbdEmpleado.leerEmpleado();
                FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanEmpleado.class.getName()).log(Level.SEVERE,null, e);
            }
        }
        return "index";
    }

    public int getId() {
        return id;
    }

    public int getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public ArrayList<Empleado> getEmpleadoList() {
        return EmpleadoList;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
    
}
