/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Client;

import Controller.MainController;
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
        this.products.clear();
    }
    
    public void addProduct(Product product){
        this.products.add(product);
    }
    
    public int getCost(){
        return MainController.getInstance().getClientController().getCost(products);
    }
    
    

    public ArrayList<Product> getProducts() {
        return products;
    }
    
    
}


