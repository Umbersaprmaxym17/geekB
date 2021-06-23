package com.exceptions;



public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Array size format is incorrect");
    }
//    public MyArraySizeException(String message) {
//        super(message);
//    }
//
//    public MyArraySizeException(RuntimeException e) {
//        super(e);
//    }
//
//    public MyArraySizeException(String message, RuntimeException cause) {
//        super(message, cause);
//    }

    //    public MyArraySizeException(String s) {
//
//    }

//    public static   void findArraySize (String[][] array) throws MyArraySizeException {
//        int height   = array.length;
//        int width  = array[0].length;
//        if (height > 4 && width < 4) {
//            throw new MyArraySizeException(" Array size is more or less  than 4");
//            //System.out.println(" Array size is more or less  than 4");
//        } else {
//
//        }
//
//    }


}
