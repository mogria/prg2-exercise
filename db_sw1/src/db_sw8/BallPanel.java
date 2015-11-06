/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw8;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class BallPanel extends JPanel implements Runnable{

    Thread thread;
    List<Ball> balls;
    Ball[] paintBalls;
    Iterator itr;
    Ball currentBall;
    private static final int SLEEP_PAINT = 33;
    
    public BallPanel(){
        if(this.thread == null){
            thread = new Thread(this);
            thread.start();
        }
        balls = new ArrayList();
    }
    
    @Override
    public void run() {
        
        while(true){
            try{
                paintBalls = balls.toArray(new Ball[balls.size()]);
                Thread.sleep(SLEEP_PAINT);
                this.repaint();
                removeBalls();
            }
            catch(InterruptedException e){
                
            }
        }
    }
    
    @Override
    public void paint(Graphics gfx){
        super.paint(gfx);
        for(Ball ball : paintBalls){
                    ball.draw(gfx);
        }
    }
    
    public void addBall(Ball ball){
        balls.add(ball);
    }
    
    public void removeBalls(){
        itr = balls.listIterator();
        
        try{
            while(itr.hasNext()){
                currentBall = (Ball)itr.next();
                if(currentBall.getColor().equals(Color.white)){
                    System.out.println(currentBall + "has been removed.");
                    itr.remove();
                }
            }
        }
        catch(ConcurrentModificationException ex){
            System.out.println("Modification Exception: " + ex);
        }
    }
    
}
