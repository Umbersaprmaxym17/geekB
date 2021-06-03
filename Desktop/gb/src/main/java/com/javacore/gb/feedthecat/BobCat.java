package com.javacore.gb.feedthecat;

public class BobCat {

    protected String catNickName;
    protected int appetite;
    protected boolean bellyful;




    public BobCat(String catNickName, int appetite, boolean bellyful) {
        this.catNickName = catNickName;
        this.appetite = appetite;
        this.bellyful = bellyful;
    }

    protected void bobCatEat(Plate plate) {
        System.out.println(catNickName);
        if (plate.getFood() >= appetite) {
            setBellyful(true);
            plate.decreaseFood(appetite);
            System.out.println("Cat is full :) ");
        } else  {
            System.out.println("Cat is not going to eat , he needs more food");
        }

     }


    protected void setBellyful(boolean bellyful) {
        this.bellyful = bellyful;
    }

    protected void info() {
        System.out.println(bellyful);
    }


}
