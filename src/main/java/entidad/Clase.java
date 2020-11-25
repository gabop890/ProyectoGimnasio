/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Gabriel
 */
public class Clase {
    private int codigo, instructor;
    private double calificacion;
    private String nombre, descripcion, recursos;

    public Clase(int codigo, int instructor, double calificacion, String nombre, String descripcion, String recursos) {
        this.codigo = codigo;
        this.instructor = instructor;
        this.calificacion = calificacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.recursos = recursos;
    }

    public Clase() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getInstructor() {
        return instructor;
    }

    public void setInstructor(int instructor) {
        this.instructor = instructor;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }
    
    
}
