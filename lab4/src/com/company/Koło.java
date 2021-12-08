package com.company;


import java.awt.*;

public class Koło extends Kształt {
    private int x,y,w,h;
    private Color c;

    public Koło(int x, int y, int h, int w,Color c){
        this.x=x;
        this.y=y;
        this.h=h;
        this.w=w;
        this.c=c;
    }




    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(c);
        g.drawOval(x, y, w, h);
    }
}
