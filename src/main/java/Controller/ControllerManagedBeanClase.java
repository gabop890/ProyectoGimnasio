/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorBDClase;
import Model.GestorBDEmpleado;
import entidad.Clase;
import entidad.Empleado;
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
@ManagedBean(name = "controllerManagedBeanClase")
@SessionScoped
public class ControllerManagedBeanClase implements Serializable{
    private GestorBDClase gestorbdClase;
    private static ArrayList<Clase> ClaseList;
    private Clase clase;

    public ControllerManagedBeanClase() {
        gestorbdClase = new GestorBDClase();
        ClaseList = gestorbdClase.leerClase();
        clase = new Clase();
    }

    

    public void guardarClase() {
        if (gestorbdClase.agregarClase(clase)) {
            try {
                ClaseList = gestorbdClase.leerClase();
                clase = new Clase();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanClase.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void borrarClase(Clase em) {
        if (gestorbdClase.borrarClase(em)) {
            try {
                ClaseList = gestorbdClase.leerClase();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanClase.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void buscarClase(Clase c) {
        clase = new Clase();
        clase = c;
        if (gestorbdClase.buscarClase(c)) {
            System.out.println("se cargaron los datos");
        } else {
            try {
                ClaseList = gestorbdClase.leerClase();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanClase.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }

    public void editarClase() {
        if (gestorbdClase.editarClase(clase)) {
            try {
                ClaseList = gestorbdClase.leerClase();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanClase.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public ArrayList<Clase> getClaseList() {
        return ClaseList;
    }

    public static void setClaseList(ArrayList<Clase> ClaseList) {
        ControllerManagedBeanClase.ClaseList = ClaseList;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
    
    
}
