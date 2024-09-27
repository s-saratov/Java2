package homework_10;

/*
Task 4

Дано: Два отсортированных массива целых чисел. Вам нужно найти элемент, который будет находиться на k-й позиции в объединенном отсортированном массиве.

Массив 1 - {100, 112, 256, 349, 770}
Массив 2 - {72, 86, 113, 119, 265, 445, 892}
k = 7

Вывод : 256

Можно такой вывод:
72, 86, 100, 112, 113, 119, 256
Искомое число: 256

Объединенный отсортированный массив был бы такой (выводить, формировать его не обязательно) -
[72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]

7-й элемент (по счету) этого массива хранит значение 256.
 */

import java.util.Scanner;

public class Task4_3d_variant {

    public static void main(String[] args) {

        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите номер искомого элемента объединённого массива (от 1 до %d): ", arr1.length + arr2.length);
        int number = scanner.nextInt();
        scanner.nextLine();

        while (number < 1 || number > (arr1.length + arr2.length)) {
            System.out.print("Вы ввели неверный номер. Повторите ввод: ");
            number = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.printf("%d-й элемент объединённого отсортированного массива хранит значение %d", number, findSpecifiedElement(arr1, arr2, number));

    }

    // Метод находит элемент, являющийся index-ным в порядке возрастания значений элементов
    // двух отсортированных массивов целых чисел типа int
    public static int findSpecifiedElement (int[] array1, int[] array2, int index) {

        int[] memory = new int[2]; // В этом массиве хранятся индексы уже сравнённых элементов массивов

        for (int i = 0; i < index - 2; i++) {
            if (array1[memory[0]] <= array2[memory[1]]) memory[0]++;
            else memory[1]++;
        }

        int result = (array1[memory[0]] >= array2[memory[1]]) ? array1[memory[0]] : array2[memory[1]];

        return result;

    }

}