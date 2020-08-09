/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bryan Hernandez
 */
public class Location {
    private String country;
    private String state;
    private String address;

    public Location(String country, String state, String address) {
        this.country = country;
        this.state = state;
        this.address = address;
    }

    public Location(String country, String state) {
        this.country = country;
        this.state = state;
    }
    
    
}
