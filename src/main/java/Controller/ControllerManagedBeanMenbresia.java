/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorBDMenbresia;
import entidad.Menbresia;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Gabriel
 */
@ManagedBean(name = "controlManagedBeanMenbresia")
@SessionScoped
public class ControllerManagedBeanMenbresia implements Serializable{

    private Menbresia menbresia;
    private GestorBDMenbresia gestordbMenbresia;
    private static ArrayList<Menbresia> menbresiaList;

    public ControllerManagedBeanMenbresia() {
        gestordbMenbresia = new GestorBDMenbresia();
        menbresiaList = gestordbMenbresia.leerMenbresia();
        menbresia = new Menbresia();
    }

    public void guardarMenbresia() {
        if (gestordbMenbresia.agregarMenbresia(menbresia)) {
            menbresiaList = gestordbMenbresia.leerMenbresia();
            menbresia = new Menbresia();
        }
    }

    public void borrarMnebresia(Menbresia m) {
        if (gestordbMenbresia.borrarMenbresia(m)) {
            try {
                menbresiaList = gestordbMenbresia.leerMenbresia();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void buscarMenbresia(Menbresia m) {
        menbresia = new Menbresia();
        menbresia = m;
        if (gestordbMenbresia.buscarmenbresia(m)) {
            System.out.println("se cargaron los datos");
        } else {
            try {
                menbresiaList = gestordbMenbresia.leerMenbresia();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void editarMenbresia() {
        if (gestordbMenbresia.editarMenbresia(menbresia)) {
            try {
                menbresiaList = gestordbMenbresia.leerMenbresia();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public ArrayList<Menbresia> getMenbresiaList() {
        return menbresiaList;
    }

    public Menbresia getMenbresia() {
        return menbresia;
    }

    public void setMenbresia(Menbresia menbresia) {
        this.menbresia = menbresia;
    }

}
