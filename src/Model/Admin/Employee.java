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
    private int salario;

    public Employee(Person personalData, EmployeeType employeeType, int psalario) {
        this.personalData = personalData;
        this.employeeType = employeeType;
        this.salario = psalario;
    }
    
    public Employee(Person personalData, EmployeeType employeeType,Establishment pStore, int psalario) {
        this.personalData = personalData;
        this.employeeType = employeeType;
        this.store = pStore;
        this.salario = psalario;
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

    public Person getPersonalData() {
        return personalData;
    }

    public void setPersonalData(Person personalData) {
        this.personalData = personalData;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password.toCharArray();
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    
    
}
