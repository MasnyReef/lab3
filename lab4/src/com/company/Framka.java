package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Framka extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    Framka frame = new Framka("1");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }

            }
        });


    }

    public Framka(String title) throws HeadlessException {
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
