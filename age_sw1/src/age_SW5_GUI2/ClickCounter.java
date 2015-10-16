/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW5_GUI2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author Adrian
 */
public class ClickCounter extends JFrame {
    public static void main(String[] args) {
        ClickCounter cc = new ClickCounter();
        cc.setVisible(true);
    }
    
    JButton btnCount = new JButton("Count Button Click");
    JLabel lbltext = new JLabel();

    public int count = 0;
    
    public ClickCounter() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.setSize(300, 150);
        setLayout(new GridLayout(0, 1));
        
        btnCount.addActionListener((e)->{
            count += 1;
            lbltext.setText("Number of clicks: " + String.valueOf(count));
        });
        btnCount.setSize(100, 50);
        
        this.add(btnCount);
        lbltext.setText("Number of clicks: " + String.valueOf(count));
        add(lbltext);
        
        
    }
    
}
