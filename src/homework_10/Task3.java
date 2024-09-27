package homework_10;

/*
Task 3

Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */

import java.util.Random;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива (не менее 2): ");
        int size = scanner.nextInt();
        scanner.nextLine();

        while (size < 2) {
            System.out.print("Вы ввели неверное количество. Повторите ввод: ");
            size = scanner.nextInt();
            scanner.nextLine();
        }
        int[] array1 = generateIntArray(size);

        System.out.print("Созданный массив:\t\t");
        printArray(array1);

        if (countPrimeNumbers(array1) != 0) {
            System.out.println("↓");
            System.out.print("Массив простых чисел:\t");
            int[] array2 = makePrimeNumbersArray(array1);
            printArray(array2);
        }
        else System.out.println("Простых чисел в данном массиве нет.");

    }

    // Метод создаёт массив размера size, состоящий из целых чисел типа int в диапазоне от 0 до 100
    public static int[] generateIntArray (int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(101);
        return array;
    }

    // Метод проверяет, является ли переданное число простым, и возвращает true / false
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) if (number % i == 0) return false;
        return true;
    }

    public static boolean isPrimeNumber2(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i * i < number; i += 6) if (number % i == 0 || number % (i + 2) == 0) return false;
        return true;
    }

    // Метод возвращает количество простых чисел в массиве целых чисел типа int
    public static int countPrimeNumbers (int[] array) {
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(array[i])) quantity++;
        }
        return quantity;
    }

    // Метод принимает массив целых чисел типа int и возвращает извлечённый из него массив простых чисел
    public static int[] makePrimeNumbersArray (int[] array) {
        int[] primeNumbersArray = new int[countPrimeNumbers(array)];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (isPrimeNumber(array[i])) primeNumbersArray[j++] = array[i];
        }
        return primeNumbersArray;
    }

    // Метод выводит на экран массив целых чисел типа int
    public static void printArray (int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
    }

}