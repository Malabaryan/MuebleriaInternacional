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


    public Employee(Person personalData, EmployeeType employeeType) {
        this.personalData = personalData;
        this.employeeType = employeeType;
    }
    
    public Employee(Person personalData, EmployeeType employeeType,Establishment pStore) {
        this.personalData = personalData;
        this.employeeType = employeeType;
        this.store = pStore;
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
    
}
