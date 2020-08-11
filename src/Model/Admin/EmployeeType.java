/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

/**
 *
 * @author Bryan Hernandez
 */
public class EmployeeType {
    
    private String typeName;
    private double minSalary;
    private double maxSalary;
    private double salesPercentage;
    private String description;

    public EmployeeType(String typeName, double minSalary, double maxSalary, double salesPercentage, String description) {
        this.typeName = typeName;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.salesPercentage = salesPercentage;
        this.description = description;
    }
    
    public void setSalary(double pMinSalary, double pMaxSalary){
        minSalary = pMinSalary;
        maxSalary = pMaxSalary;
    }
    
    @Override
    public String toString(){
        return typeName;
    }
    
}
