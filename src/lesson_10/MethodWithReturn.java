package lesson_10;

import java.util.Random;

public class MethodWithReturn {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = sum(a, b);

        sum = sum(10, 20);
        System.out.println(sum);

        System.out.println(squareNumber(2.5));

        double var = squareNumber(4.0);
        System.out.println(var + " <- var");

        String concat = concatString("Java", 17);
        System.out.println(concat);

        // Метод создаёт массив целых чисел типа int на 10 элементов и заполняет его случайными значениями от 0 до 100
        int[] ints = fillArray();

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println();

    }

    public static int[] fillArray() {
        int result[] = new int[10];

        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(101);
        }
        return result;
    }

    public static String concatString(String str, int x) {
        String result = str + x + "!!!";
        return result;
    }

    public static double squareNumber (double number) {
        return number * number;
    }

    public static int sum (int x, int y) {
        int result = x + y;
        // System.out.println(result);
        return result;
    }

}