/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorBDMenbresia;
import Model.Menbresia;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class ControllerManagedBeanMenbresia {
    private int id, valor, cliente;
    private Date fechaInicio, fechaFin;
    private GestorBDMenbresia gestordbMenbresia;
    private static ArrayList<Menbresia> menbresiaList;

    public ControllerManagedBeanMenbresia() {
        gestordbMenbresia=new GestorBDMenbresia();
    }

    public int getId() {
        return id;
    }

    public int getValor() {
        return valor;
    }

    public int getCliente() {
        return cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public static ArrayList<Menbresia> getMenbresiaList() {
        return menbresiaList;
    }
    
    
}
