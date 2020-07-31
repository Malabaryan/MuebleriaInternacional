/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Establishment {
    private Location location;
    private Employee manager;
    private ArrayList<Employee> employees;

    public Establishment(Location location, Employee manager, ArrayList<Employee> employees) {
        this.location = location;
        this.manager = manager;
        this.employees = employees;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    
}
