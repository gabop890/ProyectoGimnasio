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
public class Nomina {
    private int codigo, valor;
    private Date fecha;
    private long empleado;

    public Nomina() {
    }

    public Nomina(int codigo, int valor, Date fecha, long empleado) {
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.empleado = empleado;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getEmpleado() {
        return empleado;
    }

    public void setEmpleado(long empleado) {
        this.empleado = empleado;
    }
    
    
}
