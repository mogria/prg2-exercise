/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex08;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dethrall
 */
public class Ball implements Runnable{
    
    private static final int MIN_RADIUS = 10;
    private static final int MAX_RADIUS = 80;
    private static final int MAX_RGB_VALUE = 255;
    private static final int MAX_SPEED = 15;
    private static final int FPS = 33;
    
    private Thread thread;
    
    private Color color;
    private int radius;
    
    private int posX;
    private int posY;
    
    private int speed;
    private boolean finished;
    
    private int canvasHeight;
    
    public Ball(int posX, int posY, int canvasHeight){
        this.color = new Color((int) (Math.random() * MAX_RGB_VALUE),
                (int) (Math.random() * MAX_RGB_VALUE),
                (int) (Math.random() * MAX_RGB_VALUE),
                255);
        
        this.radius = (int)((Math.random() * (MAX_RADIUS - MIN_RADIUS)) + MIN_RADIUS);
               
        this.posX = posX;
        this.posY = posY;
        
        this.speed = (int) ((Math.random() * MAX_SPEED) + 1);
        
        this.canvasHeight = canvasHeight;
        this.finished = false;
        
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }
    }
    
    public void draw(Graphics gfx){
        gfx.setColor(color);
        gfx.fillOval(posX - radius, posY - radius, radius * 2, radius * 2);
    }
    
    public void fall(){
        speed++;
        posY += speed;
    }
    
    public void fade(){
        int alpha = this.color.getAlpha() - 25;
        this.color = new Color(this.color.getRed(),
                this.color.getGreen(),
                this.color.getBlue(),
                alpha < 0 ? 0 : alpha);
    }           
    
    @Override
    public void run(){
        try {
            while ((posY + radius) < canvasHeight) {
                Thread.sleep(FPS);
                fall();
            }
            
            posY = canvasHeight - radius;
            
            while(this.color.getAlpha() > 0){
                Thread.sleep(FPS);
                fade();
            }
            
            finished = true;
        } catch (InterruptedException ex) {
            Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isFinished(){
        return finished;
    }
}
