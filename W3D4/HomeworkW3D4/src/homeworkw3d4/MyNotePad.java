/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkw3d4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Lai
 */
public class MyNotePad extends JFrame{
    
    private JTextArea area = new JTextArea();
    private JPanel panel = new JPanel();
    private JButton bs = new JButton("Save");
    private JButton bl = new JButton("Load");
    
    
    public static void main(String[] args){
        MyNotePad p1 = new MyNotePad("My Notepad");
    }
    
    public MyNotePad(String name){
        super(name);
        
        bs.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Files.write(Paths.get("notepad.txt"), area.getText().getBytes());
                } catch (IOException ie){
                }
            }
            
        });
        
        bl.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String text = new String(Files.readAllBytes(Paths.get("notepad.txt")));
                    area.setText(text);
                } catch (Exception ie){
                    
                }
            }
            
        });
        
   
        panel.add(bs);
        panel.add(bl);
        
        this.getContentPane().add(BorderLayout.NORTH, area);
        this.getContentPane().add(panel);
        area.setPreferredSize(new Dimension(300, 420));
        
        
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    
}
