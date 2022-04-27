package javapractice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
/*
Create an applet that has two buttons one to increment the counter value and one to decrement this value
*/

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SaRa
 */
public class Buttons extends Applet {
     int x;
     Button bt;
     Button bd;

     
     @Override
     public void init(){
        resize(800,2000);
        bt= new Button("Increment");
        bd= new Button("Decrement");
        
        bt.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (x<10)
                    {
                        x++;
                        repaint();
                    }
                    else
                    {
                        x=10;
                        repaint();
                    }
                }
           });
        add(bt);
        
        bd.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                 
                    if (x>0 && x<=10)
                    { 
                        x--;
                        repaint();
                    }
                    else
                    {
                        x=0;
                        repaint();
                    }
                }
             });
        add(bd);
     }
    
    @Override
    public void paint(Graphics g){
       g.drawString("the count = "+x,50,100);
    }
}
