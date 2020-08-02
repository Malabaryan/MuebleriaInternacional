/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import Model.Location;
import java.util.ArrayList;

/**Establishment
 *
 * @author ariel
 */
public class Establishment {
    private Location location;
    private Employee manager;
    private ArrayList<Employee> employees;

    public Establishment(Location location, Employee manager) {
        this.location = location;
        this.manager = manager;
    }
    
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Location getLocation() {
        return location;
    }

    public Employee getManager() {
        return manager;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    
}
