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
public class Retail extends Eslabon{
    ArrayList<Producto> productos;

    public Retail(String nombre, String descrpicion, Direccion direccion) {
        super(nombre, descrpicion, direccion);
        productos = new ArrayList<>();
    }
    
    public void addProducto(DistributionCenter d, String prod, double precio){
        Producto p = null;
        for(int i = 0; i < d.getProductos().size(); i++){
            if(d.getProductos().get(i).getNombre().equals(prod)){
                p = d.getProductos().get(i);
                p.setSupermercado(this.nombre);
                p.setPrecio(precio);
                break;
            }
        }
        if(p != null){
            productos.add(p);
        }
    }
            
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
}
