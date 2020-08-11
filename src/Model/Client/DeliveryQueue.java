/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Client;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Bryan Hernandez
 */
public class DeliveryQueue {
    private Queue<Order> orders;
    private ArrayList<Order> backOrders;
    

    public DeliveryQueue() {
        orders = new LinkedList();
        backOrders = new ArrayList();
    }
    
    public Order sendNextDeliveryOrder(){
        return this.orders.poll();
    }

    public void addOrder(Order order, boolean exist){
        if(exist){
            orders.add(order);
        }
        else{
            backOrders.add(order);
        }
    }
    
}
