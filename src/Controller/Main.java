/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin.Country;
import Model.Admin.Employee;
import Model.Admin.FurnitureStore;
import Model.CountryList;
import Model.Location;
import Model.Person;
import View.ManagerProduct;
import java.util.Date;

/**
 *
 * @author Yelson
 */
public class Main {

    public static void main(String[] args) {
        
        MainController controller = MainController.getInstance();
        
        Person a = new Person("Ariel Valverde" ,new Date(),61035439,  new Location(CountryList.Germany,"Stranza","Rohmoser"), "valverde.ariel@gmail.com");
        Person b = new Person("Bryan Hernandez",new Date(), 88888407, new Location(CountryList.CostaRica,"Cartago","Paraiso"), "hernandez.bryan@gmail.com");
        Person c = new Person("Carlos Gomez Manager",new Date(), 89898754, new Location(CountryList.CostaRica,"San Jose","Desampa"), "gomez.carlos@gmail.com");
        Person d = new Person("Daniel Delgado",new Date(), 65659898, new Location(CountryList.CostaRica,"Alajuela","Poas"), "delgado.daniel@gmail.com");
        Person e = new Person("Esteban Arias",new Date(), 86865151, new Location(CountryList.CostaRica,"Puntarenas","Esparza"), "arias.esteban@gmail.com");

        Location l = new Location(CountryList.CostaRica,"San Jose");
        
        controller.getClientController().addNewClient(b, "bryanpassword","bryanhernandez");
        controller.getClientController().addNewClient(a, "arielpassword","arielvalverde");
        
        Employee manager = controller.getAdminController().addEmployee(new Employee(c));
        FurnitureStore fs = controller.getAdminController().addFurnitureStore(new FurnitureStore(l,manager));
        
        controller.getAdminController().addEmployee(new Employee(d,fs));
        controller.getAdminController().addEmployee(new Employee(e,fs));
        
        controller.startClient();
    }
}
