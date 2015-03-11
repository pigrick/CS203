/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw3d2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Lai
 */
public class HelloGoodbye {
    private JFrame frame;
    private JButton bHello;
    private JButton bGoodbye;
    private JLabel label;
    
    public static void main(String[] args){
        HelloGoodbye hg = new HelloGoodbye();
        hg.start();
    }
    
    public void start(){
        frame = new JFrame();
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("nothing yet");
                
        bHello = new JButton("Hello");
        bHello.addActionListener(new HelloListener());
        bGoodbye = new JButton("Goodbye");
        bGoodbye.addActionListener(new GoodbyeListener());
        
        frame.getContentPane().add(BorderLayout.CENTER, label);
        frame.getContentPane().add(BorderLayout.NORTH, bHello);
        frame.getContentPane().add(BorderLayout.SOUTH, bGoodbye);
        frame.setVisible(true);
  
    }

    private class HelloListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Hello");
           
        }

    }

    private class GoodbyeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Goodbye");
        }

    }
}
