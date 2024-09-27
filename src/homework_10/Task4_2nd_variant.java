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

public class Task4_2nd_variant {

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

        System.out.printf("%d-й элемент объединённого отсортированного массива хранит значение %d", number, findSpecifiedElement(arr3, number));

    }

    // Метод объединяет два массива целых чисел типа int
    public static int[] mergeArrays (int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) array3[i] = array1[i];
        for (int i = array1.length; i < array3.length; i++) array3[i] = array2[i - array1.length];
        return array3;
    }

    // Метод возвращает индекс минимального элемента в массиве целых чисел типа int
    public static int findIndexOfMinimalElement (int[] array) {
        int index = 0;
        for (int j = 0; j < array.length; j++) index = (array[index] < array[j]) ? index : j;
        return index;
    }

    // Метод находит элемент массива целых чисел типа int, являющийся index-ным в порядке возрастания значений элементов
    // Для этого он (index - 1) раз находит в неотсортированном массиве минимальные значения и заменяет их на
    // максимальное значение диапазона типа int. Следующее минимальное значение в массиве является искомым.
    public static int findSpecifiedElement (int[] array, int index) {
        int[] testArray = array.clone();
        for (int i = 0; i < index - 1; i++) {
            testArray[findIndexOfMinimalElement(testArray)] = 2_147_483_647;
        }
        return testArray[findIndexOfMinimalElement(testArray)];
    }

}