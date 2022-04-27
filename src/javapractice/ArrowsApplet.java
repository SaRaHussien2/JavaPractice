/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javapractice;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;

 
public class ArrowsApplet extends Applet implements KeyListener {
    int x = 200, y = 200;
    
    @Override
    public void init ()
    {
        resize(800,2000);
        addKeyListener (this);
    } 

    @Override
    public void paint (Graphics g)
    {
        g.drawString("Hello Java",x,y);
    } 

    @Override
    public void keyPressed (KeyEvent e)
    {
    if (e.getKeyCode()==e.VK_UP)
    {
        y = y-10;
    }
    if (e.getKeyCode()==e.VK_DOWN)
    {
        y = y+10;
    }
    if (e.getKeyCode()==e.VK_LEFT)
    {
        x = x-10;
    }
    if (e.getKeyCode()==e.VK_RIGHT)
    {
        x = x+10;
    }

    repaint ();
    }
    @Override
 public void keyReleased (KeyEvent e) { }

    @Override
    public void keyTyped(KeyEvent arg0) {}
} 