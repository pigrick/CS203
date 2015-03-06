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
public class StaticCarTestDriver {
    
    public static void main(String[] args){
        StaticCar c1 = new StaticCar(5, 10);        
        StaticCar c2 = new StaticCar(20, 40);
                
        StaticCar.moveRight(c1, 5);
        StaticCar.moveUp(c1, 10);
        
        StaticCar.moveLeft(c2, 10);
        StaticCar.moveDown(c2, 10);
        
        System.out.println(StaticCar.returnLocation(c1));
        System.out.println(StaticCar.returnLocation(c2));
        
    }
}
