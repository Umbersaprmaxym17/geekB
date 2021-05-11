public class HWLesson1 {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 7;
        int b = -1;
        if (a + b >=0 ) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
}
