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
public class Product {
    
    private int cost;
    private String name;
    private ArrayList<Material> materialsNeeded;

    public Product(int cost, String name, ArrayList<Material> materialsNeeded) {
        this.cost = cost;
        this.name = name;
        this.materialsNeeded = materialsNeeded;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Material> getMaterialsNeeded() {
        return materialsNeeded;
    }

    
    

}
