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
public class SimpleDotComMain {
    public static void main(String[] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() *5);
        
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationcells(locations);
        boolean isAlive = true;
        
        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
