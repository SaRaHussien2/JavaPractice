/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javapractice;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SaRa
 */

public class LambApplet extends Applet implements Runnable{ 
Thread th;
Color c;
int red,blue,green;

@Override
    public void init() {
         resize(800,2000);
        th = new Thread(this);
        th.start();
    }
    // TODO overwrite start(), stop() and destroy() methods
 @Override
   public void paint(Graphics g)
{
         //Oval
        g.setColor(c);
        g.fillOval(80, 160, 285, 100);
        g.drawOval(80, 160, 285,100);
        g.setColor(Color.BLACK);
        g.drawOval(81, 161, 286, 101);
        
        
        //left
        g.setColor(c);
        g.fillOval(60, 320, 55, 90);
        g.drawOval(60, 320, 55,90);
        g.setColor(Color.BLACK);
        g.drawOval(60, 320, 55, 90);
        
       //center
        g.setColor(c);
        g.fillOval(170, 300, 100, 180);
        g.drawOval(170, 300, 100,180);
        g.setColor(Color.BLACK);
        g.drawOval(170, 300, 100, 180);
        
        //right
         g.setColor(c);
        g.fillOval(320, 320, 55, 90);
        g.drawOval(320, 320, 55,90);
        g.setColor(Color.BLACK);
        g.drawOval(320, 320, 55, 90);

        //head lines
         g.drawLine(85, 217, 10, 480);
         g.drawLine(365, 225, 450, 530);
  
         ////DrawArc(blackPen, x, y, width, height, startAngle, sweepAngle)
         g.drawArc(10,405,515, 150,-45,-140);
        
         //leg lines
        g.drawLine(200, 550, 190, 650);
        g.drawLine(220, 550, 240, 650);
 
        //base
        g.drawRect(120, 650, 200, 20);
}

    @Override
    public void run() {
        Random random=new Random();
        while(true){
            red=random.nextInt(255);
            blue=random.nextInt(255);
            green=random.nextInt(255);
            c=new Color(red,blue,green);
            repaint();
            try {
                Thread.sleep(1000);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(LambApplet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}