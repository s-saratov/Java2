package homework_44;

/*
Task 2

Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        // Создаём список строк
        List<String> strings = Arrays.asList(
                "apple",
                null,
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
                .filter(Objects::nonNull)
                .min(Comparator.comparingInt(String::length));

        // Выводим найденную строку в консоль
        System.out.print("Строка с минимальной длиной: ");
        shortestString.ifPresent(System.out::println);

        /*
        Код преподавателя:

        if (optionalString.isPresent()) {
            System.out.println("isPresent: " + optionalString.get());
        } else {
            System.out.println("Что-то пошло не так");
        }

        System.out.println(optionalString.orElse("что-то пошло не так (else)"));

        // ifPresent
        optionalString.ifPresent(string -> System.out.println("ifPresent: " + string));

        //ifPresentOrElse
        optionalString.ifPresentOrElse(str -> System.out.println("ifPresentOrElse: " + str), () -> System.out.println("Строк не найдено"));

         */

    }
}