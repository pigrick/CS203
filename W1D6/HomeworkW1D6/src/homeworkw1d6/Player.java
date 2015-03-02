/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw1d6;

import java.util.Scanner;

/**
 *
 * @author Lai
 */
public class Player {

    private int number = 0;
    private boolean rightness = false;

    public void guess(int c) {
        Scanner n = new Scanner(System.in);
        System.out.print("Player " + c + " guess a number: ");
        this.number = n.nextInt();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isRightness() {
        return rightness;
    }

    public void setRightness(boolean rightness) {
        this.rightness = rightness;
    }

}
