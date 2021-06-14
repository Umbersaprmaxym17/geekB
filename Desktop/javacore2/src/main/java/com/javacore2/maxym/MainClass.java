package com.javacore2.maxym;

import com.utillsclasses.RunningTreadmill;
import com.utillsclasses.Wall;

public class MainClass {


    public static void main(String[] args) {

        RunningTreadmill runningTreadmill = new RunningTreadmill();
        Wall wall = new Wall();
        Human engineer = new Human();



        engineer.isRun(runningTreadmill);
        engineer.isJump(wall);
    }
}
