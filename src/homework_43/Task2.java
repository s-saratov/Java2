package homework_43;

/*
Task 2

Дан список строк.
Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A")
и отсортируйте их в алфавитном порядке.
Результат сохраните в новый список строк.
Опционально: + удалите дубликаты из списка строк
 */

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        // Создаём тестовый массив строк
        List<String> fruits = Arrays.asList("Apple", "Apricot", "Banana", "Avocado", "Peach", "apple", "Acai",
                "Orange", "Avocado", "apricot");

        // Фильтруем коллекцию с помощью Stream API
        SortedSet<String> filteredFruits = fruits.stream()
                .map(String::toLowerCase)                           // приводим слова к нижнему регистру
                .filter(s -> s.charAt(0) == 'a')                    // фильтруем по первой букве - латинской A
                .sorted()                                           // сортируем элементы в алфавитном порядке
                .collect(Collectors.toCollection(TreeSet::new));    // сохраняем в виде SortedSet, чтобы удалить дубликаты

        // Передаём SortedSet в List, чтобы соблюсти условие задачи
        List<String> fruits2 = new ArrayList<String>(filteredFruits);

        // Выводим список в консоль
        System.out.println(fruits2);

    }

}