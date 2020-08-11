/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Products.Material;
import Model.Products.Product;
import java.util.ArrayList;

/**
 *
 * @author Bryan Hernandez
 */
public class ProductController {
    
    private ArrayList<Product> inventory;
    private ArrayList<Material> materialsInventory;
    private ArrayList<Integer> amountOFProduct;

    public ProductController() {
        inventory = new ArrayList();
        amountOFProduct = new ArrayList();
        materialsInventory = new ArrayList();
    }
    
    public void addProduct(Product p, int amount, ArrayList<Material> materials){
        if(inventory.contains(p)){
            amountOFProduct.set(amountOFProduct.get(inventory.indexOf(p)), amountOFProduct.get(inventory.indexOf(p)) + amount);
        }
        else{
            inventory.add(p);
            amountOFProduct.add(amount);
        }
        
        p.setMaterialsNeeded(materials);
        System.out.println("Producto Agregado");
    }
   
    public void addMaterial(Material mat){
        materialsInventory.add(mat);
        System.out.println("Material Agregado");
    }
    
    public Material getMaterial(String name){
        for(Material mat: materialsInventory){
            if(mat.getName().equals(name)){
                return mat;
            }
        }
        System.out.println("Material retornado");
        return materialsInventory.get(0);
    }

    
}
