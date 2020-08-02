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
public class Combo extends Product{
    
    private ArrayList<Product> products; 
   
    public Combo(int cost, String name) {
        super(cost, name);
        products = new ArrayList();
    }
    
    public void addProduct(Product product){
        products.add(product);
    }
    
}
