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
public class Cliente {

    private Integer clave;
    private String nombre, correo, password;
    private Date edad;
    private Double peso, estatura;
    private long celular;

    public Cliente(Integer clave, String nombre, String correo, Date edad, Double peso, Double estatura, long celular) {
        this.clave = clave;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.celular = celular;
    }

    public Cliente(Integer clave, String nombre, String correo, String password, Date edad, Double peso, Double estatura, long celular) {
        this.clave = clave;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.celular = celular;
    }

    public Cliente() {
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
