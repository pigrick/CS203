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
public class TTTGame {

    String[][] board = new String[3][3];
    Scanner in = new Scanner(System.in);
    Scanner in1 = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    Scanner st = new Scanner(System.in);
    PlayerTTT p1 = new PlayerTTT();
    PlayerTTT p2 = new PlayerTTT();
    String sColumn;
    int column;
    int row;
    boolean check = true;
    String winner;
    int counter = 0;

    public void createBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int t = 0; t < board.length; t++) {
                board[i][t] = "-";
            }
        }
    }

    public void createPlayers() {
        System.out.print("Enter player X name: ");
        p1.setName(in2.nextLine());

        System.out.print("Enter player O name: ");
        p2.setName(in1.nextLine());

    }

    public void checkWinner() {
        for (int i = 0; i < board.length; i++) {
            if (board[0][i].equals("X") == true && board[1][i].equals("X") == true && board[2][i].equals("X") == true) {
                check = false;
                winner = p1.getName();
            } else if (board[0][i].equals("O") == true && board[1][i].equals("O") == true && board[2][i].equals("O") == true) {
                check = false;
                winner = p2.getName();
            }
            if (board[i][0].equals("X") == true && board[i][1].equals("X") == true && board[i][2].equals("X") == true) {
                check = false;
                winner = p1.getName();
            } else if (board[i][0].equals("O") == true && board[i][1].equals("O") == true && board[i][2].equals("O") == true) {
                check = false;
                winner = p2.getName();
            }
        }

        if (board[0][0].equals("X") == true && board[1][1].equals("X") && board[2][2].equals("X")) {
            check = false;
            winner = p1.getName();
        } else if (board[0][0].equals("O") == true && board[1][1].equals("O") && board[2][2].equals("O")) {
            check = false;
            winner = p2.getName();
        } else if (board[2][0].equals("X") == true && board[1][1].equals("X") && board[0][2].equals("X")) {
            check = false;
            winner = p1.getName();
        } else if (board[2][0].equals("O") == true && board[1][1].equals("O") && board[0][2].equals("O")) {
            check = false;
            winner = p2.getName();
        }
    }

    public void startGame() {
        boolean checkWin = true;

        System.out.println("\t\ta\t\tb\t\tc\n"
                + "\n1\t\t" + board[0][0] + "\t|\t" + board[1][0] + "\t|\t" + board[2][0] + "\n"
                + "\t------------------------------------------------\n2\t\t" + board[0][1] + "\t|\t" + board[1][1] + "\t|\t" + board[2][1] + "\n"
                + "\t------------------------------------------------\n3\t\t" + board[0][2] + "\t|\t" + board[1][2] + "\t|\t" + board[2][2] + "");

        check = true;

        while (check == true) {
            row = 0;
            sColumn = null;

            System.out.print(p1.getName() + " type in a column: ");
            sColumn = st.nextLine();

            System.out.print(p1.getName() + " type in a row: ");
            row = in.nextInt();
            row--;

            if (sColumn.equals("a") == true) {
                column = 0;
            } else if (sColumn.equals("b") == true) {
                column = 1;
            } else if (sColumn.equals("c") == true) {
                column = 2;
            }

            while (board[column][row].equals("-") == false) {

                System.out.print(p1.getName() + " type in a column: ");
                sColumn = st.nextLine();

                System.out.print(p1.getName() + " type in a row: ");
                row = in.nextInt();
                row--;
            }

            if (sColumn.equals("a") == true) {
                column = 0;
            } else if (sColumn.equals("b") == true) {
                column = 1;
            } else if (sColumn.equals("c") == true) {
                column = 2;
            }

            board[column][row] = "X";

            System.out.println("\t\ta\t\tb\t\tc\n"
                    + "\n1\t\t" + board[0][0] + "\t|\t" + board[1][0] + "\t|\t" + board[2][0] + "\n"
                    + "\t------------------------------------------------\n2\t\t" + board[0][1] + "\t|\t" + board[1][1] + "\t|\t" + board[2][1] + "\n"
                    + "\t------------------------------------------------\n3\t\t" + board[0][2] + "\t|\t" + board[1][2] + "\t|\t" + board[2][2] + "");

            counter++;

            this.checkWinner();

            if (counter == 9 && check == true) {
                System.out.println("There are no winners!");
                check = false;
                checkWin = false;
            }

            if (check == true) {

                System.out.print(p2.getName() + " type in a column: ");
                sColumn = st.nextLine();

                System.out.print(p2.getName() + " type in a row: ");
                row = in.nextInt();
                row--;

                if (sColumn.equals("a") == true) {
                    column = 0;
                } else if (sColumn.equals("b") == true) {
                    column = 1;
                } else if (sColumn.equals("c") == true) {
                    column = 2;
                }

                while (board[column][row].equals("-") == false) {
                    System.out.print(p2.getName() + " type in a column: ");
                    sColumn = st.nextLine();

                    System.out.print(p2.getName() + " type in a row: ");
                    row = in.nextInt();
                    row--;
                }

                if (sColumn.equals("a") == true) {
                    column = 0;
                } else if (sColumn.equals("b") == true) {
                    column = 1;
                } else if (sColumn.equals("c") == true) {
                    column = 2;
                }

                board[column][row] = "O";

                System.out.println("\t\ta\t\tb\t\tc\n"
                        + "\n1\t\t" + board[0][0] + "\t|\t" + board[1][0] + "\t|\t" + board[2][0] + "\n"
                        + "\t------------------------------------------------\n2\t\t" + board[0][1] + "\t|\t" + board[1][1] + "\t|\t" + board[2][1] + "\n"
                        + "\t------------------------------------------------\n3\t\t" + board[0][2] + "\t|\t" + board[1][2] + "\t|\t" + board[2][2] + "");
                counter++;
                this.checkWinner();
            }
        }

        if (checkWin == true) {
            System.out.println("we have a winner!");
            System.out.println("Congratulation " + winner);
        }

    }

}
