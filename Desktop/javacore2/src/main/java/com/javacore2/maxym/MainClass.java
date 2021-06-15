package com.javacore2.maxym;

import com.utillsclasses.RunningTreadmill;
import com.utillsclasses.Wall;

public class MainClass {


    public static void main(String[] args) {

        RunningTreadmill runningTreadmill = new RunningTreadmill();
        Wall wall = new Wall();
        Human engineer = new Human();
        Cat Tom = new Cat();
        Robot r2d2 = new Robot();



        engineer.isRun(runningTreadmill);
        engineer.isJump(wall);
        r2d2.isJump(wall);
        r2d2.isRun(runningTreadmill);


        

    }
}
