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
    private ArrayList<Integer> amountOFProduct;

    public ProductController() {
        inventory = new ArrayList();
        amountOFProduct = new ArrayList();
    }
    
    public void addProduct(Product p, int amount){
        if(inventory.contains(p)){
            amountOFProduct.set(amountOFProduct.get(inventory.indexOf(p)), amountOFProduct.get(inventory.indexOf(p)) + amount);
        }
        else{
            inventory.add(p);
            amountOFProduct.add(amount);
        }
    }
   
    
    

    
}
