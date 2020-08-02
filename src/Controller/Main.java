/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin.Country;
import Model.CountryList;
import Model.Location;
import View.ManagerProduct;
import java.util.Date;

/**
 *
 * @author Yelson
 */
public class Main {

    public static void main(String[] args) {
        
        MainController controller = MainController.getInstance();
        controller.startClient();
        
        controller.getClientController().addNewClient("Bryan Hernandez", 
                new Date(), 
                88888407, 
                new Location(CountryList.CostaRica,"Cartago","Paraiso"), 
                "hernandez.bryan.ho@gmail.com", 
                "admin",
                "malabaryan");
    }
}
