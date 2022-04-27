/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javapractice;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SaRa
 */
public class DateTimeApp extends Applet implements Runnable{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Thread th;
    @Override
        public void init(){
           resize(800,2000);
            th = new Thread(this);
            th.start();
}
        
    @Override
    public void paint(Graphics g){
        Date d = new Date();
        g.drawString(d.toString(), 50, 100);
    }
  

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void run() {
        while(true){
            repaint();
            try {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException ex) {
                Logger.getLogger(DateTimeApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
