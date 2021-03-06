/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodchain;

import java.util.*;

/**
 *
 * @author santi
 */
public class Producto {
    private String nombre;
    private HashMap<String, ArrayList<String> > granjas;
    private String manufactura;
    private String distribuidor;
    private String supermercado;
    private double precio;

    public Producto(String nombre, HashMap<String, ArrayList<String>> granjas) {
        this.nombre = nombre;
        this.granjas = granjas;
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<String, ArrayList<String>> getGranjas() {
        return granjas;
    }

    public String getManufactura() {
        return manufactura;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public String getSupermercado() {
        return supermercado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGranjas(HashMap<String, ArrayList<String>> granjas) {
        this.granjas = granjas;
    }

    public void setManufactura(String manufactura) {
        this.manufactura = manufactura;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
