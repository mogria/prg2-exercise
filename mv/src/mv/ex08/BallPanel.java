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
    
    private Thread thread;
    private List<Ball> balls;
    
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
    
    public synchronized void removeFinishedBalls(){
        ListIterator i = balls.listIterator();
        while(i.hasNext()){
            Ball ball = (Ball) i.next();
            if(ball.isFinished()){
                i.remove();
            }
        }
    }
    
    @Override
    public void run(){
        while (true) {
            try {
                Thread.sleep(33);
            } catch (InterruptedException ex) {
                Logger.getLogger(BallPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(balls.size() > 0){
                this.repaint();
                removeFinishedBalls();
            }
        }
    }
    
    @Override
    public void paint(Graphics gfx){
        super.paint(gfx);
        for(Ball ball : balls){
            ball.draw(gfx);
        }
    }
}
