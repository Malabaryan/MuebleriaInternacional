/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin.Employee;
import Model.Admin.EmployeeType;
import Model.Admin.Establishment;
import Model.Admin.FurnitureStore;
import Model.Admin.WorkShop;
import Model.Client.Order;
import Model.Products.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bryan Hernandez
 */
public class AdminController {
    
    private ArrayList<FurnitureStore> furnitureStores;
    private ArrayList<WorkShop> workshops;
    private ArrayList<Employee> employees;
    private ArrayList<EmployeeType> employeeTypes;
    
    private Employee currentManager; 

    public AdminController() {
        furnitureStores = new ArrayList();
        workshops = new ArrayList();
        employees = new ArrayList();
        employeeTypes = new ArrayList();
    }

    public FurnitureStore addFurnitureStore(FurnitureStore furnitureStore){
        furnitureStores.add(furnitureStore);
        return furnitureStore;
    }
    
    public void addWorkshops(WorkShop e){
        workshops.add(e);
    }
    
    public EmployeeType addEmployeeType(EmployeeType e){
        employeeTypes.add(e);
        return e;
    }
    
    public Employee addEmployee(Employee empl){
        employees.add(empl);
        return empl;
    }
    
    public Employee addEmployee(Employee empl, FurnitureStore store){
        empl.setStore(store);
        employees.add(empl);
        return empl;
    }
    
   /* public Employee addEmployee(Employee empl, WorkShop store){
        empl.setWorkshop(store);
        employees.add(empl);
        return empl;
    }*/
    
    public String reportingSalesFurniture(Employee e){
        int total = 0;
        String text = "";
        for(Order o: MainController.getInstance().getClientController().getOrders()){
            if(o.getShop().equals(e.getStore())){
                text += ("Nombre Cliente: "+o.getClient().getName()+ "\n");
                text += ("Costo: "+o.getCost()+ "\n");
                total = total + o.getCost();
                text += ("Fecha: "+o.getDate().toString()+ "\n");
                for(Product p:o.getProducts()){
                    text += ("Nombre: "+p.getName());
                    text += (" Costo: "+p.getCost()+ "\n");
                }
            }
        }
        text += ("Total: "+total+"\n");
        return text;
    }
    
    
    public String reportingSalesGeneral(){
        int total = 0;
        String text = "";
        for(Order o: MainController.getInstance().getClientController().getOrders()){
            text += ("Nombre Cliente: "+o.getClient().getName()+ "\n");
            text += ("Costo: "+o.getCost()+ "\n");
            total = total + o.getCost();
            text += ("Fecha: "+o.getDate().toString()+ "\n");
            for(Product p:o.getProducts()){
                text += ("Nombre: "+p.getName());
                text += (" Costo: "+p.getCost()+ "\n");
            }
            
        }
        text += ("Total: "+total+"\n");
        return text;
    }
    
    public String profit(FurnitureStore fstore, Date dateI, Date dateF, Product product,int expenses){
        int total = 0;
        String text = "";
        for(Order o: MainController.getInstance().getClientController().getOrders()){
            if(fstore == null){
                if(dateI == null && dateF==null){
                    if(product==null){
                        total=total+o.getCost();
                    }
                    else{
                        for(Product p:o.getProducts()){
                            if(p.equals(product)){
                                total=total+p.getCost();
                            }
                        }
                    }
                }
                else{
                    if(dateI.before(o.getDate()) && dateF.after(o.getDate())){
                        if(product==null){
                            total=total+o.getCost();
                        }
                        else{
                            for(Product p:o.getProducts()){
                                if(p.equals(product)){
                                    total=total+p.getCost();
                                }
                            }
                        }
                    }
                }
            }
            else{
                if(o.getShop().equals(fstore)){
                    if(dateI == null && dateF==null){
                        if(product==null){
                            total=total+o.getCost();
                        }
                        else{
                            for(Product p:o.getProducts()){
                                if(p.equals(product)){
                                    total=total+p.getCost();
                                }
                            }
                        }
                    }
                    else{
                        if(dateI.before(o.getDate()) && dateF.after(o.getDate())){
                            if(product==null){
                                total=total+o.getCost();
                            }
                            else{
                                for(Product p:o.getProducts()){
                                    if(p.equals(product)){
                                        total=total+p.getCost();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        text += ("Ventas: "+total+"\n");
        text += ("Gastos: "+expenses+"\n");
        total=total-expenses;
        text += ("Total: "+total+"\n");
        return text;
    }

    public ArrayList<FurnitureStore> getFurnitureStores() {
        return furnitureStores;
    }

    public ArrayList<WorkShop> getWorkshops() {
        return workshops;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<EmployeeType> getEmployeeTypes() {
        return employeeTypes;
    }

    public Employee loginManager(String pUsername, char[] pPassword) {
        Employee empl = getEmployee(pUsername);
        if(empl!=null){
            //if(empl.getPassword().equals(pPassword)){
                return empl;
            //}
        }
        return null;
    }
    
    public Employee getEmployee(String pUsername){
        for(Employee emp: employees){
            if(emp.getPersonalData().getEmail().equals(pUsername)){
                return emp;
            }
        }
        return null;
    }
    
    public EmployeeType getEmployeeType(String name){
        for(EmployeeType emp: employeeTypes){
            if(emp.toString().equals(name)){
                return emp;
            }
        }
        return null;
    }

    public Employee getCurrentManager() {
        return currentManager;
    }

    public void setCurrentManager(Employee currentManager) {
        this.currentManager = currentManager;
    }
    
    
    
}
