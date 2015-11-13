/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw8;

import java.awt.Color;
import static java.awt.MouseInfo.getPointerInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;


/**
 *
 * @author Diego
 */
public class FallingBalls extends JFrame {
    
    private BallPanel backgroundPanel;
    private boolean mouseDown;
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 400;
    private static final int ADD_DELAY = 30;
    
    
    public FallingBalls(){
        super("Falling Balls");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        
        mouseDown = false;
        
        backgroundPanel = new BallPanel();
        backgroundPanel.setBackground(Color.white);
        add(backgroundPanel);
        
        backgroundPanel.addMouseListener(new MouseAdapter() {
            /**@Override
            public void mouseClicked(MouseEvent e) {
                backgroundPanel.addBall(new Ball(backgroundPanel.getHeight()));
                System.out.println("Mouse clicked");
            }**/
            
            
            @Override
            public void mousePressed(MouseEvent e) {
                mouseDown = true;
                addBalls(e);
                //System.out.println("Mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mouseDown = false;
                //System.out.println("Mouse released");
            }      
        });
        
    }
    
    public void addBalls(MouseEvent e){
        new Thread(){
            public void run(){
                while(mouseDown == true){
                    try{
                        int x = (int)(getPointerInfo().getLocation().getX() - getLocationOnScreen().getX());
                        int y = (int)(getPointerInfo().getLocation().getY() - getLocation().getY());
                        backgroundPanel.addBall(new Ball(x, y, backgroundPanel.getHeight()));
                        //System.out.println("New Ball in MousePressed Loop.");
                        Thread.sleep(ADD_DELAY);
                    }
                    catch(InterruptedException ex){}
                }
            }
        }.start();
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FallingBalls().setVisible(true);
            }
        });
    }
    
}
