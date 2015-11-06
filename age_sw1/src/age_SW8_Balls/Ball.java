/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW8_Balls;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Adrian
 */
public class Ball implements Runnable {

    private Thread thread;

    private int radius;
    private Color color;
    private int alpha = 255;

    private int x;
    private int y;

    Graphics g;

    public Ball(int radius, Color color) {
        this.radius = radius;
        this.color = color;

    }

    public Ball(int x, int y, Graphics g) {
        this.x = x;
        this.y = y;
        radius = GetRandomInt(20, 50);
        this.color = GetRandomColor();
        this.g = g;
    }

    private int GetRandomInt(int min, int max) {
        int retval;
        Random r1 = new Random();
        retval = r1.nextInt(max - min + 1) + min;
        return retval;
    }

    private Color SetNewAlpha() {
        Color c = new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
        return c;
    }

    private void removeCircle(Graphics g) {
        g.clearRect(x - radius, y - radius, radius * 2, radius * 2);
    }

    public void paintCircle(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    public void paintCircle(Graphics g, int alpha) {
        g.setColor(SetNewAlpha());

        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    private Color GetRandomColor() {
        Random r = new Random();
        return new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
    }

    public Color getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    @Override
    public void run() {
        while (this.y < (400 - (radius + 10))) {
            this.removeCircle(g);
            this.y++;
            this.paintCircle(g);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        while (this.alpha - 10 > 0) {
            this.removeCircle(g);
            this.alpha = alpha - 10;
            this.paintCircle(g, this.alpha);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }

    }
}
