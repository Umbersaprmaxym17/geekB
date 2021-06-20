package com.exceptions;

import java.util.Arrays;

public class MainClass{



    public static void main(String[] args) throws MyArraySizeException {

        String[][] users = new String[4][5];

        users[0][0]  = "one";
        users[0][1]  = "two";
        users[0][2]  = "three";
        users[0][3]  = "4";
        users[1][0]  = "five";
        users[1][1]  = "six";
        users[1][2]  = "seven";
        users[1][3]  = "eight";

        users[2][0]  = "nine";
        users[2][1]  = "ten";
        users[2][2]  = "eleven";
        users[2][3]  = "twelve";
        users[3][0]  = "thirteen";
        users[3][1]  = "fourteen";
        users[3][2]  = "fifteen";
        users[3][3]  = "eighteen";
    //    users[3][4]  = "nothing is here";

        printTwoDimensionalArray(users);




    }

    public static   void printTwoDimensionalArray(String[][] array) throws MyArraySizeException {
//        int height   = array.length;
//        int width  = array[0].length;
//        if (height > 4 && width < 4) {
//            throw new MyArraySizeException("Array size is less or more than 2 dimensional 4*4 ");
//        }else {
//            System.out.println(Arrays.deepToString(array));
//        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int convertedStringToDigit = Integer.parseInt(Arrays.deepToString(array));
                    System.out.print(convertedStringToDigit);
                    System.out.println(Arrays.deepToString(array));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.println(" Catch 1 NumberFormatException");
                } finally {
                    System.out.println();
                }
            }
        }






//        int height   = array.length;
//        int width  = array[0].length;
//        if (height > 4 && width < 4) {
//           // throw new MyArraySizeException(" Array size is more or less  than 4");
//            System.out.println(" Array size is more or less  than 4");
//        } else {
//            System.out.println(Arrays.deepToString(array));
//        }
//        try {
//            System.out.println(Arrays.deepToString(array));
//        }catch ( ArrayIndexOutOfBoundsException exception) {
//            System.out.println(exception.getMessage());
//        }catch (MyArraySizeException ex) {
//            System.out.println(ex.getMessage());
//        }
//           try {
//               System.out.println(Arrays.deepToString(array));
//               throw new MyArraySizeException();
//           } catch (MyArraySizeException ex) {
//               System.out.println(ex.getMessage());
//
//           }



    }




}
