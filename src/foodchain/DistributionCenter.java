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
public class DistributionCenter extends Eslabon{
    ArrayList<Producto> productos;

    public DistributionCenter(String nombre, String descrpicion, Direccion direccion) {
        super(nombre, descrpicion, direccion);
        productos = new ArrayList<>();
    }
    
    public void addProductos(Manufacturer m, String prod){
        Producto p = null;
        for(int i = 0; i < m.getProductos().size(); i++){
            if(m.getProductos().get(i).getNombre().equals(prod)){
                p = m.getProductos().get(i);
                p.setDistribuidor(this.nombre);
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
