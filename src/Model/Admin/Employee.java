/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import Model.Person;

/**
 *
 * @author ariel
 */
public class Employee {
    private Person personalData;
    private double minSalary;
    private double maxSalary;
    private FurnitureStore store;

    public FurnitureStore getStore() {
        return store;
    }

    public Person getPersonalData() {
        return personalData;
    }

    public void setPersonalData(Person personalData) {
        this.personalData = personalData;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Employee(Person personalData, double minSalary, double maxSalary, FurnitureStore store) {
        this.personalData = personalData;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.store = store;
    }
    
}
