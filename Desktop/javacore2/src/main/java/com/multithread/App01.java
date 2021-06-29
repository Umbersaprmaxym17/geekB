package com.multithread;

import java.util.Arrays;

public class App01 {



    class MyThread2 implements Runnable {

        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" Runnable thread : " +Thread.currentThread().getName());
        }
    }





    class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("thread name  : " +Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        App01 app01 = new App01();
        app01.go();

    }

    public void go() throws InterruptedException {

        Thread[] myThreads = new Thread[10];
        for (int i = 0; i < myThreads.length ; i++) {
            MyThread2 myThread2 = new MyThread2();
            myThreads[i] = new Thread(myThread2);
            myThreads[i].start();
        }

//        for (int i = 0; i < myThreads.length; i++) {
//            myThreads[i].join();
//        }

        System.out.println("All threads stopped");


    }


}
