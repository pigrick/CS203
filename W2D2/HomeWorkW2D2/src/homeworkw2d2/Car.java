/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d2;

/**
 *
 * @author Lai
 */
public class Car extends Automobile{
    private boolean convertable;
    private int trunkCapacity;

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
