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
public class SumOfEven {
    public static void main(String[] args){
        
        int[] num = {3, 8, 4, 10, 14, 5, 21};
        int totalEven = 0;
        
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                totalEven = totalEven + num[i];
            }
        }
        System.out.println("Total of even number is " + totalEven);
    
    }
}
