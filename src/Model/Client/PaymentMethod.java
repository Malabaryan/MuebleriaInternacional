/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Client;

import java.util.ArrayList;

/**
 *
 * @author Bryan Hernandez
 */
public interface PaymentMethod {
    
    
    public boolean pay(float amount, ArrayList<String> arguments);
    
}
