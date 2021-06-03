package com.javacore.gb.feedthecat;

public class Main {


    public static void main(String[] args) {



        BobCat bobCat = new BobCat("Tomas", 40, false);
        BobCat bobCat2 = new BobCat("Jerry" , 20, false);
        Plate plate = new Plate(30);



        bobCat.bobCatEat(plate);
        bobCat2.bobCatEat(plate);
        System.out.println("*********************");

        plate.info();

        System.out.println("*********************");
        bobCat.info();
        bobCat2.info();



    }
}
