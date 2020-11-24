/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entidad.Empleado;
import Model.GestorBDEmpleado;
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
@ManagedBean(name = "controllerManagedBeanEmpleado")
@SessionScoped
public class ControllerManagedBeanEmpleado implements Serializable {

    private GestorBDEmpleado gestorbdEmpleado;
    private static ArrayList<Empleado> EmpleadoList;
    private Empleado empleado;

    public ControllerManagedBeanEmpleado() {
        gestorbdEmpleado = new GestorBDEmpleado();
        EmpleadoList = gestorbdEmpleado.leerEmpleado();
        empleado = new Empleado();
    }

    public void guardarEmpleado() {
        if (gestorbdEmpleado.agregar(empleado)) {
            try {
                EmpleadoList = gestorbdEmpleado.leerEmpleado();
                empleado = new Empleado();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanEmpleado.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void borrarEmpleado(Empleado em) {
        if (gestorbdEmpleado.borrarEmpleado(em)) {
            try {
                EmpleadoList = gestorbdEmpleado.leerEmpleado();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void buscarEmpleado(Empleado c) {
        empleado = new Empleado();
        empleado = c;
        if (gestorbdEmpleado.buscarEmpleado(c)) {
            System.out.println("se cargaron los datos");
        } else {
            try {
                EmpleadoList = gestorbdEmpleado.leerEmpleado();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }

    public void editarEmpleado() {
        if (gestorbdEmpleado.editarEmpleado(empleado)) {
            try {
                EmpleadoList = gestorbdEmpleado.leerEmpleado();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void validarEmpleado() {
        if (gestorbdEmpleado.validarEmpleado(empleado)) {
            System.out.println("se cargaron los datos");
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("faces/afiliado/List.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(ControllerManagedBeanEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("no se cargaron los datos");
        }
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
