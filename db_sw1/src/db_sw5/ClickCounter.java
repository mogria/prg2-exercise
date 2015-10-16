/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class ClickCounter extends JFrame {
    
    private int countClicks = 0;
    
    public ClickCounter(){
    
        super("ClickCounter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);      
        
        setSize(300,100);
        
        JButton clickButton = new JButton("Click me");
        JLabel label = new JLabel("Number of Clicks: " + countClicks);
        JPanel panelButton = new JPanel();
        JPanel panelLabel = new JPanel();
        
        panelLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        setLayout(new GridLayout(0, 1));
        
        panelButton.add(clickButton);
        panelLabel.add(label);
        add(panelButton);
        add(panelLabel);
        
        //panelLabel.setMaximumSize(new Dimension(300, 100));
        
        clickButton.addActionListener(e -> {
            countClicks ++;
            label.setText("Number of Clicks: " + countClicks);
        });
        
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClickCounter().setVisible(true);
            }
        });
    }
    
}
