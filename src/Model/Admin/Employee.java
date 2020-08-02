/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import Model.Location;
import Model.Person;
import java.util.Date;

/**
 *
 * @author ariel
 */
public class Employee {
    private Person personalData;
    private double minSalary;
    private double maxSalary;
    private FurnitureStore store;

    public Employee(Person pers,FurnitureStore store) {
        personalData = pers;
        this.store = store;
    }
    
    public Employee(Person pers) {
        personalData = pers;
        this.store = store;
    }

    public void setStore(FurnitureStore store) {
        this.store = store;
    }
    
    public void setSalary(double pMinSalary, double pMaxSalary){
        minSalary = pMinSalary;
        maxSalary = pMaxSalary;
    }

    public FurnitureStore getStore() {
        return store;
    }
    
}
