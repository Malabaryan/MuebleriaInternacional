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
    private EmployeeType employeeType;
    private Establishment store;
    private char[] password;


    public Employee(Person personalData, EmployeeType employeeType, String pPassword) {
        this.personalData = personalData;
        this.employeeType = employeeType;
        this.password = pPassword.toCharArray();
    }
    
    public Employee(Person personalData, EmployeeType employeeType,Establishment pStore, String pPassword) {
        this.personalData = personalData;
        this.employeeType = employeeType;
        this.store = pStore;
        this.password = pPassword.toCharArray();
    }

    public void setStore(FurnitureStore store) {
        this.store = store;
    }
    
    public void setWorkshop(WorkShop store) {
        this.store = store;
    }

    public Establishment getStore() {
        return store;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }
    
    public String getUsername() {
        return this.personalData.getEmail();
    }

    public char[] getPassword() {
        return password;
    }
    
    
    
}
