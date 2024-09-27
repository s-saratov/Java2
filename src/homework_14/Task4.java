package homework_14;

/*
Task 4
Подсчет гласных и согласных

Напишите программу, которая просит пользователя ввести слово и подсчитывает количество гласных
и согласных букв в этом слове.
 */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the word (in English): ");
        String word = scanner.nextLine();

        char[] letters = stringToCharsArray(word);

        printArray(letters);

        System.out.println(isInArray(letters, 'А'));

    }

    public static void printArray (char[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // Метод преобразует строку в массив символов

    public static char[] stringToCharsArray(String string) {
        char[] letters = new char[string.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = string.charAt(i);
        }
        return letters;
    }

    // Метод проверяет, имеется ли символ в массиве, и возвращает true / false
    public static boolean isInArray (char[] array, char character) {
        if (array == null) return false;
        if (array.length == 0) return false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == character) return true;
        }
        return false;
    }

//    public static int countVowels

}