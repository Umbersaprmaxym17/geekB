package com.ui.msgb;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {



    public Calculator() {
        setTitle("Counter application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 400, 100);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        final JTextField firstNumber = new JTextField();
        final JTextField secondNumber = new JTextField();

        JLabel plusLabel = new JLabel(" + ");
        final JLabel resultLabel = new JLabel(" 0 ");
        JButton equalButton = new JButton(" = ");



        equalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               double h1 = Double.parseDouble( firstNumber.getText());
               double h2 = Double.parseDouble( secondNumber.getText());
               double res = h1 + h2;
               resultLabel.setText(String.valueOf(res));
            }
        });


        add(firstNumber);
        add(plusLabel);
        add(secondNumber);
        add(equalButton);
        add(resultLabel);


        setVisible(true);
    }


    public static void main(String[] args) {
        new Calculator();

    }
}
