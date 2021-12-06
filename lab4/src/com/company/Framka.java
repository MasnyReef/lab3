package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Framka extends JFrame{

    public Framka(String title) throws HeadlessException{
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(688,500);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setBounds(0,0,660,483);
        setContentPane(panel);
        panel.setLayout(null);

        int x, y;

        JButton btnRunButton = new JButton("Run");
        btnRunButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }
        });

        btnRunButton.setBounds(0,412,156,71);
        panel.add(btnRunButton);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(504,412,156,71);
        panel.add(btnCancel);

    }

}


