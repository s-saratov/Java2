package homework_09;

/*
Task 0

Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.
Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */

import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        printStringLength(str);

    }

    public static void printStringLength (String str) {
        System.out.printf("Длина строки составляет %d символов.\n", str.length());
    }

}