package com.startfast.gb.ms;

import java.util.Scanner;

public class Game {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Your task is to guess the number ");
        int range =20;
        int random_number = ((int)(Math.random() * range));
        playLevel(range, random_number);
        scanner.close();
    }
    
    private static void playLevel(int range, int random_number) {
        while (true) {
            System.out.println("Guess the number from 0 to " + range);
            int input_number = scanner.nextInt();
            if (input_number == random_number) {
                System.out.println("Your have won , your  guess  is correct ");
                break;
            } else if (input_number > random_number) {
                System.out.println("The number should be less than you guessed");
            } else {
                System.out.println("The number is grater than you guessed");
            }
        }

    }


}
