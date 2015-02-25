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
public class HamsterTestDrive {
    public static void main(String[] args){
        Hamster[] Hamsters = new Hamster[100];
        
        for(int i = 0; i < 100; i++){
            Hamsters[i] = new Hamster();
            Hamsters[i].setAge((Math.random()*3));            
        }
        
        double totalAge = 0;
        double averageAge = 0;
        for(int i = 0; i < 100; i++){
            totalAge = totalAge + Hamsters[i].getAge();
        }
        
        averageAge = totalAge / 100;
        
        System.out.println("The total age for all 100 hamsters is " + totalAge);
        System.out.println("The average age for all 100 hamsters is " + averageAge);
        
    }
}
