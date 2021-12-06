package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        final JPanel Panel = new JPanel();
        JLabel userLabel = new JLabel("User Name:");
        JLabel  passwordLabel = new JLabel("Password:");
        final JTextField userText = new JTextField();
        final JPasswordField passwordText = new JPasswordField();
        JButton logBtn = new JButton("Log in");
        final JButton cncBtn = new JButton("Cancel");

        Panel.setBackground(Color.lightGray);

        Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(Panel);
        Panel.setLayout(null);

        userLabel.setBounds(90, 100, 100, 23);
        Panel.add(userLabel);

        passwordLabel.setBounds(90, 150, 100, 23);
        Panel.add(passwordLabel);

        userText.setBounds(200, 100, 200, 23);
        Panel.add(userText);

        passwordText.setBounds(200, 150, 200, 23);
        Panel.add(passwordText);

        logBtn.setBounds(90, 200, 100, 23);
        Panel.add(logBtn);

        cncBtn.setBounds(300, 200, 100, 23);
        Panel.add(cncBtn);

        final Map<String,String> map = new HashMap<String, String>();
        database(map);

        final Set<Map.Entry<String,String>> entrySet = map.entrySet();



        logBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean x = false;
                String user = (userText.getText());
                String password = new String(passwordText.getPassword());
                for(Map.Entry<String,String> entry: entrySet){
                    if(entry.getKey().equals(password)){
                        if(map.get(entry.getKey()).equals(user)){
                            x = true;
                        }
                    }
                }
                if(x){
                    Panel.setBackground(Color.GREEN);
                }
                else{
                    Panel.setBackground(Color.RED);
                }
            }
        });



        cncBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             userText.setText("");
             passwordText.setText("");
             Panel.setBackground(Color.lightGray);
            }
        });

    }


    static void database(Map<String,String> map){
        map.put("lecymydur","Masny Ben");
        map.put("ZibiTop1","Zbigniew Boniek");
        map.put("OrzełPolski","Rl9");
        map.put("rowery19","Paweł Jumper");
        map.put("Glazury@5","Bogusław Łęcina");
        map.put("1","1");
    }

}
