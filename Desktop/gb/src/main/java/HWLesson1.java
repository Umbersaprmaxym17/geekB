public class HWLesson1 {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
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

    public static void printColor() {
        int value = 101;
        if (value <=0) {
            System.out.println("Красный");
        } else if (value >0 && value<=100) {
            System.out.println("Желтый");
        } else if (value >100) {
            System.out.println("Зеленый");
        }
    }
}
