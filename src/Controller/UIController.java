/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Client.Client;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import View.*;
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
    
    private ClientController clientController;

    public UIController(ClientController pClientController) {
        this.clientController = pClientController;
    }
    
    public void showDialog(String title, String text, JFrame frame){
        System.out.println("Hiiiiiiiii");
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
        return this.clientController.login(pUsername, pPassword);
    }

    public void setCurrentClient(Client client) {
        this.clientController.setCurrentClient(client);
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
        
    }
    
}
