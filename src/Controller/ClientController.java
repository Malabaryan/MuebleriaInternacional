/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin.Employee;
import Model.Client.Client;
import Model.Client.DeliveryQueue;
import Model.Client.Order;
import Model.Client.ShoppingCart;
import Model.Location;
import Model.Person;
import Model.Products.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bryan Hernandez
 */
public class ClientController {
    private ArrayList<Client> clients;
    private ArrayList<Order> orders;
    private DeliveryQueue deliveryQueue;
    private Client currentClient; 

    public ClientController() {
        this.clients = new ArrayList();
        this.orders = new ArrayList();
        this.deliveryQueue = new DeliveryQueue();
    }
    
    public void addNewClient(String fullName, Date birthDate, int tel, Location location, String email, String password){
        clients.add(new Client(new Person(fullName, birthDate, tel ,location, email), password));
    }
    
    public void addNewOrder(ShoppingCart cart, Employee employee, Client client, boolean deliveryNeeded){
        orders.add(new Order(cart, employee, client));
        if(deliveryNeeded){
            this.deliveryQueue.addOrder(new Order(cart, employee, client), deliveryNeeded);
        }
        /* Add from ProductController.sellProducts() to reduce the inventory*/
    }
    
    public Order sendNextDeliveryOrder(){
        return this.deliveryQueue.sendNextDeliveryOrder();
    }
    
    public void addProductToCart(Product product){
        this.currentClient.getCart().addProduct(product);
    }
    
}
