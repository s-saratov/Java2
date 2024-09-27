package homework_08;

/*
Task 6

Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:
    - Минимальное значение в массиве;
    - Максимальное значение в массиве;
    - Среднее арифметическое всех значений в массиве.
 */

import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[random.nextInt(11) + 5];

        int i = 0;

        while (i < numbers.length) {
            numbers[i] = random.nextInt(101) - 50;
            i++;
        }

        System.out.print("Сгенерированный массив: { ");

        int j = 0;
        int min = numbers[j];
        int max = numbers[j];
        int sum = 0;

        while (j < numbers.length) {
            System.out.print(numbers[j] + ((j != numbers.length - 1) ? ", " : " }"));
            min = (min > numbers[j]) ? numbers[j] : min;
            max = (max < numbers[j]) ? numbers[j] : max;
            sum += numbers[j];
            j++;
        }

        System.out.println("\n\nЗначения в массиве:");
        System.out.println("\t- минимальное:\t\t\t\t" + min);
        System.out.println("\t- максимальное:\t\t\t\t" + max);
        System.out.println("\t- среднее арифметическое:\t" + (float) sum / numbers.length);

    }

}