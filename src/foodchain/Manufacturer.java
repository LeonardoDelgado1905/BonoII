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
public class Manufacturer extends Eslabon{
    ArrayList<Producto> productos;

    public Manufacturer(String nombre, String descrpicion, Direccion direccion) {
        super(nombre, descrpicion, direccion);
        productos = new ArrayList<>();
    }
    
    public void addProductos(HashMap<String, ArrayList<String>> granjas, String nombre){
        Producto p = new Producto(nombre, granjas);
        p.setManufactura(this.nombre);
        productos.add(p);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
    
}
