package com.ui.msgb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MyWindow extends JFrame {

    public MyWindow()  {
        setTitle("This is My First Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600, 600, 800, 800);
        setLayout(null);

         final JTextField textField = new JTextField();
        textField.setBounds(140, 20 , 600, 40 );
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
            }
        });


        add(textField);


//        add((loginButton), BorderLayout.NORTH);
//        add(new JButton(" Send message"), BorderLayout.SOUTH);
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 20 ,100, 40);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                textField.setText(" Hello Max your random number is " + random.nextInt());

            }
        });
        add(loginButton);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println(" Window is closing ");
            }
        });



//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
//        for (int i = 0; i < 5  ; i++) {
//            add(new JButton("btn " + i));
//        }






        setVisible(true);

    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
