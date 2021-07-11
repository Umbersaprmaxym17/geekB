package sample;

import java.util.Arrays;
import java.util.Random;

public class Game {

//
//    public static class BullsAndCowsCount{
//        private final int bulls;
//        private final int cows;
//
//        public BullsAndCowsCount(int bulls, int cows) {
//            this.bulls = bulls;
//            this.cows = cows;
//        }
//
//        public int getBulls() {
//            return bulls;
//        }
//
//        public int getCows() {
//            return cows;
//        }
//    }
//
//
//    private int[] guessNumber;
//
//    public Game() {
//        this.guessNumber = generateNumber();
//        System.out.println(Arrays.toString(this.guessNumber));
//    }
//
//    public int[] getGuessNumber() {
//        return guessNumber;
//    }
//
//
//
//    public BullsAndCowsCount  calculateBullsAndCows(String playerNumber) {
//        int cows = 0,  bulls = 0;
//        for (int i = 0; i < 4; i++) {
//            if (guessNumber[i] == playerNumber.charAt(i) - '0') {
//                bulls++;
//            }else if (playerNumber.contains(String.valueOf(guessNumber[i]))) {
//                cows++;
//            }
//
//        }
//
//
//        return new BullsAndCowsCount(bulls,cows);
//    }


//    private  int[] generateNumber() {
//        int[] a = new int[]{0,1,2,3,4,5,6,7,8,9};
//        Random random = new Random();
//        for (int i = 0; i < 100 ; i++) {
//            int i1 = random.nextInt(10);
//            int i2 = random.nextInt(10);
//            int c = a[i2];
//            a[i2] = a[i1];
//            a[i1] = c;
//
//        }
//
//        return new int[]{a[0],a[1],a[2],a[3]};
//    }

}
