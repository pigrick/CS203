/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d2;

import java.util.ArrayList;
/**
 *
 * @author Lai
 */
public class AutomobileTestDrive {
    public static void main(String[] args){
        ArrayList<Automobile> automobiles = new ArrayList<Automobile>();
        Truck t1 = new Truck();
        Truck t2 = new Truck();
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        automobiles.add(t1);
        automobiles.add(t2);
        automobiles.add(c1);
        automobiles.add(c2);
        automobiles.add(c3);
        
        for(Automobile auto : automobiles){
            auto.accelerate();
            auto.accelerate();
            auto.accelerate();
            auto.brake();
            System.out.println(auto.getSpeed());
        }
    }
}
