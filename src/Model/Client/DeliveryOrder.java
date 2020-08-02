/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Client;

import java.util.Date;

/**
 *
 * @author Bryan Hernandez
 */
public class DeliveryOrder {
    
    private Order order;
    private Date solitudeDate;
    private Evaluation evaluation;

    public DeliveryOrder(Order order) {
        this.order = order;
        this.solitudeDate = new Date();
    }
  
    public void finishDelivery(Evaluation pEvaluation){
        this.evaluation = pEvaluation;
    }
    
}
