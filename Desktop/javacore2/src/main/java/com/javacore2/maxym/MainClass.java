package com.javacore2.maxym;

import com.utillsclasses.RunningTreadmill;
import com.utillsclasses.Wall;

public class MainClass {


    public static void main(String[] args) {

//        RunningTreadmill runningTreadmill = new RunningTreadmill();
//        Wall wall = new Wall();
//        Human engineer = new Human();
//        Cat Tom = new Cat();
//        Robot r2d2 = new Robot("Droid");
//
//
//
//        engineer.isRun(runningTreadmill);
//        engineer.isJump(wall);
//        r2d2.isJump(wall);
//        r2d2.isRun(runningTreadmill);
        RunningTreadmill[] runningTreadmills = new RunningTreadmill[2];
        runningTreadmills[0] = new RunningTreadmill("Model X 1");
        runningTreadmills[1] = new RunningTreadmill(" Model Y 2 ");

        Robot[] robots = new Robot[2];

        robots[0] = new Robot("R2D2");
        robots[1] = new Robot("C3PO");


        for (int i = 0; i < robots.length; i++) {
            robots[i].isRun(runningTreadmills[i]);
            System.out.println("Robot " +  robots[i] + " runs on " + runningTreadmills[i]);
        }











    }
}
