/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class Maquina {
    private int id;
    private String estado, descripcion;
    private Date fechaConpra, fechaMantenimiento;

    public Maquina(int id, String estado, String descripcion, Date fechaConpra, Date fechaMantenimiento) {
        this.id = id;
        this.estado = estado;
        this.descripcion = descripcion;
        this.fechaConpra = fechaConpra;
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public Maquina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaConpra() {
        return fechaConpra;
    }

    public void setFechaConpra(Date fechaConpra) {
        this.fechaConpra = fechaConpra;
    }

    public Date getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(Date fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }
    
    
}
