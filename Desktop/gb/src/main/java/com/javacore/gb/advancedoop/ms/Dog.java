package com.javacore.gb.advancedoop.ms;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void animalCanRun(int obstacleLength) {
        if (obstacleLength > 500) {
            System.out.println("Animal " + name + " has run limit 0f 500  Meters");
        } else {
            super.animalCanRun(obstacleLength);
        }
    }

    @Override
    protected void animalCanSwim(int obstacleLength) {
        if (obstacleLength > 10) {
            System.out.println("Animal " + name + " has swim limit 0f 10  Meters");
        } else  {
            super.animalCanSwim(obstacleLength);
        }
    }
}
