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
public class GarageTestDriver {
    public static void main(String[] args){
        Garage g1 = new Garage();
        Car c1 = new Car();
        c1.setMake("Honda");
        Truck t1 = new Truck();
        t1.setMake("Toyota");
        Item i1 = new Item();
        i1.setName("Bomb");
        Item i2 = new Item();
        i2.setName("Diffuser Kit");
        Item i3 = new Item();
        i3.setName("Detector");
        
        g1.store(c1);
        System.out.println(g1.retrieve().getMake());
        g1.store(t1);
        System.out.println(g1.retrieve().getMake());
        
        g1.store(i1);
        g1.store(i2);
        g1.store(i3);
        for(int i = 0; i < g1.getItem().size(); i++){
            System.out.println(g1.retrieve(i).getName());
        }
    }
}
