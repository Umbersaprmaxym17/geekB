package com.javacore.gb.advancedoop.ms;

public class Main {

    public static void main(String[] args) {


        Cat cat1 = new Cat("Tom the Cat ");
        Dog dog1 = new Dog("Bruno the dog");

        System.out.println("*******************************");
        cat1.animalCanRun(250);
        cat1.animalCanRun(199);
        System.out.println("*******************************");
        dog1.animalCanRun(502);
        dog1.animalCanRun(200);
        System.out.println("*******************************");

        cat1.animalCanSwim(250);
        System.out.println("*******************************");
        dog1.animalCanSwim(502);
        dog1.animalCanSwim(-1);
        System.out.println("*******************************");

        System.out.println(" Number of objects created is : " + Animal.count);
    }

}
