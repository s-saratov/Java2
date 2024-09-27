package homework_11;

/*
Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        int[] array = generateIntArray(size);

        System.out.print("Созданный массив:\t\t\t\t\t\t\t");
        printArray(array);

        System.out.print("Среднее арифметическое элементов массива: \t" + findArithmeticMeanOfArrayElements(array));

    }

    // Метод создаёт массив размера size, состоящий из целых чисел типа int в диапазоне от 0 до 100
    public static int[] generateIntArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(101);
        return array;
    }

    // Метод выводит на экран массив целых чисел типа int
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // Метод возвращает сумму всех элементов массива целых чисел типа int
    public static int sumArrayElements(int[] array) {
        if (array == null) {
            System.out.println("ОШИБКА! Направлен некорректный массив (null). Завершение программы.");
            System.exit(0);
            return -2147483648;
        }
        if (array.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) sum += array[i];
        return sum;
    }

    // Метод возвращает среднее арифметическое всех элементов массива целых чисел типа int
    public static double findArithmeticMeanOfArrayElements(int[] array) {
        if (array == null) {
            System.out.println("ОШИБКА! Направлен некорректный массив (null). Завершение программы.");
            System.exit(0);
            return -2147483648;
        }
        if (array.length == 0) {
            System.out.println("ОШИБКА! Направлен пустой массив. Вычисление среднего арифметического невозможно" +
                    " (деление на ноль). Завершение программы.");
            System.exit(0);
            return -2147483648;
        }
        return (double) sumArrayElements(array) / array.length;
    }

}