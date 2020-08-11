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
public class Evaluation {
    private int service;
    private Date deliverDate;
    private int quality;
    private String comments;
    private boolean signature;

    public Evaluation(int service, int quality, String comments, boolean signature) {
        this.service = service;
        this.quality = quality;
        this.comments = comments;
        this.signature = signature;
        this.deliverDate = new Date();
    }
    
    
    
}
