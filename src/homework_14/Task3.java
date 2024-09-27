package homework_14;

/*
Task 3
Найти второе по величине число в массиве

Напишите метод, который находит второе по величине число в массиве целых чисел.
 */

import java.util.Random;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        int[] array = generateIntArray(size);

        System.out.print("Созданный массив:\t\t\t");
        printArray(array);

        System.out.println("Второе по величине число в массиве: " + findSecondMax(array));

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

    // Метод возвращает второе по величине целое число типа int в массиве
    private static int findSecondMax (int[] array) {
        if (array == null) {
            System.out.println("ОШИБКА! Направлен некорректный массив (null). Завершение программы.");
            System.exit(0);
            return -2147483648;
        }
        int firstMax = array[0];
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
            }
            else if (array[i] > secondMax) secondMax = array[i];
        }
        return secondMax;
    }

}