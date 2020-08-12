/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import Controller.MainController;
import Model.Location;

/**
 *
 * @author Bryan Hernandez
 */
public class FurnitureStore extends Establishment{
    
    public FurnitureStore(Location location, Employee manager, String pname) {
        super(location, manager, pname);
        //manager.setStore(this);
    }
    
    
}

