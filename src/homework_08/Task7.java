package homework_08;

/*
Task 7

Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

Пример:
{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */

import java.util.Random;

public class Task7 {

    public static void main(String[] args) {

        // Массив аналогичен массиву из предыдущей задачи

        Random random = new Random();

        int[] numbers = new int[random.nextInt(11) + 5];

        int i = 0;

        while (i < numbers.length) {
            numbers[i] = random.nextInt(101) - 50;
            i++;
        }

        System.out.print("{ ");

        int j = 0;
        int min = numbers[j];
        int minIndex = 0;
        int max = numbers[j];
        int maxIndex = 0;

        while (j < numbers.length) {
            System.out.print(numbers[j] + ((j != numbers.length - 1) ? ", " : " } -> { "));
            minIndex = (min > numbers[j]) ? j : minIndex;
            min = (min > numbers[j]) ? numbers[j] : min;
            maxIndex = (max < numbers[j]) ? j : maxIndex;
            max = (max < numbers[j]) ? numbers[j] : max;
            j++;
        }

        int[] numbers2 = numbers;

        numbers2[minIndex] = max;
        numbers2[maxIndex] = min;
        j = 0;

        while (j < numbers2.length) {
            System.out.print(numbers2[j] + ((j != numbers2.length - 1) ? ", " : " }"));
            j++;
        }

    }

}