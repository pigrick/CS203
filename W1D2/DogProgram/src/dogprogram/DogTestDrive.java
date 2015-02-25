/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogprogram;

/**
 *
 * @author Lai
 */
public class DogTestDrive {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.setName("Rocky");
        d1.setSize(40);
        d1.setBreed("Labrador");
        
        System.out.println(d1.getName()+ ", " + d1.getSize() + ", " + d1.getBreed());
        
        d1.bark();
    }
}
