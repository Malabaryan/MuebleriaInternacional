/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Client;

import Model.Admin.Employee;
import Model.Admin.FurnitureStore;
import Model.Products.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bryan Hernandez
 */
public class Order {
        private ArrayList<Product> products;
        private int cost;
        private FurnitureStore shop;
        private Employee employee;
        private Date date;
        private boolean deliveryRequired;
        private Client client;

    public Order(ShoppingCart cart, Employee employee, Client client) {
        this.shop = shop;
        this.employee = employee;
        this.products = cart.getProducts();
        this.cost = cart.getCost();
        this.date = new Date();
        this.shop = employee.getStore();
        this.client = client;
    }
        
        
}
