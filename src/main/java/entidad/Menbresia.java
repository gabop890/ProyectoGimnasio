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
public class Menbresia {
    private int id, valor, cliente, meses;
    private Date fechaInicio, fechaFin;

    public Menbresia(int id, int valor, int cliente, int meses, Date fechaInicio) {
        this.id = id;
        this.valor = valor;
        this.cliente = cliente;
        this.meses = meses;
        this.fechaInicio = fechaInicio;
    }

    public Menbresia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    
}
