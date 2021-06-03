package com.javacore.gb.feedthecat;

public class Main {


    public static void main(String[] args) {



        BobCat bobCat = new BobCat("Tomas", 40, false);
        BobCat bobCat2 = new BobCat("Jerry" , 20, false);
        Plate plate = new Plate(-2);

        bobCat.bobCatEat(plate);
        bobCat2.bobCatEat(plate);
        plate.info();



    }
}
