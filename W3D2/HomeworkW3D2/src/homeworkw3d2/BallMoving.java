/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw3d2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lai
 */
public class BallMoving {
    private JFrame frame;
    private int x = 300;
    private int y = 300;
    private boolean up = false;
    private boolean down = false;
    private boolean left = false;
    private boolean right = false;
    
    public static void main(String[] args){
        BallMoving bm = new BallMoving();
        bm.start();
    }
    
    public void start(){
        frame = new JFrame("Moving Ball");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawPanel drawpanel = new DrawPanel();
        frame.addKeyListener(new MyKeyListener());
        frame.getContentPane().add(BorderLayout.CENTER, drawpanel);
        frame.setVisible(true);
        
        while(true){
            if(up){
                y -= 5;
                if (y < 0){
                    y = 0;
                }
            } else if (down && y< drawpanel.getHeight() - 30){
                y += 5;
                
            }
            if(left){
                x -= 5;
                if (x<0){
                    x = 0;
                }
            } else if (right && x< drawpanel.getWidth() - 30){
                x += 5;
               
            }
            
            drawpanel.repaint();
            try{
                Thread.sleep(50);
            } catch (Exception ee){
                
            }
            
                
            
        }
        
        
    }
    
    public class DrawPanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            g.setColor(Color.cyan);
            g.fillRect(0, 0, getWidth(), getHeight());
            
            g.setColor(Color.PINK);
            g.fillOval(x, y, 30, 30);
        }
    }
    
    private class MyKeyListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
             
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_UP) {
                up = true;
            }
            if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                down = true;
            }
            if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                left = true;
            }
            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                right = true;
            }
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_UP) {
                up = false;
            }
            if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                down = false;
            }
            if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                left = false;
            }
            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                right = false;
            }
        }

      
        
    }
    
}
