package com.multithread;

import java.util.Arrays;

public class Multithreaded {


    public static long arraySize = 100000;


    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(arraySize)));

    }


    public static int[] createArray(long arraySize) {
        long startTime = System.currentTimeMillis();
        int[] array = new int[(int) arraySize];
        for (int i = 0; i < arraySize ; i++) {
            array[i] = 1;
        }

        for (int i = 0; i <  array.length; i++) {
            array[i] = (int) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Time execution is : " + executionTime + " milliseconds ");
        return array;

    }
}
