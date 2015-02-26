/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Lai
 */
public class BetterCarTestDrive {
    public static void main(String[] args){
        BetterCar c1 = new BetterCar();
        c1.setX(4);
        c1.setY(8);
        
        BetterCar c2 = new BetterCar();
        c2.setX(40);
        c2.setY(50);
        
        System.out.println("Car 1 is at " + c1.returnLocation());
        System.out.println("Car 2 is at " + c2.returnLocation());
        
        c1.moveRight(3);
        c1.moveUp(5);
        
        c2.moveLeft(20);
        c2.moveDown(10);
        
        System.out.println("Car 1 move to " + c1.returnLocation());
        System.out.println("Car 2 move to " + c2.returnLocation());
    }   
    
}
