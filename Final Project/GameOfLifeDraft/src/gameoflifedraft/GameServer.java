/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflifedraft;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Lai
 */
public class GameServer extends JFrame {

    private static final String SERVER_IP = "10.10.13.157";
    private static final int SERVER_PORT = 10007;

    int cellSize = 15;

    static boolean[][] cells = new boolean[400][400];
    MyDrawPanel drawpanel = new MyDrawPanel();
    JPanel mainPanel = new JPanel();
    JPanel sidePanel = new JPanel();
    JButton cycle = new JButton("Next Cycle");
    JButton randomize = new JButton("Randomize");
    JButton clear = new JButton("Clear");
    JButton move = new JButton("Move");
    JButton addGun = new JButton("Gosper Gun");
    JButton ChangeSize = new JButton("Change Size");
    JButton save = new JButton("Save");
    JButton load = new JButton("load");
    JButton randomC = new JButton("Random Color");
    JLabel numCycle = new JLabel("cycles");
    JLabel inSec = new JLabel("frames per second");
    JLabel percent = new JLabel("% chance alive");
    JTextField chancefield = new JTextField("25", 2);
    JTextField field = new JTextField("10", 4);
    JTextField speedField = new JTextField("15", 3);
    JTextField sizeField = new JTextField("15", 3);
    Color cellsColor = new Color(0,255,0);
    int neightbours[][] = new int[cells.length][cells.length];
    Timer timer;
    int loops = 0;
    int cycles = 0;

    public static void main(String[] args) {

        GameServer g1 = new GameServer();
        g1.serverConnect();
    }

    public synchronized void clientConnect() {
        Socket sock = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            sock = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("connected");
            ois = new ObjectInputStream(sock.getInputStream());
            oos = new ObjectOutputStream(sock.getOutputStream());
            System.out.println("Stream accepted");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        while (true) {
            try {
                Thread.sleep(200);
                cells = (boolean[][]) ois.readObject();
                repaint();
                Thread.sleep(200);
                oos.writeObject(cells);
                oos.flush();

            } catch (Exception ex) {
                System.out.println("error");
            }

        }
    }

    public void serverConnect() {
        ServerSocket serverSock = null;
        Socket sock = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            serverSock = new ServerSocket(SERVER_PORT);
            sock = serverSock.accept();
            System.out.println("connection received");
            oos = new ObjectOutputStream(sock.getOutputStream());
            ois = new ObjectInputStream(sock.getInputStream());
            System.out.println("Stream accepted");

        } catch (Exception e) {
        }

        while (true) {
            try {
                Thread.sleep(200);
                oos.writeObject(cells);
                oos.flush();
                Thread.sleep(200);
                cells = (boolean[][]) ois.readObject();
                this.repaint();

            } catch (Exception ex) {
                System.out.println("error");
            }
        }
    }

    public GameServer() {
        this.setSize(1600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(BorderLayout.CENTER, drawpanel);
        this.getContentPane().add(BorderLayout.SOUTH, mainPanel);
        this.getContentPane().add(BorderLayout.EAST, sidePanel);

        mainPanel.add(cycle);
        mainPanel.add(randomize);
        mainPanel.add(chancefield);
        mainPanel.add(percent);
        mainPanel.add(clear);
        mainPanel.add(move);
        mainPanel.add(field);
        mainPanel.add(numCycle);
        mainPanel.add(speedField);
        mainPanel.add(inSec);
        mainPanel.add(addGun);
        mainPanel.add(ChangeSize);
        mainPanel.add(sizeField);
        mainPanel.add(randomC);
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.add(Box.createRigidArea(new Dimension(10,20)));
        sidePanel.add(save);
        sidePanel.add(Box.createRigidArea(new Dimension(10,20)));
        sidePanel.add(load);
        drawpanel.addMouseListener(new MyMouseListener());
        cycle.addActionListener(new CycleActionListener());
        randomize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomCycle();
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public synchronized void actionPerformed(ActionEvent e) {
                emptyCycle();
            }
        });
        move.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    loops = 0;
                    cycles = Integer.parseInt(field.getText());
                    timer = new Timer((1000 / Integer.parseInt(speedField.getText())), new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            nextCycle();
                            loops++;
                            if (loops == cycles) {
                                timer.stop();
                            }
                        }
                    });
                    timer.setInitialDelay(0);
                    timer.start();
                } catch (Exception ee) {
                }
            }
        });
        addGun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addGosperGun();
            }

        });
        ChangeSize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    cellSize = Integer.parseInt(sizeField.getText());
                    repaint();
                } catch (Exception ee) {
                }
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileOutputStream fos = new FileOutputStream("GameOfLifeSave.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(cells);
                    System.out.println("twest");

                    oos.close();
                    fos.close();
                } catch (IOException ee) {
                }
            }
        });
        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
            FileInputStream fis =  new FileInputStream("GameOfLifeSave.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            cells = (boolean[][]) ois.readObject();
            repaint();
            
        } catch (Exception ee){       }
            }
        });
        randomC.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int red = (int)(Math.random() * 256);
                int green = (int)(Math.random() * 256);
                int blue = (int)(Math.random() * 256);
                cellsColor = new Color(red, green, blue);
                repaint();
            }            
        });
        emptyCycle();
        this.setVisible(true);


    }

    private class MyMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            Point point = e.getPoint();
            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells[i].length; j++) {
                    if (point.x > j * cellSize && point.x < (j + 1) * cellSize && point.y > i * cellSize && point.y + 1 < (i + 1) * cellSize) {
                        if (cells[i][j] == true) {
                            cells[i][j] = false;
                        } else if (cells[i][j] == false) {
                            cells[i][j] = true;
                        }
                    }
                }
            }
            repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    private class CycleActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nextCycle();
        }
    }

    public class MyDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            g.setColor(Color.black);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(cellsColor);
            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells[i].length; j++) {
                    if (cells[i][j] == true) {
                        g.fillOval(j * cellSize, i * cellSize, cellSize, cellSize);
                    }
                }
            }
        }
    }

    public void randomCycle() {
        try {
            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells[i].length; j++) {
                    int random = (int) (Math.random() * 100 / Integer.parseInt(chancefield.getText()));
                    if (random < 1) {
                        cells[i][j] = true;
                    } else {
                        cells[i][j] = false;
                    }
                }
            }
        } catch (Exception ee) {
        }
        repaint();
    }

    public void emptyCycle() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = false;
            }
        }
        repaint();
    }

    public void nextCycle() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                neightbours[i][j] = 0;
            }
        }

        //cells top left corner
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

        //center
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

        //neighbours check
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == true) {
                    if (neightbours[i][j] < 2) {
                        cells[i][j] = false;
                    }
                    if (neightbours[i][j] == 3 || neightbours[i][j] == 2) {
                        cells[i][j] = true;
                    }
                    if (neightbours[i][j] > 3) {
                        cells[i][j] = false;
                    }
                } else if (cells[i][j] == false) {
                    if (neightbours[i][j] == 3) {
                        cells[i][j] = true;
                    } else {
                        cells[i][j] = false;
                    }
                }
            }
        }
        repaint();
    }

    public void addGosperGun() {
        emptyCycle();
        cells[8][2] = true;
        cells[6][14] = true;
        cells[10][18] = true;
        cells[8][3] = true;
        cells[6][15] = true;
        cells[9][19] = true;
        cells[9][2] = true;
        cells[12][14] = true;
        cells[6][22] = true;
        cells[9][3] = true;
        cells[12][15] = true;
        cells[7][22] = true;
        cells[8][12] = true;
        cells[9][16] = true;
        cells[8][22] = true;
        cells[9][12] = true;
        cells[7][17] = true;
        cells[6][23] = true;
        cells[10][12] = true;
        cells[11][17] = true;
        cells[7][23] = true;
        cells[7][13] = true;
        cells[8][18] = true;
        cells[8][23] = true;
        cells[11][13] = true;
        cells[9][18] = true;
        cells[5][24] = true;
        cells[9][24] = true;
        cells[5][26] = true;
        cells[9][26] = true;
        cells[4][26] = true;
        cells[10][26] = true;
        cells[6][36] = true;
        cells[7][36] = true;
        cells[6][37] = true;
        cells[7][37] = true;
        repaint();
    }
}
