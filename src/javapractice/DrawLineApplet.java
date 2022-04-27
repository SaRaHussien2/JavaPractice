/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javapractice;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author SaRa
 */
public class DrawLineApplet extends Applet  implements MouseMotionListener, MouseListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    
   private Point startPoint, endPoint;

   @Override
    public void init() {
        resize(800,2000);
        this.addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (startPoint != null && endPoint != null) {
            g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        endPoint = e.getPoint();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        startPoint = e.getPoint();
        endPoint = e.getPoint();
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}