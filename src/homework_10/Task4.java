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

public class Task4 {

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

        int[] arr3 = mergeArrays(arr1, arr2);

        bubblesortArray(arr3);

        System.out.print("Объединённый отсортированный массив: ");
        printArray(arr3);

        System.out.printf("%d-й элемент объединённого отсортированного массива хранит значение %d", number, arr3[number - 1]);

    }

    // Метод объединяет два массива целых чисел типа int

    public static int[] mergeArrays (int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) array3[i] = array1[i];
        for (int i = array1.length; i < array3.length; i++) array3[i] = array2[i - array1.length];
        return array3;
    }

    // Метод меняет между собой два элемента массива целых чисел типа int
    public static void swapArrayElements (int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    // Метод осуществляет сортировку пузырьком переданного массива целых чисел типа int
    public static void bubblesortArray (int[] array) {
        for (int i = 0 ; i < (array.length - 1); ++i) {
            for (int j = 0 ; j < (array.length - 1); ++j) {
                if (array[j] > array[j + 1]) swapArrayElements(array, j, j+1);
            }
        }
    }

    // Метод выводит на экран массив целых чисел типа int
    public static void printArray (int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
    }

}



