package homework_42;

/*
Task 2
Подсчет слов по длине

Напишите программу, которая подсчитывает количество слов определённой длины в заданном тексте (строке).

Инструкции:
    - Используйте HashMap<Integer, Integer>, где ключом является длина слова, а значением — количество слов этой длины.
    - Прочитайте текст и обновите карту соответствующим образом.
    - Выведите результаты подсчета.
 */

import java.util.HashMap;

public class Task2 {

    public static void main(String[] args) {


        String string = "Эта программа предназначена для подсчёта количества слов определённой длины. " +
                "Она полезна для анализа текста и статистики.";

        System.out.printf("Текст для проверки: “%s”\n\n", string);

        System.out.println("Результат работы метода:");
        System.out.printf("\u001B[33m%-15s %-15s\u001B[0m\n", "Длина слова:", "Количество слов:");

        getAmountOfWords0fLength(string).forEach((k, v) -> System.out.printf("%-15d %-15d\n", k, v));

        System.out.println();

    }

    private static HashMap<Integer, Integer> getAmountOfWords0fLength (String text) {

        // Создаём массив слов
        String[] words = text.trim().toLowerCase().replaceAll("[^a-zA-Zа-яА-ЯёЁ ]", "").split("\\s+");

        HashMap<Integer, Integer> result = new HashMap<>();

        // Перебираем слова
        for (String word : words) {
            result.compute(word.length(), (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }
            return result;
    }

}