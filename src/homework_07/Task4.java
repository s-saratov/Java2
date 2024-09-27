package homework_07;

/*
Task 4

Напишите программу с использованием оператора switch:
Программа просит пользователя ввести число от 1 до 7. Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
 */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число от 1 до 7: ");
        int day = scanner.nextInt();
        scanner.nextLine();

        while ((day < 1) | (day >= 8)) {
            System.out.print("Вы ввели неверное число. Повторите ввод: ");
            day = scanner.nextInt();
            scanner.nextLine();
        }

        switch (day) {
            case 1:
                System.out.println("\nПонедельник");
                break;
            case 2:
                System.out.println("\nВторник");
                break;
            case 3:
                System.out.println("\nСреда");
                break;
            case 4:
                System.out.println("\nЧетверг");
                break;
            case 5:
                System.out.println("\nПятница");
                break;
            case 6:
            case 7:
                System.out.println("\nВыходной");
                break;
            default:
                System.out.println("\nНесуществующий день недели");
                break;
        }

    }

}