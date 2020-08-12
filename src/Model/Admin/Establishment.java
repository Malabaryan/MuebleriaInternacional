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
    private String name;
    private Location location;
    private Employee manager;
    private ArrayList<Employee> employees;

    public Establishment(Location location, Employee manager,String pname) {
        this.location = location;
        this.manager = manager;
        this.name = pname;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
