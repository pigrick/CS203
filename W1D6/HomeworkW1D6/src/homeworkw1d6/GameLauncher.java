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
public class GameLauncher {

    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame(1);
        game.startGame(3);
        game.startGame(game.askNumOfPlayer());
    }
}
