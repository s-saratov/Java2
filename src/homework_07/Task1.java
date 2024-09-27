package homework_07;

/*
Task 1

Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число на выбор (1, 2 или 3): ");
        int number = scanner.nextInt();

        while ((number < 1) | (number >= 4)) {
            System.out.print("Вы ввели неверное число. Повторите ввод: ");
            number = scanner.nextInt();
            scanner.nextLine();
        }

        if (number == 1) System.out.println("Вы ввели число один");
        else if (number == 2) System.out.println("Вы ввели число два");
        else if (number == 3) System.out.println("Вы ввели число три");

    }
}
