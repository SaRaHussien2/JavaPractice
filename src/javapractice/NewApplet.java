/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javapractice;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author SaRa
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        resize(800,2000);
    }
    @Override
    public void paint (Graphics g)
    {
        
       /*
        //write colored names
        Color c=new Color (255,0,0);
        g.setColor(c);
        g.drawString("Hello Sara",100,100);
        g.setColor(new Color(255,255,30));
        g.drawString("Hello yara",100,150);
        */
        
        // getFontList()is an old method
        // String [] s = Toolkit.getDefaultToolkit().getFontList();
       
        // we use getAvailableFontFamilyNames() to get all available fonts in the environment
        String [] s =   GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        Font f;
        int y=100;
        
        for(String x :s)
        {
            f= new Font(x,Font.BOLD,20);
            g.setFont(f);
            g.setColor(new Color(255,0,0));
            g.drawString("Hello Sara with " + x, 100, y );
            y += 20;
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
