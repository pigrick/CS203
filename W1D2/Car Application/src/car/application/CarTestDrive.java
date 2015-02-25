/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.application;

/**
 *
 * @author Lai
 */
public class CarTestDrive {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.setX(5);
        c1.setY(3);
        
        Car c2 = new Car();
        c2.setX(50);
        c2.setY(40);
        
        System.out.println(c1.printLocation());
        System.out.println(c2.printLocation());
        
        c1.moveRight(3);
        c1.moveUp(5);
        
        c2.moveLeft(20);
        c2.moveDown(10);
        
        System.out.println(c1.printLocation());
        System.out.println(c2.printLocation());
    }
}
