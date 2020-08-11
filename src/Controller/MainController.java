/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ClientLogin;
import View.ManagerLogin;

/**
 *
 * @author Bryan Hernandez
 */
public class MainController {
    
    private static MainController instance;
    
    private ClientController clientController;
    private ProductController productController;
    private AdminController adminController;
    private UIController uiController;

    private MainController() {
        clientController = new ClientController();
        productController = new ProductController();
        uiController = new UIController();
        adminController = new AdminController();
    }
    
    public static MainController getInstance(){
        if(instance == null){
            instance = new MainController();
        }
        return instance;
    }

    public ClientController getClientController() {
        return clientController;
    }

    public ProductController getProductController() {
        return productController;
    }

    public UIController getUiController() {
        return uiController;
    }

    public AdminController getAdminController() {
        return adminController;
    }
    
    public void startClient(){
        this.uiController.showWindow(ClientLogin.class);
    }
    
    public void starAdmin(){
        this.uiController.showWindow(ManagerLogin.class);
    }
    
    
    
    
    
}
