package com.startfast.gb.ms;

import java.util.Scanner;

public class Culculator {

    public static void main(String[] args) {
        System.out.println("Type the operation");
        System.out.println("1. addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Input first digit");
        int a = scanner.nextInt();
        System.out.println("Input second digit");
        int b = scanner.nextInt();
        int result;

        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 4) {
            result = a / b;
        }
        else  {
            result = a * b;
        }
        System.out.println("Result is : " + result
        );
    }
}
