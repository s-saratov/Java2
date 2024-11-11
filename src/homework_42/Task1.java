package homework_42;

/*
Task 1

Напишите программу, которая проверяет, являются ли две заданные строки анаграммами (то есть содержат ли они одинаковые буквы в разном порядке).

Инструкции:
- Используйте HashMap<Character, Integer> для подсчета количества каждого символа в строках.
- Сравните две карты, чтобы определить, являются ли строки анаграммами.

P.S.
Метод equals() для карт в Java сравнивает карты на основе их содержимого — пар ключ-значение
— независимо от порядка ключей.

Это означает, что если две карты содержат одинаковые пары ключ-значение, то метод equals() вернет true, даже если
порядок добавления или хранения этих пар различается.

Анаграммы — это слова или фразы, составленные из одних и тех же букв в разном порядке.
То есть, две строки являются анаграммами, если они содержат одинаковые символы с одинаковой частотой.

Примеры:
- “listen” и “silent” — анаграммы.
- “triangle” и “integral” — анаграммы.
- “apple” и “papel” — анаграммы.
- “hello” и “billion” — не анаграммы.
 */

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Проверяем, являются ли анаграммами следующие строки:");
        System.out.println("\t1. “listen” и “silent”: "
                + (isAnagram("listen", "silent") ? "являются;" : "не являются;"));
        System.out.println("\t2. “triangle” и “integral”: "
                + (isAnagram("triangle", "integral") ? "являются;" : "не являются;"));
        System.out.println("\t3. “apple” и “papel”: "
                + (isAnagram("apple", "papel") ? "являются;" : "не являются;"));
        System.out.println("\t4. “hello” и “billion”: "
                + (isAnagram("hello", "billion") ? "являются;" : "не являются;"));
        System.out.println("\t5. “New York Times” и “monkeys write”: "
                + (isAnagram("New York Times", "monkeys write") ? "являются;" : "не являются;"));
        System.out.println("\t6. “McDonald's restaurants” и “Uncle Sam's standard rot”: "
                + (isAnagram("McDonald's restaurants", "Uncle Sam's standard rot") ? "являются." : "не являются."));

    }


    private static boolean isAnagram(String str1, String str2) {

        // Создаём карты строк

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // Очищаем строки от ненужных символов и приводим к нижнему регистру

        str1 = str1.trim().toLowerCase().replaceAll("[^a-zA-Zа-яА-Я]", "");
        str2 = str2.trim().toLowerCase().replaceAll("[^a-zA-Zа-яА-Я]", "");

        // Заполняем карты

        for (char ch : str1.toCharArray()) {
            Integer count = map1.get(ch);
            if (count == null) count = 0;
            map1.put(ch, count + 1);
        }

        for (char ch : str2.toCharArray()) {
            Integer count = map2.get(ch);
            if (count == null) count = 0;
            map2.put(ch, count + 1);
        }

        // Возвращаем результат сравнения

        return map1.equals(map2);
    }

}