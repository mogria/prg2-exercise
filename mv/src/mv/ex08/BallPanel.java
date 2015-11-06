/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex08;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Dethrall
 */
public class BallPanel extends JPanel implements Runnable{
    
    Thread thread;
    List<Ball> balls;
    Ball[] currentBalls;
    
    public BallPanel(){
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }
        
        balls = new ArrayList();
    }
    
    public void addBall(Ball ball){
        balls.add(ball);
    }
    
    public void removeFinishedBalls(){
        try{
            ListIterator i = balls.listIterator();
            while(i.hasNext()){
                Ball ball = (Ball) i.next();
                if(ball.isFinished()){
                    i.remove();
                }
            }
        } catch(ConcurrentModificationException e){
            System.out.println("ConcurrentModificationException catched :)");
        }
        
    }
    
    @Override
    public void run(){
        try {
            while (true) {
                currentBalls = balls.toArray(new Ball[balls.size()]);         
                Thread.sleep(33);
                this.repaint();
                removeFinishedBalls();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(BallPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void paint(Graphics gfx){
        super.paint(gfx);
        for(Ball ball : currentBalls){
            ball.draw(gfx);
        }
    }
}
