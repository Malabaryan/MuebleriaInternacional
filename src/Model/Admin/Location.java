/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

/**
 *
 * @author ariel
 */
public class Location {
    private Country contry;
    private State state;
    private String adress;

    public Location(Country contry, State state, String adress) {
        this.contry = contry;
        this.state = state;
        this.adress = adress;
    }

    public Country getContry() {
        return contry;
    }

    public void setContry(Country contry) {
        this.contry = contry;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    
}
