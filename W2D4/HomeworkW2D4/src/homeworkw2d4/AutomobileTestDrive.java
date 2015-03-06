/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d4;

import java.util.ArrayList;
/**
 *
 * @author Lai
 */
public class AutomobileTestDrive {
    public static void main(String[] args){
        ArrayList<Automobile> automobiles = new ArrayList<Automobile>();
        Truck t1 = new Truck("Honda", "S12", 2000, "blue", 8, true);
        Truck t2 = new Truck("Suzuki", "G66", 1999, "green", 5);
        Truck t3 = new Truck("Yamaha", "G44", 5);
        Car c1 = new Car("Ford", "O2", 1990, "purple", false, 5);
        Car c2 = new Car("Nissan", "O2", 1995, "brown", 5);
        Car c3 = new Car("Peugeut", "p32", 6);
    
        automobiles.add(t1);
        automobiles.add(t2);
        automobiles.add(t3);
        automobiles.add(c1);
        automobiles.add(c2);
        automobiles.add(c3);
        
        for(Automobile auto : automobiles){
            
            System.out.println(auto.toString());
        }
    }
}
