/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Products;

import java.util.ArrayList;

/**
 *
 * @author Bryan Hernandez
 */
public class Furniture extends Product{
    
    private String type;

    public Furniture(String type, int cost, String name, ArrayList<Material> materialsNeeded) {
        super(cost, name, materialsNeeded);
        this.type = type;
    }
    

    public String getType() {
        return type;
    }
    
    
    
}
