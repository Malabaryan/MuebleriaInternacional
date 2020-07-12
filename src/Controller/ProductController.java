/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Products.Product;
import java.util.ArrayList;

/**
 *
 * @author Bryan Hernandez
 */
public class ProductController {
    
    private ArrayList<Product> inventory;
    
    public boolean checkInventory(ArrayList<Product> products){
        for(Product p : products){
            if (!inventory.contains(p)){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Use products to reduce the items from the inventory
     * @param products 
     */
    public void sellProducts(ArrayList<Product> products){
        /*TODO*/
    }
    
}
