package homework_44;

/*
Task3

Имеется список целых чисел.
Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2,
и собрать результат в новый список.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        // Создаём список из 10 случайных чисел в диапазоне от -100 до 100

        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(201) - 100);
        }

        // Выводим созданный список в консоль

        System.out.println("Десять случайных чисел в диапазоне от -100 до 100: " + randomNumbers);

        // Фильтруем и сортируем коллекцию с помощью Stream API
        List<Integer> filteredList = randomNumbers.stream()
                .filter(i -> i % 2 == 0)                // фильтруем по значению: чётные
                .map(i -> i * 2)                        // умножаем элементы списка на 2
                .collect(Collectors.toList());

        // Выводим список в консоль
        System.out.println("\nОтфильтрованный и изменённый список (чётные числа, умноженные на два): " + filteredList);

    }

}