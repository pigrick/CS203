/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw1d6;

/**
 *
 * @author Lai
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationcells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        
    }
}
