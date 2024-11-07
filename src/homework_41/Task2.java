package homework_41;

import java.util.HashMap;
import java.util.Map;

/*
Task2

Напишите метод, возвращающий частотный словарь вхождения символов в строку
 */

public class Task2 {

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = getWordFrequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = getCharsFrequencyDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }

    private static Map<Character, Integer> getCharsFrequencyDictionary(String text) {
        Map<Character, Integer> result = new HashMap<>();

        for (char ch : text.toCharArray()) {
            Integer count = result.get(ch);
            if (count == null) count = 0;
            result.put(ch, count + 1);
        }
        return result;
    }

    public static Map<String, Integer> getWordFrequencyDictionary(String string) {

        // Преобразуем строку в массив слов
        String newString = string.trim().replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        String[] words = newString.toLowerCase().split("\\s+");

        // Создаём карту для хранения результата
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            Integer count = result.get(word); // создаём переменную для хранения значений
            if (count == null) count = 0;
            result.put(word, count + 1);
        }

        return result;

    }

}