/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorBDMaquina;
import Model.Maquina;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class ControllerManagedBeanMaquina {
    private int id;
    private String estado, descripcion;
    private Date fechaConpra, fechaMantenimiento;
    private GestorBDMaquina gestorDBMaquina;
    private static ArrayList<Maquina> maquinaList;

    public ControllerManagedBeanMaquina() {
        gestorDBMaquina=new GestorBDMaquina();
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaConpra() {
        return fechaConpra;
    }

    public Date getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public static ArrayList<Maquina> getMaquinaList() {
        return maquinaList;
    }
    
    
}
