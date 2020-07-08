/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Client;

import Model.Products.Product;
import java.util.ArrayList;

/**
 *
 * @author Bryan Hernandez
 */
public class ShoppingCart {
    
    private ArrayList<Product> products;

    public ShoppingCart() {
        products = new ArrayList();
    }

    public void emptyCart(){
        
    }
    
    public void addProduct(Product product){
        
    }
    
    public int getCost(){
        int cost = 0;
        if(!products.isEmpty()){
            for(Product p: products){
                cost = cost + p.getCost();
            }
        }
        return  cost;
    }
    
}


