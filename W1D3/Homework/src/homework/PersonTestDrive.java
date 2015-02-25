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
public class PersonTestDrive {
    public static void main(String[] args){
        Person[] people = new Person[5];
        people[0] = new Person();
        
        people[0].setFirstName("John");
        people[0].setLastName("Doe");
        
        for(int i = 1; i < 5; i++){
            people[i] = people[0];
        }
        
        people[0].setFirstName("John");
        people[0].setLastName("Smith");
        
        for(int i = 0; i < 5; i++){
            System.out.println("Number " + (i+1) + " person name is " + people[i].getFirstName() + " " + people[i].getLastName());
        }
    }
}
