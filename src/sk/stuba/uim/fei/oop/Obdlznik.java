package sk.stuba.uim.fei.oop;

import java.awt.*;

public class Obdlznik extends Rectangle {
    Color farba;
    public Obdlznik(int x, int y, int width, int height, Color c){
        super(x,y,width,height);
        farba = c;
    }

    public void kreslObdlznik(Graphics g){
        g.setColor(farba);
        g.fillRect(this.x,this.y, this.width, this.height);
    }
}
