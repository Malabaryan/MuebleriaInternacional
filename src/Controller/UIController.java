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
    
    private ClientCalification clientCalification;
    private ClientConfirmCart clientConfirmCart;
    private ClientLogin clientLogin;
    private ClientPay clientPay;
    private ClientPrincipal clientPrincipal;
    private ClientRegister clientRegister;
    private ManagerBacklog managerBacklog;
    private ManagerCreateProduct managerCreateProduct;
    private ManagerCreateStore managerCreateStore;
    private ManagerEditEmployee managerEditEmployee;
    private ManagerEditProduct managerEditProduct;
    private ManagerEmployees managerEmployees;
    private ManagerLogin managerLogin;
    private ManagerMenu managerMenu;
    private ManagerOffers managerOffers;
    private ManagerProduct managerProduct;
    private ManagerProductInventory managerProductInventory;
    private ManagerRegisterEmployee managerRegisterEmployee;
    private ManagerSalaries managerSalaries;
    private ManagerStatistics managerStatistics;
    private ManagerViewOffers managerViewOffers;
    
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
        return MainController.getInstance().getAdminController().loginManager(pUsername,pPassword );
    }

    public void setCurrentClient(Client client) {
        MainController.getInstance().getClientController().setCurrentClient(client);
    }
    
    public Client getCurrentClient() {
        return MainController.getInstance().getClientController().getCurrentClient();
    }
    
    
    public void showWindow(Class c){
        System.out.println(c.toString());
        if(c.equals(View.ClientLogin.class)){
            this.clientLogin = new ClientLogin(this);
            clientLogin.setVisible(true);
        }
        else if(c.equals(ClientCalification.class)){
            this.clientCalification = new ClientCalification(this);
            clientCalification.setVisible(true);
        }
        else if(c.equals(ClientConfirmCart.class)){
            this.clientConfirmCart = new ClientConfirmCart(this);
            clientConfirmCart.setVisible(true);
        }
        else if(c.equals(ClientPrincipal.class)){
            this.clientPrincipal = new ClientPrincipal(this);
            clientPrincipal.setVisible(true);
        }
        else if(c.equals(ClientPay.class)){
            this.clientPay = new ClientPay(this);
            clientPay.setVisible(true);
        }
        else if(c.equals(ClientRegister.class)){
            this.clientRegister = new ClientRegister(this);
            clientRegister.setVisible(true);
        }
        else if(c.equals(ManagerBacklog.class)){
            this.managerBacklog = new ManagerBacklog(this);
            managerBacklog.setVisible(true);
        }
        else if(c.equals(ManagerCreateProduct.class)){
            this.managerCreateProduct = new ManagerCreateProduct(this);
            managerCreateProduct.setVisible(true);
        }
        else if(c.equals(ManagerCreateStore.class)){
            this.managerCreateStore = new ManagerCreateStore(this);
            managerCreateStore.setVisible(true);
        }
        else if(c.equals(ManagerEditEmployee.class)){
            this.managerEditEmployee = new ManagerEditEmployee(this);
            managerEditEmployee.setVisible(true);
        }
        else if(c.equals(ManagerEditProduct.class)){
            this.managerEditProduct = new ManagerEditProduct(this);
            managerEditProduct.setVisible(true);
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
        else if(c.equals(ManagerOffers.class)){
            this.managerOffers = new ManagerOffers(this);
            managerOffers.setVisible(true);
        }
        else if(c.equals(ManagerProduct.class)){
            this.managerProduct = new ManagerProduct(this);
            managerProduct.setVisible(true);
        }
        else if(c.equals(ManagerProductInventory.class)){
            this.managerProductInventory = new ManagerProductInventory(this);
            managerProductInventory.setVisible(true);
        }
        else if(c.equals(ManagerEmployees.class)){
            this.managerProduct = new ManagerProduct(this);
            managerProduct.setVisible(true);
        }
        else if(c.equals(ManagerRegisterEmployee.class)){
            this.managerProduct = new ManagerProduct(this);
            managerProduct.setVisible(true);
        }
        else if(c.equals(ManagerSalaries.class)){
            this.managerSalaries = new ManagerSalaries(this);
            managerSalaries.setVisible(true);
        }
        else if(c.equals(ManagerStatistics.class)){
            this.managerProduct = new ManagerProduct(this);
            managerProduct.setVisible(true);
        }
        else if(c.equals(ManagerViewOffers.class)){
            this.managerViewOffers = new ManagerViewOffers(this);
            managerViewOffers.setVisible(true);
        }
        parameters.clear();
        System.out.println("Mostrando ventana " + c.toString());
    }

    public ArrayList<Object> getParameters() {
        return parameters;
    }
    
    
    
}
