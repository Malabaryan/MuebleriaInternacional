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
    private Queue<DeliveryOrder> orders;
    private ArrayList<DeliveryOrder> backOrders;
    

    public DeliveryQueue() {
        orders = new LinkedList();
        backOrders = new ArrayList();
    }
    
    public DeliveryOrder sendNextDeliveryOrder(Evaluation eval){
        this.orders.peek().finishDelivery(eval);
        return this.orders.poll();
    }

    public void addOrder(DeliveryOrder order, boolean exist){
        if(exist){
            orders.add(order);
        }
        else{
            backOrders.add(order);
        }
    }

    public Queue<DeliveryOrder> getOrders() {
        return orders;
    }

    public ArrayList<DeliveryOrder> getBackOrders() {
        return backOrders;
    }
    
    
    
}
