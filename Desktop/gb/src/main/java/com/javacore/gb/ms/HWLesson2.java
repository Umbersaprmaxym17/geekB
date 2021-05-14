package com.javacore.gb.ms;

public class HWLesson2 {

    public static void main(String[] args) {

        boolean s = checkSumRange(5, 78);
        System.out.println(s);

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

}
