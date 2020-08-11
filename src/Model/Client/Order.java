/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Client;

import Model.Admin.Employee;
import Model.Admin.Establishment;
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
        private Establishment shop;
        private Employee employee;
        private Date date;
        private boolean deliveryRequired;
        private Client client;
        private PaymentMethod paymentMethod;

    public Order(ShoppingCart cart, Employee employee, Client client) {
        this.shop = employee.getStore();
        this.employee = employee;
        this.products = cart.getProducts();
        this.cost = cart.getCost();
        this.date = new Date();
        this.shop = employee.getStore();
        this.client = client;
        this.paymentMethod = null;
        
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Establishment getShop() {
        return shop;
    }

    public void setShop(FurnitureStore shop) {
        this.shop = shop;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDeliveryRequired() {
        return deliveryRequired;
    }

    public void setDeliveryRequired(boolean deliveryRequired) {
        this.deliveryRequired = deliveryRequired;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
        
}
