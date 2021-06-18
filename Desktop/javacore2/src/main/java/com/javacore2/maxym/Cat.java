package com.javacore2.maxym;

import com.interfaces.Jump;
import com.interfaces.Run;
import com.utillsclasses.RunningTreadmill;
import com.utillsclasses.Wall;

public class Cat implements Run, Jump {
    public void isJump(Wall wall) {
        if (wall != null) {
            System.out.println("Cat jumps over the wall");
        }
    }

    public void isRun(RunningTreadmill runningTreadmill) {
        if (runningTreadmill != null) {
            System.out.println("Cat runs on treadmill");
        }

    }


}
