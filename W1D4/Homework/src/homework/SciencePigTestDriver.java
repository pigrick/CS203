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
public class SciencePigTestDriver {
    public static void main(String[] args){
        Scientist s1 = new Scientist();
        GuineaPig g1 = new GuineaPig();
        g1.setName("Pebbles");
        
        int num = 0;
        
        s1.changeThis(num, g1);
        
        System.out.println(num + ", " + g1.getName());
    }
}
