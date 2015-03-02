/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw1d6;
import java.util.Scanner;

public class TTTGameLauncher {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        TTTGame g1 = new TTTGame();

        boolean check = true;

        while (check = true) {
            g1.createPlayers();
            g1.createBoard();
            g1.startGame();
            System.out.print("Again?   y/n :");
            String answer = in.nextLine();
            if (answer.equals("n") == true) {
                check = false;
            }
        }
    }

}
