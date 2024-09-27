package homework_11;

/*
Task 1

Написать метод, который считает сумму всех элементов в массиве.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Task1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        int[] array = generateIntArray(size);

        System.out.print("Созданный массив:\t\t\t");
        printArray(array);

        array = new int[0];
        System.out.print("Сумма элементов массива: \t" + sumArrayElements(array));

    }

    // Метод создаёт массив размера size, состоящий из целых чисел типа int в диапазоне от 0 до 100
    public static int[] generateIntArray (int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(101);
        return array;
    }

    // Метод выводит на экран массив целых чисел типа int
    public static void printArray (int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // Метод возвращает сумму всех элементов массива целых чисел типа int
    public static int sumArrayElements (int[] array) {
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

}