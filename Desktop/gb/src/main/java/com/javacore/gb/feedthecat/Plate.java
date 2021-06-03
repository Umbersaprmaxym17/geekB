package com.javacore.gb.feedthecat;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
        if (food < 0) {
            System.out.println("Food value cannot be negative");
        }
    }

    public void info () {
        System.out.println(" Food " + food);
    }

    protected void decreaseFood(int decreaseFoodNumber) {
        food -= decreaseFoodNumber;
        if (food <= 0) {
            setFood(food = 0);
            System.out.println("Plate is empty adding more food");
        }
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    protected void addFood(int food) {
        setFood(food);
    }
}
