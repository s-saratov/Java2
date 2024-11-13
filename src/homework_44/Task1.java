package homework_44;

/*
Task 1

Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        // Создаём список из 25 случайных чисел в диапазоне от -1000 до 1000

        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            randomNumbers.add(random.nextInt(2001) - 1000);
        }

        // Выводим созданный список в консоль

        System.out.println("Двадцать пять случайных чисел в диапазоне от -1000 до 1000: " + randomNumbers);

        // Фильтруем и сортируем коллекцию с помощью Stream API
        List<Integer> filteredList = randomNumbers.stream()
                .filter(i -> i > 10)                    // фильтруем по значению: больше 10
                .sorted((i1, i2) -> i1 % 10 - i2 % 10)  // сортируем по значению последней цифры
                .collect(Collectors.toList());

        // Выводим список в консоль
        System.out.println("\nОтфильтрованный список (числа от 10), отсортированный по значению последней цифры: " + filteredList);

    }

}