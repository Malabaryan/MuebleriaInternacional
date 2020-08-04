/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Products;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bryan Hernandez
 */
public class Combo extends Product{
    
    private ArrayList<Product> products; 

    public Combo(ArrayList<Product> products, int cost, String name, ArrayList<Material> materialsNeeded) {
        super(cost, name, materialsNeeded);
        this.products = products;
    }
    
    public void addProduct(Product product){
        products.add(product);
    }
    
}
