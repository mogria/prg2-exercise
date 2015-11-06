/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW8_Balls;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Adrian
 */
public class BallsFrame extends JFrame {
    
    ArrayList<Ball> balls = new ArrayList<>();
    JFrame that = this;
    

    public BallsFrame() throws HeadlessException {
        this.setSize(600, 400);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Ball b = new Ball(e.getX(),e.getY(),that.getGraphics());
                balls.add(b);
                b.start();
               
                
            }

        });
    }

}
