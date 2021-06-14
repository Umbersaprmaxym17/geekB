package com.javacore2.maxym;

import com.interfaces.Jump;
import com.interfaces.Run;

public class Robot implements Run, Jump {
    public void isJump() {
        System.out.println(" Robot can jump");
    }

    public void isRun() {
        System.out.println("Robot can run");
    }
}
