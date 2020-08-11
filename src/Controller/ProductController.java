/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Products.Combo;
import Model.Products.Material;
import Model.Products.Product;
import Model.Products.Promo;
import java.util.ArrayList;

/**
 *
 * @author Bryan Hernandez
 */
public class ProductController {
    
    private ArrayList<Product> inventory;
    private ArrayList<Combo> combos;
    private ArrayList<Promo> promos;
    private ArrayList<Material> materialsInventory;
    private ArrayList<Integer> amountOFProduct;

    public ProductController() {
        inventory = new ArrayList();
        amountOFProduct = new ArrayList();
        materialsInventory = new ArrayList();
        promos = new ArrayList();
    }
    
    public void addPromo(Promo p){
        promos.add(p);
        System.out.println("Promo Agregado");
    }

    public ArrayList<Promo> getPromos() {
        return promos;
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
    
    public Product getProduct(String name){
        for(Product mat: inventory){
            if(mat.getName().equals(name)){
                return mat;
            }
        }
        System.out.println("Producto retornado");
        return inventory.get(0);
    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }
    
    

    
}
