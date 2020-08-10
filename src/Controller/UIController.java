/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin.Employee;
import Model.Client.Client;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import View.*;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Bryan Hernandez
 */
public class UIController {
    
    private ClientLogin clientLogin;
    private ClientRegister clientRegister;
    private ManagerEmployees managerEmployees;
    private ManagerLogin managerLogin;
    private ManagerMenu managerMenu;
    private ManagerProduct managerProduct;
    private ManagerProductInventory managerProductInventory;
    private ManagerRegisterEmployee managerRegisterEmployee;
    private ManagerSalaries managerSalaries;
    private ManagerStatistics managerStatistics;
    private ManagerViewEmployee managerViewEmployee;
    
    private  JDialog dialog;
    

    public UIController() {


    }
    
    public void showDialog(String title, String text, JFrame frame){
        dialog = new JDialog(frame, "\t"); 
        dialog.setTitle(text);
        JPanel panel = new JPanel(); 
        panel.add(new JLabel(text));
        dialog.add(panel);
        dialog.setSize(400, 100);
        dialog.setLocation(400, 250);
        dialog.setVisible(true);
    }
    
    public Client login(String pUsername, char[] pPassword){
        return MainController.getInstance().getClientController().login(pUsername, pPassword);
    }
    
    public Employee loginManager(String pUsername, char[] pPassword){
        return MainController.getInstance().getAdminController().loginManager(pUsername, pPassword);
    }

    public void setCurrentClient(Client client) {
        MainController.getInstance().getClientController().setCurrentClient(client);
    }
    
    
    public void showWindow(Class c){
        System.out.println(c.toString());
        
        if(c.equals(View.ClientLogin.class)){
            this.clientLogin = new ClientLogin(this);
            clientLogin.setVisible(true);
        }
        else if(c.equals(ClientRegister.class)){
            this.clientRegister = new ClientRegister(this);
            clientRegister.setVisible(true);
        }
        else if(c.equals(ManagerEmployees.class)){
            this.managerEmployees = new ManagerEmployees(this);
            managerEmployees.setVisible(true);
        }
        else if(c.equals(ManagerLogin.class)){
            this.managerLogin = new ManagerLogin(this);
            managerLogin.setVisible(true);
        }
        else if(c.equals(ManagerMenu.class)){
            this.managerMenu = new ManagerMenu(this);
            managerMenu.setVisible(true);
        }
        else if(c.equals(ManagerProduct.class)){
            this.managerProduct = new ManagerProduct(this);
            managerProduct.setVisible(true);
        }
        else if(c.equals(ManagerProductInventory.class)){
            this.managerProductInventory = new ManagerProductInventory(this);
            managerProductInventory.setVisible(true);
        }
        else if(c.equals(ManagerProductInventory.class)){
            this.managerProductInventory = new ManagerProductInventory(this);
            managerProductInventory.setVisible(true);
        }
        else if(c.equals(ManagerRegisterEmployee.class)){
            this.managerRegisterEmployee = new ManagerRegisterEmployee(this);
            managerRegisterEmployee.setVisible(true);
        }
        else if(c.equals(ManagerSalaries.class)){
            this.managerSalaries = new ManagerSalaries(this);
            managerSalaries.setVisible(true);
        }
        else if(c.equals(ManagerStatistics.class)){
            this.managerStatistics = new ManagerStatistics(this);
            managerStatistics.setVisible(true);
        }
        else if(c.equals(ManagerViewEmployee.class)){
            this.managerViewEmployee = new ManagerViewEmployee(this);
            managerViewEmployee.setVisible(true);
        }
        
    }
    
}
