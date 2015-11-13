/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex08;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author Dethrall
 */
public class Balls extends JFrame{
    
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 400;
    
    BallPanel panel;
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Balls().setVisible(true);
            }
        });
    }
    
    public Balls(){
        super("Balls");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        panel = new BallPanel();
        panel.setBackground(Color.WHITE);
        
        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {                
                panel.addBall(new Ball(e.getX(), e.getY(), panel.getHeight(), panel.getWidth()));
            }
        });
        
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {                
                panel.addBall(new Ball(e.getX(), e.getY(), panel.getHeight(), panel.getWidth()));
            }
        });
        
        add(panel);
    }
    
}
