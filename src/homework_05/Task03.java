package homework_05;

/*
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
 */

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку чётной длины: ");
        String string = scanner.nextLine();

        while ((string.length() % 2) > 0) {
            System.out.print("Длина введённой Вами строки нечётная. Повторите ввод: ");
            string = scanner.nextLine();
        }

        System.out.println("\nДва средних символа строки: " + string.substring(((string.length() + 1) / 2 - 1), ((string.length() + 1) / 2 + 1)));

    }

}
