/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflifedraft;



/**
 *
 * @author Lai
 */
public class GameOfLifeGUI{
    private static final String SERVER_IP = "10.10.51.249";
    private static final int SERVER_PORT = 10007;
    

    public static void main(String[] args) {        
        GameServer g = new GameServer();        
        g.clientConnect();       
    }
}

    