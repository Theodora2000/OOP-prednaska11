package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class TestCanvas extends Canvas implements MouseListener, MouseMotionListener {

    public ArrayList<Obdlznik> our_objects = new ArrayList<Obdlznik>();
    Obdlznik aktualny_obdlzinik;
    int xpos=0, ypos=0;

    public TestCanvas(){
        super();
        addMouseListener(this);
        addMouseMotionListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        xpos = e.getX();
        ypos = e.getY();
        aktualny_obdlzinik = new Obdlznik(xpos, ypos,1,1,Color.blue );
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        our_objects.add(aktualny_obdlzinik);
        repaint();
        aktualny_obdlzinik = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(aktualny_obdlzinik != null){
            aktualny_obdlzinik.width= e.getX()-xpos;
            aktualny_obdlzinik.height = e.getY() - ypos;
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public void paint(Graphics g){
        for(Obdlznik a : our_objects){
            a.kreslObdlznik(g);
        }
        if(aktualny_obdlzinik!=null){
            aktualny_obdlzinik.kreslObdlznik(g);
        }
    }
}
