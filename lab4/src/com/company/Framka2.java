package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Framka2 extends JFrame{

    public Framka2(String title) throws HeadlessException{
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(688,500);
        setLocationRelativeTo(null);
        final JPanel panel = new JPanel();
        panel.setBounds(0,0,640,500);
        setContentPane(panel);
        panel.setLayout(null);


        final int[] x = {0};
        final int[] y = {0};
        final Random random = new Random();

        final JPanel kanwa = new Kanwa();
        kanwa.setBounds(10,10,650,360);

 /*     final JLabel[] label = {new JLabel("nic")};
        label[0].setBounds(10,10,60,15);
        kanwa.add(label[0]);

        label[0].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int key = e.getKeyCode();
                int keyc = e.getKeyChar();
                label[0] = new JLabel(String.valueOf(keyc));
                if(key == 107){
                    label[0] = new JLabel("koło");
                }
            }
        });

*/
        final JButton btnRunButton = new JButton("Run");

        btnRunButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                if(x[0]<340 || y[0]>170) {
                    x[0] = random.nextInt(518);
                    y[0] = random.nextInt(412);
                    btnRunButton.setLocation(x[0], y[0]);
                }
            }
        });

        btnRunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnRunButton.setLocation(0,412);
                panel.add(kanwa);
            }
        });

        btnRunButton.setBounds(0,412,156,50);
        panel.add(btnRunButton);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnRunButton.setLocation(0,412);
            }
        });

        btnCancel.setBounds(518,412,156,50);
        panel.add(btnCancel);

    }

}


