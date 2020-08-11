
import Controller.MainController;
import Model.Admin.Employee;
import Model.Admin.FurnitureStore;
import Model.Client.Client;
import Model.Client.Order;
import Model.Client.ShoppingCart;
import Model.CountryList;
import Model.Location;
import Model.Person;
import Model.Admin.EmployeeType;
import Model.Products.Material;
import Model.Products.Product;
import View.ClientRegister;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ariel
 */
public class MainPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainController.getInstance();
        
        Person a = new Person("Ariel Valverde" ,new Date(),61035439,  new Location(CountryList.Germany.toString(),"Stranza","Rohmoser"), "valverde.ariel@gmail.com");
        Person b = new Person("Bryan Hernandez",new Date(), 88888407, new Location(CountryList.CostaRica.toString(),"Cartago","Paraiso"), "hernandez.bryan@gmail.com");
        Person c = new Person("Carlos Gomez Manager",new Date(), 89898754, new Location(CountryList.CostaRica.toString(),"San Jose","Desampa"), "gomez.carlos@gmail.com");
        Person d = new Person("Daniel Delgado",new Date(), 65659898, new Location(CountryList.CostaRica.toString(),"Alajuela","Poas"), "delgado.daniel@gmail.com");
        Person e = new Person("Esteban Arias",new Date(), 86865151, new Location(CountryList.CostaRica.toString(),"Puntarenas","Esparza"), "arias.esteban@gmail.com");

        Location l = new Location(CountryList.CostaRica.toString(),"San Jose");
        
        MainController.getInstance().getClientController().addNewClient(b, "bryanpassword","bryanhernandez");
        MainController.getInstance().getClientController().addNewClient(a, "arielpassword","arielvalverde");
        
        EmployeeType managerType = new EmployeeType("Manager Type", 1000.0, 3000.0, 10.0, "Besto Manager"); 
        EmployeeType salesMan = new EmployeeType("Sales Man Type", 500.0, 1500.0, 15.0, "Besto Sales Man"); 
        
        Employee manager = MainController.getInstance().getAdminController().addEmployee(new Employee(c,managerType));
        FurnitureStore fs = MainController.getInstance().getAdminController().addFurnitureStore(new FurnitureStore(l,manager));
        manager.setStore(fs);
        
        Employee manager2 = MainController.getInstance().getAdminController().addEmployee(new Employee(e,managerType));
        FurnitureStore fs2 = MainController.getInstance().getAdminController().addFurnitureStore(new FurnitureStore(l,manager2));
        manager2.setStore(fs2);
        
        MainController.getInstance().getAdminController().addEmployee(new Employee(d,salesMan,fs));
        MainController.getInstance().getAdminController().addEmployee(new Employee(e,salesMan,fs));
        
        ShoppingCart s1 = new ShoppingCart();
        ShoppingCart s2 = new ShoppingCart();
        ShoppingCart s3 = new ShoppingCart();
        
        MainController.getInstance().getProductController().addMaterial(new Material("Madera", "Madera", 50));
        MainController.getInstance().getProductController().addMaterial(new Material("Tela", "Tela", 60));
        MainController.getInstance().getProductController().addMaterial(new Material("Cuero", "Cuero", 80));
        MainController.getInstance().getProductController().addMaterial(new Material("Hierro", "Hierro", 100));
        MainController.getInstance().getProductController().addMaterial(new Material("Metal", "Metal", 120));
        MainController.getInstance().getProductController().addMaterial(new Material("Plastico", "Plastico", 30));
        MainController.getInstance().getProductController().addMaterial(new Material("Espuma", "Espuma", 10));
        MainController.getInstance().getProductController().addMaterial(new Material("Algodon", "Algodon", 20));
        
        Product p1 = new Product(1000,"P1");
        Product p2 = new Product(2000,"P2");
        Product p3 = new Product(3000,"P3");
        Product p4 = new Product(4000,"P4");
        Product p5 = new Product(5000,"P5");
        Product p6 = new Product(6000,"P6");
        
        s1.addProduct(p1);
        s1.addProduct(p1);
        s1.addProduct(p2);
        
        s2.addProduct(p6);
        s2.addProduct(p6);
        s2.addProduct(p6);
        
        s3.addProduct(p3);
        s3.addProduct(p4);
        s3.addProduct(p5);
        
        Client cliente = MainController.getInstance().getClientController().getClients().get(0);
        
        MainController.getInstance().getClientController().addNewOrder(s1,manager,cliente, true);
        MainController.getInstance().getClientController().addNewOrder(s2,manager2,cliente, true);
        MainController.getInstance().getClientController().addNewOrder(s3,manager,cliente, true);
        
        System.out.print("Furniture: FS1 \n");
        MainController.getInstance().getAdminController().reportingSalesFurniture(manager);
        System.out.print("-------- \n");
        System.out.print("\n");
        
        System.out.print("Furniture: FS2 \n");
        MainController.getInstance().getAdminController().reportingSalesFurniture(manager2);
        System.out.print("-------- \n");
        System.out.print("\n");
        
        System.out.print("General: \n");
        MainController.getInstance().getAdminController().reportingSalesGeneral();
        System.out.print("-------- \n");
        System.out.print("\n");
        
        System.out.print("Profits: \n");
        MainController.getInstance().getAdminController().profit(fs2, null, null, p3, 1000);
        System.out.print("-------- \n");
        System.out.print("\n");
        
        
        
        MainController.getInstance().getUiController().showWindow(ClientRegister.class);
    }
    
}
