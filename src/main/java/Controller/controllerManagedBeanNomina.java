/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entidad.Cliente;
import Model.GestorBDCliente;
import Model.GestorDBNomina;
import entidad.Nomina;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Gabriel
 */
@ManagedBean(name = "controllerManagedBeanNomina")
@SessionScoped
public class controllerManagedBeanNomina implements Serializable {

    private Nomina nomina;
    private GestorDBNomina gestorbdNomina;
    private static ArrayList<Nomina> nominaList;

    public controllerManagedBeanNomina() {
        gestorbdNomina = new GestorDBNomina();
        nominaList = gestorbdNomina.leerNomina();
        nomina = new Nomina();
    }

    public void guardarNomina() {

        if (gestorbdNomina.agregarNomina(nomina)) {
            nominaList = gestorbdNomina.leerNomina();
            nomina = new Nomina();
        }
    }

    public void borrarNomina(Nomina c) {
        if (gestorbdNomina.borrarNomina(c)) {
            try {
                nominaList = gestorbdNomina.leerNomina();
            } catch (Exception e) {
                Logger.getLogger(controllerManagedBeanNomina.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void buscarNomina(Nomina c) {
        nomina = new Nomina();
        nomina = c;
        if (gestorbdNomina.buscarNomina(c)) {
            System.out.println("se cargaron los datos");
        } else {
            try {
                nominaList = gestorbdNomina.leerNomina();
            } catch (Exception e) {
                Logger.getLogger(controllerManagedBeanNomina.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }

    public void editarNomina() {
        if (gestorbdNomina.editarNomina(nomina)) {
            try {
                nominaList = gestorbdNomina.leerNomina();
            } catch (Exception e) {
                Logger.getLogger(controllerManagedBeanNomina.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public ArrayList<Nomina> getNominaList() {
        return nominaList;
    }

    public void setNominaList(ArrayList<Nomina> nominaList) {
        controllerManagedBeanNomina.nominaList = nominaList;
    }

}
