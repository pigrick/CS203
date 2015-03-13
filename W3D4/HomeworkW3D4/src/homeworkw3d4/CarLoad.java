/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw3d4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Lai
 */
public class CarLoad{

        
    public static void main(String[] args){
             
        try{
            FileInputStream fis =  new FileInputStream("Car.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Car c1 = (Car) ois.readObject();
            Car c2 = (Car) ois.readObject();
            Car c3 = (Car) ois.readObject();
            System.out.println(c1.getX() + " " + c1.getY());
            System.out.println(c2.getX() + " " + c2.getY());
            System.out.println(c3.getX() + " " + c3.getY());
        } catch (Exception e){
            
        }
        
        
    }

    
}
