package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;

public class Kanwa extends JPanel implements MouseInputListener {
    public Kanwa(){
        setFocusable(true);
        this.requestFocusInWindow();
        addMouseListener(this);

        setBorder(new LineBorder(Color.BLACK, 3, false));
        setBackground(Color.green);
        setLayout(null);

        final JLabel[] label = {new JLabel("nic")};
        label[0].setBounds(10,10,60,15);
        add(label[0]);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char key = e.getKeyChar();
                System.out.println(key);
                if(key=='k'){
                    k=2;
                    label[0].setText("Kwadrat");
                }
                if(key=='o'){
                    k=1;
                    label[0].setText("Okrąg");
                }

            }
        });

        //keyListener nie wiem czemu mi nie działał więc dodałem przyciski

        JButton kbtn = new JButton("kwadrat");
        kbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                k=2;
                label[0].setText("Kwadrat");
            }
        });
        kbtn.setBounds(200,330,90,25);
        add(kbtn);

        kbtn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
            }
        });

        JButton obtn = new JButton("okrąg");
        obtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                k=1;
                label[0].setText("Okrąg");
            }
        });
        obtn.setBounds(300,330,90,25);
        add(obtn);




    }

    int x,y,w=50,h=50,k=0;
    Color c=Color.red;


    public Koło koło;
    public Kwadrat kwadrat;

    @Override
    public void mouseClicked(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        if(k==1){
            koło=new Koło(x,y,w,h,c);
            repaint();
        }
        if(k==2){
            kwadrat=new Kwadrat(x,y,w,h,c);
            repaint();
        }

        }






    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if(k==1){
            if(koło!=null){
                koło.paintComponent(g);
        }
        }
        if(k==2){
            if(kwadrat!=null){
                kwadrat.paintComponent(g);
            }
        }

    }




    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

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

    @Override
    public void mouseDragged(MouseEvent e) {

    }


}
