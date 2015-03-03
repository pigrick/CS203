/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.ArrayList;
/**
 *
 * @author Lai
 */
public class AverageArrayList {
    
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            double number = Math.random() * 11;
            nums.add((int) number);
            System.out.print(nums.get(i) + " ");
        }
        
        int total = 0;
        int average = 0;
        for(int i = 0; i < 100; i++){
            total += nums.get(i);
        }
        average = total / nums.size();
        System.out.println();
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        
        
        for(int i = 0; i < 100; i++){
            if(nums.get(i) == average){
                System.out.println("Average number is in Array " + i);
            }
        }
    }
}
