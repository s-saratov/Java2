package lesson_08;

import java.util.Random;

public class ArraysExample {

    public static void main(String[] args) {

        int[] arrays; // Объявление массива целых чисел
        String[] strings; // Объявление массива строк
        int array1[]; // Альтернативный способ объявления массива. НЕ РЕКОМЕНДУЕТСЯ использовать

        arrays = new int[4]; // Создание (инициализация) массива типа int с 4 ячейками
        strings = new String[10]; // Создание массива строк на 10 ячеек

        int[] array2 = new int[8]; // Объявления и инициализация массива int c 8 ячейками
        boolean[] booleans = new boolean[3]; // false, false, false

        /*
        Значения по умолчанию. При создании массивов ячейки заполняются значениями по умолчанию
        1. Для всех числовых типов (в т.ч. для типа char) это будет 0 (0.0)
        2. Для типа boolean это false
        3. Для всех ссылочных типов данных - null (ничто)
         */

        int value = arrays[0]; // получить из массива значение, находящееся в ячейке с индексом 0
        System.out.println("value: " + value);
        System.out.println("array2[3]: " + array2[3]);
        System.out.println("strings[9]: " + strings[9]);
        System.out.println("booleans[1]: " + booleans[1]);

        // Распечатать все значение в массиве так не получится
        System.out.println("arrays: " + arrays); // Получим ссылку на адрес в ячейке в памяти в Heap (куче)

        // Явная инициализация массива
        int[] numbers = new int[] {45, 56, -16, 0, 159};
        int[] ints = {-10, 54, 32333, 444};

        int val = numbers[0];
        System.out.println("val: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100; // Присвоение нового значения в ячейку с индексом 2

        System.out.print("\nВывести все значения массива: ");
        int j = 0;
        while (j < numbers.length) System.out.print(numbers[j++] + "; ");
        System.out.println();

        // Создать массив на 10 элементов и заполнить его случайными числами от 0 до 100

        Random random = new Random();

        int[] nums = new int[10];
        int k = 0;
        System.out.print("\n[");
        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.print(nums[k] + ", ");
            k++;
        }
        System.out.println("]");

        int min = nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) min = nums[i];
            i++;
        }

        System.out.println("Минимальное значение в массиве: " + min);

    }
}