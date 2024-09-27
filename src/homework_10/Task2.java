package homework_10;

/*
Task 2

Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива
 */

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int strNum = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[strNum];

        int i = 0;

        while (i < strNum) {
            System.out.print("Введите строку № " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
            i++;
        }

        String maxAndMinStrings[] = takeMaxAndMinStrings(strings);
        System.out.print("Минимальная и максимальная строки: ");
        printArray(maxAndMinStrings);

        System.out.println("\n ======== Тесты на null / length = 0 ========\n");

        System.out.println("1. Переданный массив = null");
        strings = null;
        maxAndMinStrings = takeMaxAndMinStrings(strings);
        System.out.print("Минимальная и максимальная строки: ");
        printArray(maxAndMinStrings);

        System.out.println("\n2. В переданном массиве имеется null");
        strings = new String[] {"One1", "Java", "Python", null, "JS", "hello"};
        maxAndMinStrings = takeMaxAndMinStrings(strings);
        System.out.print("Минимальная и максимальная строки: ");
        printArray(maxAndMinStrings);

        System.out.println("\n3. В переданном массиве null - первый элемент");
        strings = new String[] {null, "Java", "Python", null, "JS", "hello"};
        maxAndMinStrings = takeMaxAndMinStrings(strings);
        System.out.print("Минимальная и максимальная строки: ");
        printArray(maxAndMinStrings);

    }

    // Метод принимает массив строк и возвращает новый массив, состоящий из самой короткой
    // и самой длинной строки изначального массива
    public static String[] takeMaxAndMinStrings(String[] strArr) {

        if (strArr == null || strArr.length == 0) return new String[0]; // []

        if (findFirstNotNullValue(strArr) == null) return new String[0];

        String maxString = findFirstNotNullValue(strArr);
        String minString = findFirstNotNullValue(strArr);

        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i] != null && maxString.length() < strArr[i].length()) maxString = strArr[i];
            if (strArr[i] != null && minString.length() > strArr[i].length()) minString = strArr[i];
        }

        String[] newStrArr = {minString, maxString};

        return newStrArr;

    }

    // Метод выводит на экран массив строк
    public static void printArray (String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print("\"" + array[i] + "\"" + ((i < array.length - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // Метод возвращает первый элемент массива строк, не являющийся null
    public static String findFirstNotNullValue(String[] string) {
        for (int i = 0; i < string.length; i++) {
            if (string[i] != null) return string[i];
        }
        return null;
    }

}