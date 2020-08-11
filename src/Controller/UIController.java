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
    private ManagerLogin managerLogin;
    private ManagerMenu managerMenu;
    private ManagerProduct managerProduct;
    
    private  JDialog dialog;
    private ArrayList<Object> parameters;
    

    public UIController() {
        parameters = new ArrayList();

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
        System.out.println("Mostrando JDialog");
    }
    
    public void addParameters(Object obj){
        parameters.add(obj);
        System.out.println("Parametro Agregado");
    }
    
    public Client login(String pUsername, char[] pPassword){
        return MainController.getInstance().getClientController().login(pUsername, pPassword);
    }
    
    public Employee loginManager(String pUsername, char[] pPassword){
        //return MainController.getInstance().getClientController().login(pUsername, pPassword);
        return null;
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
        else if(c.equals(ManagerEmployees.class)){
            this.managerProduct = new ManagerProduct(this);
            managerProduct.setVisible(true);
        }
        else if(c.equals(ManagerRegisterEmployee.class)){
            this.managerProduct = new ManagerProduct(this);
            managerProduct.setVisible(true);
        }
        else if(c.equals(ManagerStatistics.class)){
            this.managerProduct = new ManagerProduct(this);
            managerProduct.setVisible(true);
        }
        parameters.clear();
        System.out.println("Mostrando ventana " + c.toString());
    }

    public ArrayList<Object> getParameters() {
        return parameters;
    }
    
    
    
}
