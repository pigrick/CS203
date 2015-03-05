/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw2d3;
import java.util.ArrayList;
/**
 *
 * @author Lai
 */
public class VehicleTestDriver {
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Asset> assets = new ArrayList<>();
        ArrayList<Object> objects = new ArrayList<>();
        
        CorporateCar cc = new CorporateCar();
        cc.speed = 1;
        cc.purchasePrice = 20000;
              
        vehicles.add(cc);
        assets.add(cc);
        objects.add(cc);
       
        vehicles.get(0).accelerate();
        vehicles.get(0).brake();
        System.out.println("Speed is " + vehicles.get(0).getSpeed());
        
        System.out.println("Purchase Price is " + 
                assets.get(0).getPurchasePrice());
        
        System.out.println(objects.get(0).toString());
        
        vehicles.get(0).turn(30);
        vehicles.get(0).move();
        System.out.println(vehicles.get(0).getX() + ", " + vehicles.get(0).getY());
        
    }
}
