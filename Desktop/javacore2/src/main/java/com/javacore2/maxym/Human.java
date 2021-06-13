package com.javacore2.maxym;

import com.interfaces.Jump;
import com.interfaces.Run;

public class Human implements Run, Jump {
    public void isJump() {
        System.out.println("Human can jump");
    }

    public void isRun() {
        System.out.println("Human can run");
    }
}
