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
public class Farmer extends Eslabon{
    private ArrayList<String> cultivos;

    public Farmer(String nombre, String descrpicion, Direccion direccion) {
        super(nombre, descrpicion, direccion);
        this.cultivos = new ArrayList<>();
    }
    
    public void addCultivo(String nombre){
        cultivos.add(nombre);
    }

    public ArrayList<String> getCultivos() {
        return cultivos;
    }

    public void setCultivos(ArrayList<String> cultivos) {
        this.cultivos = cultivos;
    }
    
    
    
    
    
}
