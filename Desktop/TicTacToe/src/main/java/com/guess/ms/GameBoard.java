package com.guess.ms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoard extends JFrame {
    JFrame frame;
    JRadioButton jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4;
    JButton submitButton;
    JLabel label;
    ButtonGroup buttonGroup;
    String question ="Capital of Madagascar  is ?";
    String option1 = "Berlin";
    String option2 = "Antananarivo";
    String option3 = "Paris";
    String option4 = "Montevideo";
    String correctAnswer = "Antananarivo";
    int cn;


    public GameBoard()  {
        setTitle("Guess the Capital ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600, 600, 800, 800);
        frame = new JFrame();
        frame.setLayout(null);


        jRadioButton1 = new JRadioButton(option1);
        jRadioButton1.setBounds(100,120,100,30);
        frame.add(jRadioButton1);
        jRadioButton2 =new JRadioButton(option2);
        jRadioButton2.setBounds(350,120,100,30);
        frame.add(jRadioButton2);
        jRadioButton3 =new JRadioButton(option3);
        jRadioButton3.setBounds(100,200,100,30);
        frame.add(jRadioButton3);
        jRadioButton4 =new JRadioButton(option4);
        jRadioButton4.setBounds(350,200,100,30);
        frame.add(jRadioButton4);

        add(jRadioButton1);
        add(jRadioButton2);
        add(jRadioButton3);
        add(jRadioButton4);

        submitButton= new JButton("SUBMIT");
        submitButton.setBounds(100,400,100,30);
        add((submitButton), BoxLayout.X_AXIS);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==submitButton)
                {
                    String en="";
                    if(jRadioButton1.isSelected())
                        en= jRadioButton1.getText();
                    if(jRadioButton2.isSelected())
                        en= jRadioButton2.getText();
                    if(jRadioButton3.isSelected())
                        en= jRadioButton3.getText();
                    if(jRadioButton4.isSelected())
                        en= jRadioButton4.getText();
                    if(en.equals(correctAnswer))
                        JOptionPane.showMessageDialog(null,"Right Answer");
                    else
                        JOptionPane.showMessageDialog(null,"Wrong Answer");
                }

            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameBoard();
    }
}
