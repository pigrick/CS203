/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeworkW3D3;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lai
 */
public class GuiApplication1 {
    
    private JFrame frame;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panel;
    
    public static void main(String[] args) {
       GuiApplication1 ga = new GuiApplication1();
       ga.go();
    }
    
    public void go(){
        frame = new JFrame("4 Buttons");
        
        button1 = new JButton("A");
        button1.setPreferredSize(new Dimension(150,150));
        button1.addActionListener(new b1Listener());
        button1.setFont(new Font("Arial", 0,80));
        button2 = new JButton("B");
        button2.setPreferredSize(new Dimension(150,150));
        button2.addActionListener(new b2Listener());
        button2.setFont(new Font("Arial", 0,80));
        button3 = new JButton("C");
        button3.setPreferredSize(new Dimension(150,150));
        button3.addActionListener(new b3Listener());
        button3.setFont(new Font("Arial", 0,80));
        button4 = new JButton("D");
        button4.setPreferredSize(new Dimension(150,150));
        button4.addActionListener(new b4Listener());
        button4.setFont(new Font("Arial", 0,80));
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        frame.getContentPane().add(panel);
        
        frame.setSize(330, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    private class b1Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button A pressed");
        }
        
    }
    private class b2Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button B pressed");
        }
        
    }
    private class b3Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button C pressed");
        }
        
    }
    private class b4Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button D pressed");
        }
        
    }
}
