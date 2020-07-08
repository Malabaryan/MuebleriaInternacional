/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Client;

import Model.Person;

/**
 *
 * @author Bryan Hernandez
 */
public class Client {
    private Person personalData;
    private String password;
    private ShoppingCart cart;

    public Client(Person personalData, String password) {
        this.personalData = personalData;
        this.password = password;
        this.cart = new ShoppingCart();
    }
    
    
    
    
}
