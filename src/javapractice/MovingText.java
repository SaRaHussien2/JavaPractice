/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javapractice;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SaRa
 */
public class MovingText extends Applet implements Runnable {
     String text;
     int x, y, flag;
    
     Thread t;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        text = "Hello Java";
        x = 100;
        y = 100;
        flag = 1;
        t= new Thread(this);
        t.start();  
    }
    
    
    // run
  @Override
    public void run()
    {
        while (true) {
         repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MovingText.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
  // drawString
  @Override
    public void paint(Graphics g)
    {
        Dimension size = this.getSize();
        if (x > size.width)
        {
            flag = -1;
            x=0;
        }
        if (x < size.width){
            flag = 1;
            x+= 5;
        }  
        g.drawString(text, x, y);
    }
}
    
    
    