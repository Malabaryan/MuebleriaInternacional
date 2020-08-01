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
public class Product {
    
    private int cost;
    private String name;

    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }
    
    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
    
    

}
