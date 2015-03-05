/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d3;

/**
 *
 * @author Lai
 */
public class CorporateCar extends Vehicle implements Asset {
    public double purchasePrice;
    public double currentValue;
    private int yearPurchased;
    private String employee;

    public int getYearPurchased() {
        return yearPurchased;
    }

    public void setYearPurchased(int yearPurchased) {
        this.yearPurchased = yearPurchased;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
   
    public void accelerate(){
        this.speed += 5;
        if(this.speed > 65){
            this.speed = 65;
        }
    }
    
    public void brake(){
        this.speed -= 5;
        if(this.speed < 0){
            this.speed = 0;
        }
    }
    
    @Override
    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    
    @Override
    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }
    
    @Override
    public double amoritize(int years) {
        double ap = purchasePrice / years;
        
        if (currentValue < ap){
            int yearsSincePurchase = 2015 - yearPurchased;
            ap = purchasePrice - (purchasePrice / years) * yearsSincePurchase;
            
            if(currentValue < ap){
                double pp2 = currentValue - ap;
                ap = ap + pp2;
            }
        }
       
        return ap;
    }
    
}
