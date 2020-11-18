/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestorBDMaquina;
import entidad.Maquina;
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
@ManagedBean(name = "controllerManagedBeanMaquina")
@SessionScoped
public class ControllerManagedBeanMaquina implements Serializable {

    private Maquina maquina;
    private GestorBDMaquina gestorDBMaquina;
    private static ArrayList<Maquina> maquinaList;

    public ControllerManagedBeanMaquina() {
        gestorDBMaquina = new GestorBDMaquina();
        maquinaList = gestorDBMaquina.leerMaquina();
        maquina = new Maquina();
    }

    public void guardarMaquina() {
        if (gestorDBMaquina.agregarMaquina(maquina)) {
            maquinaList = gestorDBMaquina.leerMaquina();
            maquina = new Maquina();
        }
    }

    public void borrarMaquina(Maquina c) {
        if (gestorDBMaquina.borrarMaquina(c)) {
            try {
                maquinaList = gestorDBMaquina.leerMaquina();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void buscarMaquina(Maquina c) {
        maquina = new Maquina();
        maquina = c;
        if (gestorDBMaquina.buscarMaquina(c)) {
            System.out.println("se cargaron los datos");
        } else {
            try {
                maquinaList = gestorDBMaquina.leerMaquina();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }

    public void editarMaquina() {
        if (gestorDBMaquina.editarMaquina(maquina)) {
            try {
                maquinaList = gestorDBMaquina.leerMaquina();
            } catch (Exception e) {
                Logger.getLogger(ControllerManagedBeanCliente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public ArrayList<Maquina> getMaquinaList() {
        return maquinaList;
    }
}
