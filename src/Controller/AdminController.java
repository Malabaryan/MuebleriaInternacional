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
    
    public void reportingSalesFurniture(Employee e){
        int total = 0;
        for(Order o: MainController.getInstance().getClientController().getOrders()){
            if(o.getShop().equals(e.getStore())){
                System.out.print("Esta Perro");
                System.out.print(o.getClient().getName());
                System.out.print(o.getCost());
                total = total + o.getCost();
                System.out.print(o.getDate());
                System.out.print(o.getProducts());
            }
        }
        System.out.print("Total: "+total);
    }
    
    public void reportingSalesGeneral(){
        int total = 0;
        for(Order o: MainController.getInstance().getClientController().getOrders()){
            System.out.print(o.getClient().getName());
            System.out.print(o.getCost());
            total = total + o.getCost();
            System.out.print(o.getDate());
            System.out.print(o.getProducts());
        }
        System.out.print("Total: "+total);
    }
    
    public void profit(FurnitureStore fstore, Date dateI, Date dateF, Product product,int expenses){
        int total = 0;
        for(Order o: MainController.getInstance().getClientController().getOrders()){
            if(fstore.equals(null)){
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
        total=total-expenses;
        System.out.print(total);
    }
    
}
