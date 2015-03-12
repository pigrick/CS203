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
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lai
 */
public class Calculator {
    
    JFrame frame = new JFrame("Calculator");
    JPanel panel0 = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel(); 
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3") ;
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");
    JButton button10 = new JButton("+");
    JButton button11 = new JButton("-");
    JButton button13 = new JButton("*");
    JButton button14 = new JButton("/");
    JButton button15 = new JButton(".");
    JButton button16 = new JButton("=");
    JButton button17 = new JButton("c");
    JTextField field = new JTextField();
    
    double first = 0;
    double second = 0;
    double total = 0;
    int check = 0;
    
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.start();
    }
    
    public void start(){
        
        field.setPreferredSize(new Dimension(160,50));
        field.setHorizontalAlignment(JTextField.RIGHT);
        field.setFont(new Font("Ariel", Font.PLAIN, 30));
        
        panel1.add(field);
        panel1.add(button17);
        panel0.setLayout(new BoxLayout(panel0, BoxLayout.Y_AXIS));
        
        button1.setPreferredSize(new Dimension(50, 50));
        button2.setPreferredSize(new Dimension(50, 50));
        button3.setPreferredSize(new Dimension(50, 50));
        button4.setPreferredSize(new Dimension(50, 50));
        button5.setPreferredSize(new Dimension(50, 50));
        button6.setPreferredSize(new Dimension(50, 50));
        button7.setPreferredSize(new Dimension(50, 50));
        button8.setPreferredSize(new Dimension(50, 50));
        button9.setPreferredSize(new Dimension(50, 50));
        button10.setPreferredSize(new Dimension(50, 50));
        button0.setPreferredSize(new Dimension(50, 50));
        button11.setPreferredSize(new Dimension(50, 50));
        button13.setPreferredSize(new Dimension(50, 50));
        button14.setPreferredSize(new Dimension(50, 50));
        button15.setPreferredSize(new Dimension(50, 50));
        button16.setPreferredSize(new Dimension(50, 50));
        button17.setPreferredSize(new Dimension(50, 40));
        button1.addActionListener(new OneListener());
        button2.addActionListener(new TwoListener());
        button3.addActionListener(new ThreeListener());
        button4.addActionListener(new FourListener());
        button5.addActionListener(new FiveListener());
        button6.addActionListener(new SixListener());
        button7.addActionListener(new SevenListener());
        button8.addActionListener(new EightListener());
        button9.addActionListener(new NineListener());
        button0.addActionListener(new ZeroListener());
        button10.addActionListener(new PListener());
        button11.addActionListener(new MListener());
        button13.addActionListener(new TListener());
        button14.addActionListener(new DListener());
        button15.addActionListener(new DotListener());
        button16.addActionListener(new EListener());
        button17.addActionListener(new CListener());
        
        
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(button9);
        panel2.add(button10);
        panel3.add(button4);
        panel3.add(button5);
        panel3.add(button6);
        panel3.add(button11);
        panel4.add(button1);
        panel4.add(button2);
        panel4.add(button3);
        panel4.add(button13);
        panel5.add(button15);
        panel5.add(button0);
        panel5.add(button16);
        panel5.add(button14);
        
        panel0.add(panel1);
        panel0.add(panel2);
        panel0.add(panel3);
        panel0.add(panel4);
        panel0.add(panel5);
//        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        
        frame.getContentPane().add(panel0);
        
        frame.setSize(260, 330);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    private class ZeroListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "0");
        }
        
    }
    private class OneListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "1");
        }
        
    }
    private class TwoListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "2");
        }
        
    }
    private class ThreeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "3");
        }
        
    }
    private class FourListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "4");
        }
        
    }
    private class FiveListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "5");
        }
        
    }
    private class SixListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "6");
        }
        
    }
    private class SevenListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "7");
        }
        
    }
    private class EightListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "8");
        }
        
    }
    private class NineListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "9");
        }
        
    }
    private class PListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            first = Double.parseDouble(field.getText());
            check = 1;
            field.setText("");
            
        }
        
    }
    private class MListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            first = Double.parseDouble(field.getText());
            check = 2;
            field.setText("");
        }
        
    }
    private class DListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            first = Double.parseDouble(field.getText());
            check = 4;
            field.setText("");
        }
        
    }
    private class TListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            first = Double.parseDouble(field.getText());
            check = 3;
            field.setText("");
        }
        
    }
    private class EListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            second = Double.parseDouble(field.getText());
            if(check == 1){
                total = first + second;
            } else if (check == 2){
                total = first - second;
            } else if (check == 3){
                total = first * second;
            } else if (check == 4){
                total = first / second;
            }
            first = total;
            field.setText(Double.toString(total));
            check = 0;
            
        }
        
    }
    private class DotListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + ".");
        }
        
    }
    private class CListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText("");
        }
        
    }
    
    
    
    
}
