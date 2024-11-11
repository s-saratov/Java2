package homework_43;

/*
Task 1

Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
четные, больше 10 и меньше 100
Для фильтрации используйте Stream API
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {


        // Создаём список из 20 случайных чисел в диапазоне от 0 до 200

        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(201));
        }

        // Выводим созданный список в консоль

        System.out.println("Двадцать случайных чисел в диапазоне от 0 до 200: " + randomNumbers);

        // Применяем к списку метод фильтрации и выводим полученный список в консоль

        System.out.println("\nОтфильтрованный список (чётные числа в диапазоне от 12 до 98): " + filterNumberList(randomNumbers));

    }

    public static List<Integer> filterNumberList(List<Integer> numbers) {

        // Фильтруем коллекцию с помощью Stream API
        List<Integer> filteredList = numbers.stream()
                .filter(i -> i > 10 && i < 100 && i % 2 == 0)   // фильтр условий: чётные, больше 10 и меньше 100
                .collect(Collectors.toList());

        return filteredList;
    }

}