package com.exceptions;

import java.util.Arrays;

public class MyArraySizeException extends Exception{


    public MyArraySizeException(String s) {

    }

    public static   void findArraySize (String[][] array) throws MyArraySizeException {
        int height   = array.length;
        int width  = array[0].length;
        if (height > 4 && width < 4) {
            throw new MyArraySizeException(" Array size is more or less  than 4");
            //System.out.println(" Array size is more or less  than 4");
        } else {

        }

    }


}
