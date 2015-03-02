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
public class GuessGame {

    Scanner in = new Scanner(System.in);

    public int askNumOfPlayer() {
        System.out.print("How many players: ");
        return in.nextInt();
    }

    public void startGame(int numOfPlayers) {
        Player[] players = new Player[numOfPlayers];

        for (int i = 0; i < numOfPlayers; i++) {
            players[i] = new Player();
        }

        boolean check = true;
        while (check == true) {
            System.out.println("I'm thinking of a number between 0 and 9...");
            int targetNumber = (int) (Math.random() * 10);
            for (int c = 0; c < numOfPlayers; c++) {
                players[c].guess(c + 1);
            }

            System.out.println("Number to guess is " + targetNumber);

            for (int c = 0; c < numOfPlayers; c++) {
                if (players[c].getNumber() == targetNumber) {
                    players[c].setRightness(true);

                }
            }

            for (int c = 0; c < numOfPlayers; c++) {
                if (players[c].isRightness() == true) {
                    System.out.println("We have a winner!");

                    for (int t = 0; t < numOfPlayers; t++) {
                        System.out.println("Player " + (t + 1) + " got it right? " + players[t].isRightness());
                    }
                    System.out.println("Game is over.");
                    c = numOfPlayers;
                    check = false;
                }
            }

            if (check == true) {
                System.out.println("Players will have to try again.");

            }

        }

    }

}
