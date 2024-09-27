package homework_09;

/*
Task 3

Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые числа.
Посчитайте сколько получилось таких чисел в массиве.
Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[50];
        int primeNumbersQuantity = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
            if (isPrimeNumber(numbers[i])) primeNumbersQuantity++;
        }

        System.out.print("Простые числа в массиве: ");

        int j = 0; // счётчик, помогающий расставить знаки препинания между числами

        for (int i = 0; i < numbers.length; i++) {
            if (isPrimeNumber(numbers[i])) {
                System.out.print(numbers[i] + ((j++ != primeNumbersQuantity - 1) ? ", " : "."));
            }
        }

        System.out.println("\nОбщее количество простых числе в массиве: " + primeNumbersQuantity + ".");

    }

    // Метод проверяет, является ли переданное число простым, и возвращает true / false

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) if (number % i == 0) return false;
        return true;
    }

}