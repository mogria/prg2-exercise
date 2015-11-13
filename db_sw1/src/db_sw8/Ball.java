/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw8;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Diego
 */
public class Ball implements Runnable{
    
    private static final int MAX_RADIUS = 100;
    private static final int MIN_RADIUS = 20;
    private static final int MAX_RGB = 255;
    private static final int MIN_SPEED = 20; //in ms
    private static final int COLOR_CHANGE = 40;
    
    Thread thread;
    
    private int radius;
    private Color color;
    private int xPos;
    private int yPos;
    private int fallSpeed;
    private int height;
    
    public Ball(int x, int y, int height){
        this.color = new Color((int)(Math.random()*MAX_RGB),
                (int)(Math.random()*MAX_RGB),(int)(Math.random()*MAX_RGB));
        this.radius = (int)(Math.random()*(MAX_RADIUS-MIN_RADIUS))+MIN_RADIUS;
        this.fallSpeed = (int) (Math.random() * MIN_SPEED);
        
        this.xPos = x;
        this.yPos = y;
        this.height = height;
        
        if(this.thread == null){
            thread = new Thread(this);
            thread.start();
        }
        
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public void fall(){
        if((yPos + radius) < height){
            yPos ++;
        }
    }
    
    public void draw(Graphics g){
        /**
        g.setColor(Color.WHITE);
        g.fillOval(xPos - radius, (yPos-1) - radius, radius * 2, radius * 2);
        **/
         
        g.setColor(color);
        g.fillOval(xPos - radius, yPos - radius, radius * 2, radius * 2);
    }

    @Override
    public void run() {
        while((yPos + radius) < height){
            fall();
            try{
                Thread.sleep(fallSpeed);
                //System.out.println("Falling with speed: " + fallSpeed);
            }
            catch(InterruptedException ex){

            }
        }
        while(!this.color.equals(color.white)){
            try{
                //System.out.println("Brighter color");
                this.color = this.color.brighter();
                Thread.sleep(COLOR_CHANGE);
            }
            catch(InterruptedException ex){
                
            }
        }
        //System.out.println(this.color + " Ball has finished.");
    }
    
}
