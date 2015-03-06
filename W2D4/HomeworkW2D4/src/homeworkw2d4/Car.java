/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d4;

/**
 *
 * @author Lai
 */
public class Car extends Automobile{
    private boolean convertable;
    private int trunkCapacity;

    public Car(String make, String model, int trunkCapacity) {
        super(make, model);
        this.trunkCapacity = trunkCapacity;
    }
    
    
    
    public Car(String make, String model, int year, String color, boolean convertable, int trunkCapacity) {
        super(make, model, year, color);
        this.convertable = convertable;
        this.trunkCapacity = trunkCapacity;
    }

    public Car(String make, String model, int year, String color, int trunkCapacity) {
        super(make, model, year, color);
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " Car{" + "convertable=" + convertable + ", trunkCapacity=" + trunkCapacity + '}';
    }
    
    
    
    @Override
    public void accelerate(){
        setSpeed(getSpeed() + 12);
    }
    
    public boolean isConvertable() {
        return convertable;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
    
    
}
