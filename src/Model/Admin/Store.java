/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import Model.Location;

/**
 *
 * @author ariel
 */
public class Store {
    private Location location;
    private Employee manager;

    public Store(Location location, Employee manager) {
        this.location = location;
        this.manager = manager;
    }

    
    
}
