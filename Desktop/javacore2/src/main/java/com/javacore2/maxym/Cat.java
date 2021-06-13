package com.javacore2.maxym;

import com.interfaces.Jump;
import com.interfaces.Run;

public class Cat implements Run, Jump{

    public void isJump() {
        System.out.println("Cat can jump");
    }

    public void isRun() {
        System.out.println(" Cat can run");

    }
}
