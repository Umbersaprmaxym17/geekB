package com.multithread;

import java.util.Arrays;

public class MaxApplication {


    public static long arraySize = 1000;

    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("thread name  : " +Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) throws InterruptedException {



        System.out.println(Arrays.toString(createArray(arraySize)));
        System.out.println(Arrays.toString(createArraySecond(arraySize)));

    }


    public static int[] createArray(long arraySize) throws InterruptedException {
        MyThread myThread01 = new MyThread();
        myThread01.start();
        long startTime = System.currentTimeMillis();
        int[] array = new int[(int) arraySize];
        for (int i = 0; i < arraySize ; i++) {
            array[i] = 1;
        }

        for (int i = 0; i <  array.length; i++) {
            array[i] = (int) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        myThread01.join();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Time execution is : " + executionTime + " milliseconds ");
        return array;

    }

    public static int[] createArraySecond(long arraySize) throws InterruptedException {
        MyThread myThread02 = new MyThread();
        myThread02.start();
        long startTime = System.currentTimeMillis();
        int[] array = new int[(int) arraySize];
        for (int i = 0; i < arraySize ; i++) {
            array[i] = 1;
        }

//        System.arraycopy(array, 0, array[0], 0, array[array.length]/2);
//        System.arraycopy(array,
//                array[array.length]/2,
//                array[array.length],
//                array[array.length]/2, h);

//        System.arraycopy(array, 0, a1, 0, h);
//        System.arraycopy(array, h, a2, 0, h);


        for (int i = 0; i <  array.length; i++) {
            array[i] = (int) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        myThread02.join();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Time execution is : " + executionTime + " milliseconds ");
        return array;

    }


}
