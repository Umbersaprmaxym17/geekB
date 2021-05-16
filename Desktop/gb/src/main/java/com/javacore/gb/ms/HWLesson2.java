package com.javacore.gb.ms;

public class HWLesson2 {

    public static void main(String[] args) {

        boolean s = checkSumRange(5, 78);
        System.out.println(s);
        String number = checkIfNumberPositiveOrNegative(0);
        System.out.println(number);
        boolean b = isNegativeNumber(0);
        System.out.println(b);
        String s1 = printStringGivenNumberOfTimes("Coding java core ", 3);
        System.out.println(s1);

    }

    /**
     *
     * @param x first  digit to be compared (can be positive or negative)
     * @param y second digit to be compared (can be positive or negative)
     * @return if the sum of two digits in the range between (10 and 20 including ) the function returns boolean value
     * and prints result into the console
     */
    static boolean checkSumRange(int x, int y) {
        if ((x + y >= 10 )&&( x + y <=20)) {
            return true;
        } else {
            return false;
        }
    }

    static String checkIfNumberPositiveOrNegative(int a) {
        if (a >= 0) {
            return "Number is positive";
        } else if (a < 0) {
            return "Number is negative";
        }
        return null;
    }

    static boolean isNegativeNumber(int a) {
        return a >= 0 ? false : true;
    }


    static String  printStringGivenNumberOfTimes(String string, int number) {
//        while (number > 0) {
//            System.out.println(string + " " + number);
//            number--;
//        }
        for (int i = 1; i <=number; i++) {
            System.out.println(string + " " + i);
        }
        return string;
    }

}
