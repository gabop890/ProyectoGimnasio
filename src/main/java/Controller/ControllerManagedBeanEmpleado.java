/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Empleado;
import Model.GestorBDEmpleado;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class ControllerManagedBeanEmpleado {
    private int id, salario;
    private String nombre, cargo;
    private GestorBDEmpleado gestorbdEmpleado;
    private static ArrayList<Empleado> EmpleadoList;

    public ControllerManagedBeanEmpleado() {
        gestorbdEmpleado=new GestorBDEmpleado();
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

    public static ArrayList<Empleado> getEmpleadoList() {
        return EmpleadoList;
    }
    
    
    
}
