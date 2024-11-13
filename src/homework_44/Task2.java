package homework_44;

/*
Task 2

Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task2 {

    public static void main(String[] args) {

        // Создаём список строк
        List<String> strings = Arrays.asList(
                "apple",
                "banana",
                "cherry",
                "date",
                "elderberry",
                "fig",
                "grape",
                "honeydew",
                "kiwi",
                "lemon"
        );

        // Выводим изначальный список в консоль
        System.out.println("Изначальный список строк: " + strings);

        // Находим минимальную строку с помощью Stream API
        Optional<String> shortestString = strings.stream()
                .min(Comparator.comparingInt(String::length));

        // Выводим найденную строку в консоль
        System.out.print("Строка с минимальной длиной: ");
        shortestString.ifPresent(System.out::println);

    }
}