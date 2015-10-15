/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex05;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Dethrall
 */
public class uiMenu extends JFrame{
    
    private JLabel display;
    private int count = 0;
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new uiMenu().setVisible(true);
            }
        });
    }
    
    public uiMenu(){
        super("uiMenu Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        setSize(500, 300);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        
        JMenuItem fileNew = new JMenuItem("New");
        JMenuItem fileOpen = new JMenuItem("Open");
        JMenuItem fileExit = new JMenuItem("Exit");
        
        JMenuItem about = new JMenuItem("About");
        
        fileMenu.add(fileNew);
        fileMenu.add(fileOpen);
        fileMenu.addSeparator();
        fileMenu.add(fileExit);
        
        menuBar.add(fileMenu);
        menuBar.add(about);
        
        setJMenuBar(menuBar);
        
        fileExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Zis is ze about message!");
            }
        });
        
        JButton clickCounter = new JButton("Count Button Clicks");
        display = new JLabel("0");
                
        setLayout(new GridLayout(0, 1));
        
        add(clickCounter);
        add(display);
        
        clickCounter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                
                display.setText(String.valueOf(count));
            }
        });
    }    
}
