package com.exceptions;

import java.util.Arrays;

public class MainClass {


    public static void main(String[] args) {

        String[][] strings = new String[4][4];
        strings[0][0]  = "one";
        strings[0][1]  = "two";
        strings[0][2]  = "three";
        strings[0][3]  = "four";
        strings[1][0]  = "five";
        strings[1][1]  = "six";
        strings[1][2]  = "seven";
        strings[1][3]  = "eight";

        strings[2][0]  = "nine";
        strings[2][1]  = "ten";
        strings[2][2]  = "eleven";
        strings[2][3]  = "twelve";
        strings[3][0]  = "thirteen";
        strings[3][1]  = "fourteen";
        strings[3][2]  = "fifteen";
        strings[3][3]  = "eighteen";




        Arrays.deepToString(strings);
        twoDimensionalArray(strings);

    }

    public static void twoDimensionalArray(String[][] array) {
        System.out.println(Arrays.deepToString(array));
    }






}
