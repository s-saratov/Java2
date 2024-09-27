package homework_10;

/*
Task 1

Написать метод со следующим функционалом:
На вход метод принимает массив целых чисел и число - длину нового массива.
Метод должен создать и распечатать массив заданной в параметрах длины.

В начало массива должны быть скопированы элементы из входящего массива:
{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}

Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов первого массива: ");
        int size1 = scanner.nextInt();
        scanner.nextLine();

        while (size1 < 0) {
            System.out.print("Вы ввели неверное количество. Повторите ввод: ");
            size1 = scanner.nextInt();
            scanner.nextLine();
        }

        int[] array1 = generateIntArray(size1);

        System.out.print("Созданный массив:\t\t");
        printArray(array1);

        System.out.print("\nВведите количество элементов второго массива: ");
        int size2 = scanner.nextInt();
        scanner.nextLine();

        while (size2 < 0) {
            System.out.print("Вы ввели неверное количество. Повторите ввод: ");
            size2 = scanner.nextInt();
            scanner.nextLine();
        }

        int[] array2 = copyArray(array1, size2);

        System.out.println("↓");
        System.out.print("Скопированный массив:\t");
        printArray(array2);

    }

    // Метод создаёт массив размера size, состоящий из целых чисел типа int в диапазоне от 0 до 100
    public static int[] generateIntArray (int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(101);
        return array;
    }

    // Метод выводит на экран массив целых чисел типа int
    public static void printArray (int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // Метод принимает массив целых чисел (типа int) и возвращает новый, размерности index,
    // куда копируются элементы первоначального
    public static int[] copyArray(int[] array, int index) {

        if (array == null) {
            System.out.println("Ошибка. Передана нулевая ссылка.");
            System.exit(0);
        }

        if (index < 0) {
            System.out.println("Ошибка. Передана отрицательная размерность массива.");
            System.exit(0);
        }

        int[] newArray = new int[index];

        for (int i = 0; i < array.length && i < newArray.length; i++) newArray[i] = array[i];

        return newArray;
    }

}