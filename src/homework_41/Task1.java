package homework_41;

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        String string = "Java is great! Java is powerful, and Java is everywhere.";
        Map<String, Integer> result = getWordFrequencyDictionary(string);

        System.out.println(result);
    }

    // Метод

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