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
public class Truck extends Automobile{
    private int carryingCapacity;
    private boolean hasTailGate;

    public Truck(String make, String model, int carryingCapacity) {
        super(make, model);
        this.carryingCapacity = carryingCapacity;
    }
    
    public Truck(String make, String model, int year, String color, int carryingCapacity) {
        super(make, model, year, color);
        this.carryingCapacity = carryingCapacity;
    }
    
    public Truck(String make, String model, int year, String color, int carryingCapacity, boolean hasTailGate) {
        super(make, model, year, color);
        this.carryingCapacity = carryingCapacity;
        this.hasTailGate = hasTailGate;
    }

    @Override
    public String toString() {
        return super.toString() + " Truck{" + "carryingCapacity=" + carryingCapacity + ", hasTailGate=" + hasTailGate + '}';
    }
    
    
    @Override
    public void accelerate(){
        setSpeed(getSpeed() + 7);
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public boolean isHasTailGate() {
        return hasTailGate;
    }

    public void setHasTailGate(boolean hasTailGate) {
        this.hasTailGate = hasTailGate;
    }
    
    
}
