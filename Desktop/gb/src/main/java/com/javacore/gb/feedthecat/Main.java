package com.javacore.gb.feedthecat;

public class Main {


    public static void main(String[] args) {


//        BobCat bobCat = new BobCat("Tomas", 40, false);
//        BobCat bobCat2 = new BobCat("Jerry" , 20, false);
        Plate plate = new Plate(30);


//        bobCat.bobCatEat(plate);
//        bobCat2.bobCatEat(plate);
//        System.out.println("*********************");
//
//        plate.info();
//
//        System.out.println("*********************");
//        bobCat.info();
//        bobCat2.info();


        BobCat[] cats = new BobCat[3];

        cats[0] = new BobCat("Alex", 30,false);
        cats[1] = new BobCat("Bellybutton", 40,false);
        cats[2] = new BobCat("BigToe", 25,false);

        for (int i = 0; i < cats.length ; i++) {
//            cats[i].bobCatEat(plate);
            System.out.println(cats[i].bellyful);

        } if (plate.getFood() == 0 ) {
            plate.addFood(30);
        }

    }
}
