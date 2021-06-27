package sample;

import java.util.Random;

public class Game {


    private int[] guessNumber;

    public Game() {
        this.guessNumber = generateNumber();
    }

    public int[] getGuessNumber() {
        return guessNumber;
    }

    private  int[] generateNumber() {

        int[] a = new int[]{0,1,2,3,4,5,6,7,8,9};
        Random random = new Random();
        for (int i = 0; i < 100 ; i++) {
            int i1 = random.nextInt(100);
            int i2 = random.nextInt(100);
            int c = a[i2];
            a[i2] = a[i1];
            a[i1] = c;

        }

        return new int[]{a[0],a[1],a[2],a[3]};
    }

}
