/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodchain;

/**
 *
 * @author santi
 */
public class Eslabon {
    protected String nombre;
    protected String descrpicion;
    protected Direccion direccion;
    protected Fecha fechaEntrada;
    protected Fecha fechaSalida;

    public Eslabon(String nombre, String descrpicion, Direccion direccion) {
        this.nombre = nombre;
        this.descrpicion = descrpicion;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescrpicion() {
        return descrpicion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Fecha getFechaEntrada() {
        return fechaEntrada;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescrpicion(String descrpicion) {
        this.descrpicion = descrpicion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setFechaEntrada(Fecha fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
}
