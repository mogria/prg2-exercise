/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.balls;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.text.Position;

/**
 *
 * @author mogria
 */
public class Ball extends JPanel {
    
    private static final int GROUND = 400;
    private int x;
    private float y;
    private final int radius;
    private float velocity;
    private Color color;
    boolean onGround;
    boolean finished;
    int opacity;
            
        
    Ball(int x, int y) {
        this.x = x;
        this.y = y;
        this.radius = (int)(Math.random() * 10 + 60);
        this.velocity = (int)(Math.random() * 8 + 2);
        this.setBackground(new Color(0, 0, 0, 0));
        this.color = new Color((int) (Math.random() * 0x00FFFFFF));
        this.onGround = false;
        this.finished = false;
        this.opacity = 255;
                
        setBounds(0, 0, radius, radius);
        setLocation(x, (int)getAndUpdateY(0));
    }
    
    public synchronized float getAndUpdateY(int y) {
        this.y += y;
        return this.y;
    }
    
    public void updateAnimation() {
        if(this.onGround == false) {
            velocity += 0.5;
            getAndUpdateY((int)velocity);
            if(this.y > GROUND - radius * 1.5) {
                this.y = (float) (GROUND - radius * 1.5);
                this.onGround = true;

            }
            
            setLocation(x, (int)getAndUpdateY(0));
            setBounds(x, (int)getAndUpdateY(0), radius, radius);
        } else {
        
            opacity -= 10;
            if(opacity < 0) {
                opacity = 0;
                finished = true;
            }
            this.color = new Color(color.getRed(), color.getGreen(), color.getBlue(), opacity);

        }
    }
    
    @Override
    public void paintComponent(Graphics graphics) {
        
        super.paintComponent(graphics);
        graphics.setColor(color);
        graphics.fillOval(0, 0, radius, radius);
        
    }
    
    public boolean finished() {
        return this.finished;
    }
}
