/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Products;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bryan Hernandez
 */
public class Promo extends Combo{
    
    private Date deadline;

    public Promo(Date deadline, ArrayList<Product> products, int cost, String name) {
        super(products, cost, name);
        this.deadline = deadline;
    }
    
    
    
    
}
