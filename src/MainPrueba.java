
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
import Model.Products.Promo;
import View.ClientConfirmCart;
import View.ClientLogin;
import View.ClientPrincipal;
import View.ClientRegister;
import View.ManagerBacklog;
import View.ManagerCreateStore;
import View.ManagerEmployees;
import View.ManagerLogin;
import View.ManagerOffers;
import View.ManagerProduct;
import View.ManagerSalaries;
import View.ManagerStatistics;
import View.ManagerViewOffers;
import java.util.ArrayList;
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
        
        EmployeeType managerType = MainController.getInstance().getAdminController().addEmployeeType(new EmployeeType("Manager Type", 1000.0, 3000.0, 10.0, "Besto Manager")); 
        EmployeeType salesMan = MainController.getInstance().getAdminController().addEmployeeType(new EmployeeType("SalesMan Type", 500.0, 1500.0, 15.0, "Besto Sales Man")); 
        
        Employee manager = MainController.getInstance().getAdminController().addEmployee(new Employee(c,managerType,900000));
        manager.setPassword("admin");
        FurnitureStore fs = MainController.getInstance().getAdminController().addFurnitureStore(new FurnitureStore(l,manager,"fs1"));
        manager.setStore(fs);
        
        Employee manager2 = MainController.getInstance().getAdminController().addEmployee(new Employee(e,managerType,750000));
        manager2.setPassword("admin");
        FurnitureStore fs2 = MainController.getInstance().getAdminController().addFurnitureStore(new FurnitureStore(l,manager2,"fs2"));
        manager2.setStore(fs2);
        
        MainController.getInstance().getAdminController().addEmployee(new Employee(d,salesMan,fs,500000));
        MainController.getInstance().getAdminController().addEmployee(new Employee(e,salesMan,fs,450000));
        
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
        
        Product p1 = new Product(1000,"Mesa de madera");
        Product p2 = new Product(2000,"Silla de Plastico");
        Product p3 = new Product(3000,"Cajones");
        Product p4 = new Product(4000,"Sillon");
        Product p5 = new Product(5000,"Escritorio");
        Product p6 = new Product(6000,"Fregadero");
        
        MainController.getInstance().getProductController().addProduct(p1, 5, null);
        MainController.getInstance().getProductController().addProduct(p2, 5, null);
        MainController.getInstance().getProductController().addProduct(p3, 5, null);
        MainController.getInstance().getProductController().addProduct(p4, 5, null);
        MainController.getInstance().getProductController().addProduct(p5, 5, null);
        MainController.getInstance().getProductController().addProduct(p6, 5, null);
        
        MainController.getInstance().getProductController().addPromo(new Promo(new Date(), null, 60000, "Juego de 4 sillas"));
        MainController.getInstance().getProductController().addPromo(new Promo(new Date(), null, 100000, "Juego de Comedor"));
        
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
        
        
        MainController.getInstance().getUiController().setCurrentClient(cliente);
        MainController.getInstance().getAdminController().setCurrentManager(manager);
        MainController.getInstance().getUiController().showWindow(ClientLogin.class);
    }
    
}
