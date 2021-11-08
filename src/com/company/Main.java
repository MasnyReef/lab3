package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });

    }

    public Main() throws HeadlessException{
        this("Log in");
    }

    public Main(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);

        JPanel Panel = new JPanel();
        JLabel userLabel = new JLabel("User Name:");
        JLabel  passwordLabel = new JLabel("Password:");
        JTextField userTex = new JTextField();
        JPasswordField passwordText = new JPasswordField();
        JButton logBtn = new JButton("Log in");
        JButton cncBtn = new JButton("Cancel");

        Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(Panel);
        Panel.setLayout(null);

        userLabel.setBounds(90, 100, 100, 23);
        Panel.add(userLabel);

        passwordLabel.setBounds(90, 150, 100, 23);
        Panel.add(passwordLabel);

        userTex.setBounds(200, 100, 200, 23);
        Panel.add(userTex);

        passwordText.setBounds(200, 150, 200, 23);
        Panel.add(passwordText);

        logBtn.setBounds(90, 200, 100, 23);
        Panel.add(logBtn);

        cncBtn.setBounds(300, 200, 100, 23);
        Panel.add(cncBtn);















    }
}
