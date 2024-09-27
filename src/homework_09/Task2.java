package homework_09;

/*
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание: ");
        int base = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите показатель (степень): ");
        int exponent = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Результат: ");
        take2PowerAndPrint(base, exponent);

    }

    // Метод возводит целое число base в степень exponent и возвращает результат

    public static double take2Power (int base, int exponent) {
        double result = 1;
        int modExp = (exponent > 0) ? exponent : exponent * -1;

        for (int i = 0; i < modExp; i++) result *= base;

        if (exponent < 0) return 1.0 / result;
        else return result;
    }

    // Метод возводит целое число в степень и выводит на экран результат

    public static void take2PowerAndPrint (int base, int exponent) {
        System.out.print(take2Power(base, exponent));
    }

}