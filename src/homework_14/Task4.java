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

        System.out.println("Number of vowel letters:\t\t" + countVowels(word));
        System.out.println("Number of consonant letters:\t" + countConsonants(word));
        System.out.println("Number of other characters:\t\t" + (word.length() - (countVowels(word) + countConsonants(word))));

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

    // Теория о том, какие буквы в английском языке относятся к гласным и согласным,
    // взята отсюда: https://www.bbc.co.uk/bitesize/articles/z6dcvwx#zkt6ywx

    // Метод возвращает количество английских гласных букв в строке
    public static int countVowels (String string) {
        if (string == null) return 0;
        if (string.length() == 0) return 0;
        char[] vowels = new char[] {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        int number = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isInArray(vowels, string.charAt(i))) number++;
        }
        return number;
    }

    // Метод возвращает количество английских согласных букв в строке
    public static int countConsonants (String string) {
        if (string == null) return 0;
        if (string.length() == 0) return 0;
        char[] consonants = new char[] {'b', 'B', 'c', 'C', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J',
                'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T',
                'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z'};
        int number = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isInArray(consonants, string.charAt(i))) number++;
        }
        return number;
    }

}
