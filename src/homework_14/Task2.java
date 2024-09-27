package homework_14;

/*
Task 2
Сумма чётных чисел

Напишите метод, который вычисляет сумму всех четных чисел в массиве.
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

        System.out.print("Созданный массив:\t\t\t");
        printArray(array);

        System.out.println("Сумма чётных чисел в массиве: " + sumEvenNumbers(array));

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

    // Метод возвращает сумму всех чётных чисел типа int в массиве
    private static int sumEvenNumbers (int[] array) {
        if (array == null) {
            System.out.println("ОШИБКА! Направлен некорректный массив (null). Завершение программы.");
            System.exit(0);
            return -2147483648;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) sum += array[i];
        }
        return sum;
    }

}