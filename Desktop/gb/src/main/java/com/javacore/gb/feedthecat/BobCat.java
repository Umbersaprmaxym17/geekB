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
        plate.decreaseFood(appetite);
        if (plate.getFood() <= 0 ) {
            System.out.println(" There is no food left in the plate ");
        }
     }


}
