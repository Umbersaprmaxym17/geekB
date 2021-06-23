package com.exceptions;

import java.util.Arrays;

public class MainClass{



    public static void main(String[] args) throws MyArraySizeException {

        String[][] users = new String[4][4];

        users[0][0]  = "1";
        users[0][1]  = "2";
        users[0][2]  = "3";
        users[0][3]  = "4";
        users[1][0]  = "5";
        users[1][1]  = "6";
        users[1][2]  = "7";
        users[1][3]  = "8";

        users[2][0]  = "9";
        users[2][1]  = "10";
        users[2][2]  = "11";
        users[2][3]  = "12";
        users[3][0]  = "13";
        users[3][1]  = "14";
        users[3][2]  = "15";
        users[3][3]  = "16";
  //      users[3][4]  = "nothing is here";


        try {
            System.out.println(printTwoDimensionalArray(users));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }





    }

    public static   int printTwoDimensionalArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int height   = array.length;
        int width  = array[0].length;
        if (height != 4 && width != 4) {
            throw new MyArraySizeException();
        }else {
            System.out.println(Arrays.deepToString(array));
        }


        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        return sum;





    }




}
