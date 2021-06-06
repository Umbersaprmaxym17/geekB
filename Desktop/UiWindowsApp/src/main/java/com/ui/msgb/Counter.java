package com.ui.msgb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {

    public Counter()  {

        setTitle("Counter application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600, 600, 800, 800);

        Font font = new Font("Radian", Font.BOLD, 24);

        final JLabel counterValue = new JLabel("100");
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValue, BorderLayout.CENTER);
        counterValue.setFont(font);


        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);
        decrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = counterValue.getText();
                int i = Integer.parseInt(text) -1 ;
                 counterValue.setText(String.valueOf(i));

            }
        });



        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);
        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textIncrement = counterValue.getText();
                int j = Integer.parseInt(textIncrement) + 1;
                counterValue.setText(String.valueOf(j));

            }
        });








        setVisible(true);

    }

    public static void main(String[] args) {
        new Counter();
    }
}
