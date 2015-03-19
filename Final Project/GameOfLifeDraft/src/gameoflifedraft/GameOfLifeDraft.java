/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflifedraft;
import java.util.Scanner;
/**
 *
 * @author Lai
 */
public class GameOfLifeDraft {

    public static void main(String[] args) {

        boolean[][] cells = new boolean[10][10];
        Scanner enter = new Scanner(System.in);
        
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                int random = (int) (Math.random() * 4);
                if (random < 1) {
                    cells[i][j] = true;
                } else {
                    cells[i][j] = false;
                }

            }
        }
        System.out.println(" |A|B|C|D|E|F|G|H|I|J|");
        for (int i = 0; i < cells.length; i++) {
           
            System.out.print((i) + "|");
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == true) {
                    System.out.print("O|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        
        System.out.println("Enter to start the game of life!");
        enter.nextLine();

        int neightbours[][] = new int[10][10];
        while (true) {

            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells[i].length; j++) {
                    neightbours[i][j] = 0;
                }
            }

            //cells[0][0]
            if (cells[0][1] == true) {
                neightbours[0][0] += 1;
            }
            if (cells[1][0] == true) {
                neightbours[0][0] += 1;
            }
            if (cells[1][1] == true) {
                neightbours[0][0] += 1;
            }

            //cells top right corner
            if (cells[0][cells[0].length - 2] == true) {
                neightbours[0][cells[0].length - 1] += 1;
            }
            if (cells[1][cells[1].length - 2] == true) {
                neightbours[0][cells[0].length - 1] += 1;
            }
            if (cells[1][cells[1].length - 1] == true) {
                neightbours[0][cells[0].length - 1] += 1;
            }

            //cells bottom left corner
            if (cells[cells.length - 2][0] == true) {
                neightbours[cells.length - 1][0] += 1;
            }
            if (cells[cells.length - 2][1] == true) {
                neightbours[cells.length - 1][0] += 1;
            }
            if (cells[cells.length - 1][1] == true) {
                neightbours[cells.length - 1][0] += 1;
            }

            //cells bottom right corner
            if (cells[cells.length - 2][cells.length - 2] == true) {
                neightbours[cells.length - 1][cells.length - 1] += 1;
            }
            if (cells[cells.length - 2][cells.length - 1] == true) {
                neightbours[cells.length - 1][cells.length - 1] += 1;
            }
            if (cells[cells.length - 1][cells.length - 2] == true) {
                neightbours[cells.length - 1][cells.length - 1] += 1;
            }

            //cells top
            for (int i = 1; i < cells[0].length - 1; i++) {

                //left
                if (cells[0][i - 1] == true) {
                    neightbours[0][i] += 1;
                }
                //right
                if (cells[0][i + 1] == true) {
                    neightbours[0][i] += 1;
                }
                //bottom left corner
                if (cells[1][i - 1] == true) {
                    neightbours[0][i] += 1;
                }
                //bottom 
                if (cells[1][i] == true) {
                    neightbours[0][i] += 1;
                }
                //bottom right corner
                if (cells[1][i + 1] == true) {
                    neightbours[0][i] += 1;
                }
            }

            //cells left
            for (int i = 1; i < cells.length - 2; i++) {
                //top
                if (cells[i - 1][0] == true) {
                    neightbours[i][0] += 1;
                }
                //top right
                if (cells[i - 1][1] == true) {
                    neightbours[i][0] += 1;
                }
                //right
                if (cells[i][1] == true) {
                    neightbours[i][0] += 1;
                }
                //bottom 
                if (cells[i + 1][0] == true) {
                    neightbours[i][0] += 1;
                }
                //bottom right corner
                if (cells[i + 1][1] == true) {
                    neightbours[i][0] += 1;
                }
            }

            //cells right
            for (int i = 1; i < cells.length - 2; i++) {
                //top
                if (cells[i - 1][cells.length - 1] == true) {
                    neightbours[i][cells.length - 1] += 1;
                }
                //top left
                if (cells[i - 1][cells.length - 2] == true) {
                    neightbours[i][cells.length - 1] += 1;
                }
                //left
                if (cells[i][cells.length - 2] == true) {
                    neightbours[i][cells.length - 1] += 1;
                }
                //bottom left
                if (cells[i + 1][cells.length - 2] == true) {
                    neightbours[i][cells.length - 1] += 1;
                }
                //bottom
                if (cells[i + 1][cells.length - 1] == true) {
                    neightbours[i][cells.length - 1] += 1;
                }
            }

            //cells bottom
            for (int i = 1; i < cells[cells.length - 2].length - 1; i++) {
                //left
                if (cells[cells.length - 1][i - 1] == true) {
                    neightbours[cells.length - 1][i] += 1;
                }
                //top left
                if (cells[cells.length - 2][i - 1] == true) {
                    neightbours[cells.length - 1][i] += 1;
                }
                //top
                if (cells[cells.length - 2][i] == true) {
                    neightbours[cells.length - 1][i] += 1;
                }
                //top right
                if (cells[cells.length - 2][i + 1] == true) {
                    neightbours[cells.length - 1][i] += 1;
                }
                //right
                if (cells[cells.length - 1][i + 1] == true) {
                    neightbours[cells.length - 1][i] += 1;
                }
            }

            for (int i = 1; i < (cells.length - 2); i++) {
                for (int j = 1; j < (cells[i].length - 2); j++) {
                    //top left corner
                    if (cells[i - 1][j - 1] == true) {
                        neightbours[i][j] += 1;
                    }
                    //top
                    if (cells[i - 1][j] == true) {
                        neightbours[i][j] += 1;
                    }
                    //top right
                    if (cells[i - 1][j + 1] == true) {
                        neightbours[i][j] += 1;
                    }
                    //left
                    if (cells[i][j - 1] == true) {
                        neightbours[i][j] += 1;
                    }
                    //right
                    if (cells[i][j + 1] == true) {
                        neightbours[i][j] += 1;
                    }
                    //bottom left corner
                    if (cells[i + 1][j - 1] == true) {
                        neightbours[i][j] += 1;
                    }
                    //bottom 
                    if (cells[i + 1][j] == true) {
                        neightbours[i][j] += 1;
                    }
                    //bottom right corner
                    if (cells[i + 1][j + 1] == true) {
                        neightbours[i][j] += 1;
                    }

                }
            }

            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells[i].length; j++) {
                    if (cells[i][j] == true) {
                        if (neightbours[i][j] < 2) {
                            cells[i][j] = false;
                        } else if (neightbours[i][j] <= 3) {
                            cells[i][j] = true;
                        } else if (neightbours[i][j] > 3) {
                            cells[i][j] = false;
                        }
                    } else if(cells[i][j] == false) {
                        if (neightbours[i][j] == 3) {
                            cells[i][j] = true;
                        } else {
                            cells[i][j] = false;
                        }
                    }
                }
            }
            System.out.println(" |A|B|C|D|E|F|G|H|I|J|");
            for (int i = 0; i < cells.length; i++) {
                System.out.print((i) + "|");
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == true) {
                    System.out.print("O|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
            }
            System.out.println("-------------------------");
            System.out.println("Enter to proceed to next level! or type no to end!");
            String no = enter.nextLine();
            if(no.equals("no")){
                return;
            }
        }
    }

}
