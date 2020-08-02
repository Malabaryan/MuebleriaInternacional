/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin.Employee;
import Model.Admin.Establishment;
import Model.Admin.FurnitureStore;
import Model.Admin.WorkShop;
import java.util.ArrayList;

/**
 *
 * @author Bryan Hernandez
 */
public class AdminController {
    
    private ArrayList<FurnitureStore> furnitureStores;
    private ArrayList<WorkShop> workshops;
    private ArrayList<Employee> employees;

    public AdminController() {
        furnitureStores = new ArrayList();
        workshops = new ArrayList();
        employees = new ArrayList();
    }

    public FurnitureStore addFurnitureStore(FurnitureStore furnitureStore){
        furnitureStores.add(furnitureStore);
        return furnitureStore;
    }
    
    public void addWorkshops(WorkShop e){
        workshops.add(e);
    }
    
    public Employee addEmployee(Employee empl){
        employees.add(empl);
        return empl;
    }
}
