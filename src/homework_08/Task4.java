package homework_08;

/*
Task 4

Напишите программу, которая просит пользователя ввести слово "hello". Если пользователь вводит правильное слово, программа благодарит его и завершает работу. Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.

Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.
 */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int i = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово \"hello\": ");
        String word = scanner.nextLine();

        while (!word.equals("hello")) {
            System.out.print("Вы ввели неправильное слово. Повторите ввод: ");
            word = scanner.nextLine();
            i++;
        }

        System.out.println("\nСпасибо!");
        System.out.println("Количество попыток, потребовавшихся для ввода правильного слова: " + i);

    }

}