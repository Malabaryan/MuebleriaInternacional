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
    private String username;
    private char[] password;
    private ShoppingCart cart;

    public Client(Person personalData, String password, String pUsername) {
        this.personalData = personalData;
        this.password = password.toCharArray();
        this.cart = new ShoppingCart();
        this.username = pUsername;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

    public String getName() {
        return personalData.getFullName();
    }
    
    
    
    
}
