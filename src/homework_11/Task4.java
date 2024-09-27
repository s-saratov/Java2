package homework_11;

/*
Task 4

Написать метод, который удаляет все вхождения заданного числа из массива и возвращает новый массив без этого числа.
 */

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        while (size < 0) {
            System.out.print("Вы ввели неверное количество. Повторите ввод: ");
            size = scanner.nextInt();
            scanner.nextLine();
        }
        int[] array = generateIntArray(size);

        System.out.print("Созданный массив: ");
        printArray(array);

        System.out.print("Введите число, которое необходимо удалить из массива: ");
        int numToDel = scanner.nextInt();
        scanner.nextLine();

        while (!isInArray(array, numToDel)) {
            System.out.print("Вы ввели неверное число. Повторите ввод: ");
            numToDel = scanner.nextInt();
            scanner.nextLine();
        }

        int[] newArray = deleteFromArray(array, numToDel);

        System.out.print("Новый массив: ");
        printArray(newArray);

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

    // Метод проверяет, имеется ли заданное число типа int в массиве, и возвращает true / false
    public static boolean isInArray (int[] array, int number) {
        if (array == null) return false;
        if (array.length == 0) return false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return true;
        }
        return false;
    }

    // Метод принимает целое число типа int и возвращает количество повторений этого числа в массиве
    public static int countNumberInArray (int[] array, int n) {
        if (array == null) return 0;
        if (array.length == 0) return 0;
        if(!isInArray(array, n)) return 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) number++;
        }
        return number;
    }

    // Метод принимает целое число типа int и возвращает массив, из которого удалены все повторения этого числа
    public static int[] deleteFromArray (int[] array, int number) {

        if (array == null) return new int[0];
        if (array.length == 0) return new int[0];
        if(!isInArray(array, number)) return array;

        int[] newArray = new int[array.length - countNumberInArray(array, number)];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != number) newArray[j++] = array[i];
            else continue;
        }

        return newArray;
    }

}