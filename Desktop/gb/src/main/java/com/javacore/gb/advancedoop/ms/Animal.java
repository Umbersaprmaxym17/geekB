package com.javacore.gb.advancedoop.ms;

public abstract class Animal {

    protected String name;
    protected static int count;

    protected Animal(String name) {
        count++;
        this.name = name;
    }

    protected void animalCanSwim(int obstacleLength) {
        if (obstacleLength > 0) {
            System.out.println("Animal " + name + " swims for " + obstacleLength + " Meters");
        } else  {
            System.out.println("Length cannot be negative or equal tp ZERO ");
        }
    }

    protected void animalCanRun(int obstacleLength) {
        if (obstacleLength > 0) {
            System.out.println("Animal " + name + " runs for " + obstacleLength + " Meters");
        } else  {
            System.out.println("Length cannot be negative or equal to ZERO ");
        }
    }

    protected void animalInfo() {
        System.out.println(" Animal " + name);
    }



}
