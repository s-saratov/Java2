package homework_05;

/*
Task 1

Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String userName = scanner.nextLine();
        System.out.println("\nВаше имя содержит " + userName.length() + " символов.");

        char firstChar = userName.charAt(0);
        char lastChar = userName.charAt(userName.length() - 1);

        System.out.println("Десятичный код первой буквы Вашего имени " + (int) firstChar + ", последней - " + (int) lastChar + ".");

    }

}
