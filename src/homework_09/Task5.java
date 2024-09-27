package homework_09;

/*
Task 8

Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:
{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */

import java.util.Scanner;

public class Task5 {

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

        System.out.println();
        printMaxString(strings);

    }

    public static void printMaxString (String[] str) {
        int i = 0;
        String maxString = "";

        while (i < str.length) {
            maxString = (maxString.length() < str[i].length()) ? str[i] : maxString;
            i++;
        }

        int j = 0;

        while (j < maxString.length()) {
            System.out.println(maxString.charAt(j));
            j++;
        }

    }

}