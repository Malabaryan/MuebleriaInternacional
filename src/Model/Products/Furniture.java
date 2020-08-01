/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Products;

/**
 *
 * @author Bryan Hernandez
 */
public class Furniture extends Product{
    
    private String type;
    
    public Furniture(int cost, String name, String pType) {
        super(cost, name);
        type = pType;
    }

    public String getType() {
        return type;
    }
    
    
    
}
