/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Clase;
import Model.GestorBDClase;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Gabriel
 */
@ManagedBean(name = "controllerManagedBeanClase")
@SessionScoped
public class ControllerManagedBeanClase implements Serializable{
    private int codigo, instructor;
    private double calificacion;
    private String nombre, descripcion, recursos;
    private static ArrayList<Clase> listaClase;
    private GestorBDClase gestorbdclase;

    public ControllerManagedBeanClase() {
        gestorbdclase=new GestorBDClase();
//        listaClase=gestorbdclase.
    }

    public int getCodigo() {
        return codigo;
    }

    public int getInstructor() {
        return instructor;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRecursos() {
        return recursos;
    }

    public static ArrayList<Clase> getListaClase() {
        return listaClase;
    }
    
    
}
