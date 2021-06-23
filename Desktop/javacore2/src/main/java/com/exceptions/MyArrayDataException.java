package com.exceptions;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException() {
        super("Invalid data format inside of array ");
    }
}
