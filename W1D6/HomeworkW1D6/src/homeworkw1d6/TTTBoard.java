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
public class TTTBoard {
            
    
    
    public void makeBoard(){
        String[][] board = new String[3][3];
        for(int i = 0; i < board.length; i++){
            for(int t = 0; t < board.length; t++){
                board[i][t] = "-";
            }
        }
    }

   
    
    
    
    
    
}
