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

        // Получаем значение, ассоциированное ключу "текущее слово"
        for (String word : words) {
            Integer count = result.get(word); // создаём переменную для хранения значений
            if (count == null) count = 0;
            result.put(word, count + 1);
        }

        return result;

    }

    public static Map<String, Integer> getWordFrequencyDictionary2(String string) {

        // Преобразуем строку в массив слов
        String[] words = string.trim()
                .replaceAll("[^a-zA-Z0-9а-яА-Я ]", "")
                .toLowerCase()
                .split("\\s+");

        // Создаём карту для хранения результата
        Map<String, Integer> result = new HashMap<>();

        // Перебираем слова
        for (String word : words) {

            // Пытаемся получить значение, ассоциированное ключу "текущее слово".
            // Если такого ключа нет - вернёт null.
            // Если значения не было - присваиваем 0.

            Integer amount = result.getOrDefault(word, 0);

            // Перезаписываем или записываем новую пару ключ-значение
            result.put(word, ++amount);

        }

        return result;

    }

    public static Map<String, Integer> getWordFrequencyDictionary3(String string) {

        // Преобразуем строку в массив слов
        String[] words = string.trim()
                .replaceAll("[^a-zA-Z0-9а-яА-Я ]", "")
                .toLowerCase()
                .split("\\s+");

        // Создаём карту для хранения результата
        Map<String, Integer> result = new HashMap<>();

        // Перебираем слова
        for (String word : words) {
            /*
            compute(K key, BiFunction<K,V>
            Метод compute позволяет вычислить новое значение для указанного ключа, используя функцию пересчёта.
            Новое значение может зависеть от текущего ключа и его значения
            Если функция вернёт null, то запись удаляется из карты
             */

            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);

            // Аналогично, без тернарного оператора
//            result.compute(word, (key, oldValue) -> {
//                if (oldValue == null) return 1;
//                int newValue = oldValue + 1;
//                return newValue;
//            });

        }

        return result;
    }

    public static Map<String, Integer> getWordFrequencyDictionary4(String string) {

        // Преобразуем строку в массив слов
        String[] words = string.trim()
                .replaceAll("[^a-zA-Z0-9а-яА-Я ]", "")
                .toLowerCase()
                .split("\\s+");

        // Создаём карту для хранения результата
        Map<String, Integer> result = new HashMap<>();

        // Перебираем слова
        for (String word : words) {

            /*
            merge(K key, V value, BiFunction<K, V>
            - Если ключ не существует (или ассоциирован с null), будет добавлена новая пара "ключ + значение (указанное во
            втором параметре)";
            - Если клю есть (ассоциирован не с null), применится функция пересчёта, которая может использовать старое и
            новое значение (value) для вычисления
             */

            result.merge(word, 1, (oldValue, newValue) -> oldValue + newValue);

            // result.merge(word, 1, Integer::sum);

        }

        return result;

    }

}