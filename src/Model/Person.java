/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Bryan Hernandez
 */
public class Person {
    private String name;
    private String lastname;
    private Date birthDate;
    private int tel;
    private Location location;
    private String email;

    public Person(String name, String lastname, Date birthDate, int tel, Location location, String email) {
        this.name = name;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.tel = tel;
        this.location = location;
        this.email = email;
    }
    

    public Person(String fullName, Date birthDate, int tel, Location location, String email) {
        String parts[] = fullName.split(" ",2);
        this.name = parts[0];
        this.lastname = parts[1];
        this.birthDate = birthDate;
        this.tel = tel;
        this.location = location;
        this.email = email;
    }

    public String getFullName() {
        return name + " " + lastname;
    }

    public Location getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
}
