/*
Store the drawn lines in an array to be able to redraw them again when the applet is repainted


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javapractice;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author SaRa
 */
public class DrawMultipleLinesApplet extends Applet implements MouseMotionListener, MouseListener {

    private final int MAXLINES = 100;
    private Point[] startPoint;
    private Point[] endPoint;
    private Point anchor;
    private Point currentpoint;
    private int currlines;

//  allocate the array of Points
    @Override
    public void init() {
        resize(800,2000);
        startPoint = new Point[MAXLINES];
        endPoint = new Point[MAXLINES];
        currlines = 0;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

//  start a new line when the user depresses the mouse

    @Override
    public void mousePressed(MouseEvent e)
    {
        anchor = new Point(e.getX(),e.getY());
        repaint();
    }

//  draw the potential line as the user drags the mouse around

    @Override
    public void mouseDragged(MouseEvent e)
    {
        currentpoint = new Point(e.getX(),e.getY());
        repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e) { }

//  add the new line when the user releases the mouse button

    @Override
    public void mouseReleased(MouseEvent e)
    {
        if (currlines < MAXLINES)
            addline(e.getX(),e.getY());
        else {
            currentpoint = null;
            repaint();
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) { }
    @Override
    public void mouseEntered(MouseEvent e) { }
    @Override
    public void mouseExited(MouseEvent e) { }

    void addline(int x, int y) {
        startPoint[currlines] = anchor;
        endPoint[currlines] = currentpoint;
        currlines++;
        currentpoint = null;
        repaint();
    }

//  draw the border and the existing lines, then draw the potential line in blue

    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
        for (int i = 0 ; i < currlines ; i++)
            g.drawLine(startPoint[i].x,startPoint[i].y,endPoint[i].x,endPoint[i].y);

        g.setColor(Color.blue);
        if (currentpoint != null)
            g.drawLine(anchor.x,anchor.y,currentpoint.x,currentpoint.y);
        
    }
}