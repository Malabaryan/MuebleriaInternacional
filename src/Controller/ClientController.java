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
    
    public Client login(String username, char[] password){
        for(Client client: clients){
            if(client.getUsername().equals(username)){
                if(client.getPassword().equals(password))
                    return client;
            }
        }
        return null;
    }
    
    public void addNewClient(Person pers, String password, String username){
        clients.add(new Client(pers, password, username));
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

    public void setCurrentClient(Client currentClient) {
        this.currentClient = currentClient;
    }
    
    public void borrarDespues(){
        
    }
           
    
}
