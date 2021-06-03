package com.javacore.gb.advancedoop.ms;

public class Cat  extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    protected void animalCanSwim(int obstacleLength) {
        System.out.println(" Oops but Cats cannot swim");
    }

    @Override
    public void animalCanRun(int obstacleLength) {
        if (obstacleLength > 200) {
            System.out.println("Animal " + name + " has run limit  of 200  Meters");
        }else {
            super.animalCanRun(obstacleLength);
        }
    }
}
