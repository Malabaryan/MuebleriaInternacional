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
    private int esthetic;
    private int completition;
    private boolean signature;

    public Evaluation(int service, int quality, int esthetic, int completition, boolean signature) {
        this.service = service;
        this.quality = quality;
        this.esthetic = esthetic;
        this.completition = completition;
        this.signature = signature;
    }

    
    
    
    
}
