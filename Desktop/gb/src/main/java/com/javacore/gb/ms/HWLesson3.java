package com.javacore.gb.ms;

import java.util.Arrays;

public class HWLesson3 {

    public static void main(String[] args) {

        // Task 1 - Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
        // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] byteCode = {1, 1, 1, 1, 0};
        for (int i = 0; i < byteCode.length; i++) {
        }
        for (int i = 0; i < byteCode.length; i++) {
            if (byteCode[i] == 1) {
                byteCode[i] = 0;
            } else {
                byteCode[i] = 1;
            }
        }
        System.out.println("************ Task 1 *************");
        System.out.println(Arrays.toString(byteCode));

            System.out.println("********* Task 2 ****************");
            // Task 2 - Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
            int[] centi = new int[100];
            for (int j = 0; j < 100; j++) {
                centi[j] = j + 1;

            }
            System.out.println(Arrays.toString(centi));
//            System.out.println("*************************");
//            for (int j = 0; j < centi.length; j++) {
//                System.out.println(i + " - " + centi[j]);
//            }

        //Task 3 - 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("********* Task 3 ****************");
        int[] digitsToMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < digitsToMultiply.length; i++) {
            if (digitsToMultiply[i] < 6 ) {
                digitsToMultiply[i] = digitsToMultiply[i] * 2;
            }else  {

            }
        }
        System.out.println(Arrays.toString(digitsToMultiply));


        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("********* Task 4 ****************");

        int[][] squareArray = new int[4][4];
        for (int i = 0; i <squareArray.length ; i++) {
            for (int j = 0; j <squareArray[i].length; j++) {
                squareArray[0][0] = 1;
                squareArray[0][3] = 1;
                squareArray[1][1] = 1;
                squareArray[1][2] = 1;
                squareArray[2][1] = 1;
                squareArray[2][2] = 1;
                squareArray[3][0] = 1;
                squareArray[3][3] = 1;
            }
        }
        System.out.println(Arrays.deepToString(squareArray));


        System.out.println("********* Task 5 ****************");


        System.out.println(Arrays.toString(returnOneDimentinalArray(10,8)));
        }

        // Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        static int[] returnOneDimentinalArray(int len, int initialValue) {
            int[] oneDimnetinalArray =new int[len];
            for (int i = 0; i <len ; i++) {
                oneDimnetinalArray[i] = initialValue;
            }
            return oneDimnetinalArray;
        }


        static boolean isLeap(int year) {
            return year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ;
        }





    }

