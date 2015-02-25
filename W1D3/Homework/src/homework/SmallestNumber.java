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
public class SmallestNumber {
    public static void main(String[] args){
        
        double[] nums = new double[100];
        
        for(int i = 0; i < 100; i++){
            nums[i] = Math.random() * 100;            
        }
        
        double smallestNum = nums[0];
        
         for(int i = 1; i < 100; i++){
             if(smallestNum > nums[i]){
                 smallestNum = nums[i];
             }              
        }
        
         System.out.println("The smallest Nnumber is " + smallestNum);
    }
}
