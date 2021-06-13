package com.guess.ms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameBoard extends JFrame {
    JFrame frame;
    JRadioButton jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4;
    JButton submitButton;
    String question ="Capital of Madagascar  is ?";
    String option1 = "Berlin";
    String option2 = "Antananarivo";
    String option3 = "Paris";
    String option4 = "Montevideo";
    String correctAnswer = "Antananarivo";



    public GameBoard()  {
        setTitle("Guess the Capital ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600, 600, 800, 800);

        JLabel label = new JLabel();
        label.setBounds(800, 40, 300, 30);
        label.setFont(new Font("chiller",Font.BOLD,30));
        label.setVisible(true);
        add(label);



        frame = new JFrame();
        frame.setLayout(null);




        jRadioButton1 = new JRadioButton(option1);
        jRadioButton1.setBounds(100,120,100,30);
        frame.add(jRadioButton1);
        jRadioButton2 = new JRadioButton(option2);
        jRadioButton2.setBounds(350,120,100,30);
        frame.add(jRadioButton2);
        jRadioButton3 = new JRadioButton(option3);
        jRadioButton3.setBounds(100,200,100,30);
        frame.add(jRadioButton3);
        jRadioButton4 = new JRadioButton(option4);
        jRadioButton4.setBounds(350,200,100,30);
        frame.add(jRadioButton4);

        add(jRadioButton1);
        add(jRadioButton2);
        add(jRadioButton3);
        add(jRadioButton4);

        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(100,400,100,30);
        add((submitButton), BoxLayout.X_AXIS);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == submitButton) {
                    String string = "";
                    if(jRadioButton1.isSelected())
                        string = jRadioButton1.getText();
                    if(jRadioButton2.isSelected())
                        string = jRadioButton2.getText();
                    if(jRadioButton3.isSelected())
                        string = jRadioButton3.getText();
                    if(jRadioButton4.isSelected())
                        string = jRadioButton4.getText();
                    if(string.equals(correctAnswer))
                        JOptionPane.showMessageDialog(null,"Right Answer");
                    else
                        JOptionPane.showMessageDialog(null,"Wrong Answer");
                }

            }


        });


        setLayout(null);


        setVisible(true);
    }

    public static void main(String[] args) {
        new GameBoard();
    }
}
