package common;

import java.util.Random;

public class Utils {

    // Метод выводит на экран длину переданной строки (написан в homework09\Task0)

    public static void printStringLength (String str) {
        System.out.printf("Длина строки составляет %d символов.\n", str.length());
    }

    // Метод выводит на экран массив целых чисел типа int (написан в homework09\Task1)

    public static void printArray (int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // Метод выводит на экран массив символов (написан для homework14\Task4)

    public static void printArray (char[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // Метод выводит на экран массив строк (написан в homework10\Task2)

    public static void printArray (String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print("\"" + array[i] + "\"" + ((i < array.length - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // Метод создаёт массив размера size, состоящий из целых чисел типа int в диапазоне от 0 до 100
    // (написан в homework10\Task1)

    public static int[] generateIntArray (int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(101);
        return array;
    }

    // Метод проверяет, имеется ли заданное число типа int в массиве, и возвращает true / false
    // (написан в homework10\Task1)

    public static boolean isInArray (int[] array, int number) {
        if (array == null) return false;
        if (array.length == 0) return false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return true;
        }
        return false;
    }

    // Метод проверяет, имеется ли символ в массиве, и возвращает true / false
    // (написан в homework14\Task4)

    public static boolean isInArray (char[] array, char character) {
        if (array == null) return false;
        if (array.length == 0) return false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == character) return true;
        }
        return false;
    }

    // Метод возвращает индекс минимального элемента в массиве целых чисел типа int (написан в homework10\Task4_2nd_variant)

    public static int findIndexOfMinimalElement (int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) index = (array[index] < array[i]) ? index : i;
        return index;
    }

    // Метод возвращает индекс минимального элемента в части массива целых чисел типа int
    // от startIndex и до конца массива (написан в lesson12\ArrayUtils)

    public static int findIndexOfMinimalElement (int[] array, int startIndex) {
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) index = (array[index] < array[i]) ? index : i;
        return index;
    }

    // Метод осуществляет линейный поиск элемента в массиве целых чисел типа int и возвращает его индекс
    // (если элемент найден), либо - 1 (если элемент не найден) (написан в lesson_12\ArrayUtils)

    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) return i;
        }
        return -1;
    }

    // Метод осуществляет бинарный поиск элемента в массиве целых чисел типа int и возвращает его индекс
    // (если элемент найден), либо - 1 (если элемент не найден) (написан в lesson_12\ArrayUtils)

    public static int binarySearch (int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        while (startIndex <= endIndex) { // 1. 0 <= 12
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == searchValue) return middleIndex;
            if (array[middleIndex] > searchValue) endIndex = middleIndex - 1;
            else startIndex = middleIndex + 1;
        }
        return -1;
    }

    // Метод меняет между собой два элемента массива целых чисел типа int (написан в homework09\Task1)

    public static void swapArrayElements (int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    // Метод расставляет в обратном порядке элементы массива целых чисел типа int (написан в homework09\Task1)

    public static void reverseArray(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) swapArrayElements(array, i, array.length - (1 + i));
    }

    // Метод сортирует выбором переданный массив целых чисел типа int (написан в homework10\Task4)

    public static void selectionSortArray (int[] array) {

        for (int i = 0; i < array.length; i++) {
            int localMain = findIndexOfMinimalElement(array, i);
            swapArrayElements(array, localMain, i);
        }
    }

    // Метод сортирует пузырьком переданный массив целых чисел типа int (написан в homework10\Task4)

    public static void bubbleSortArray (int[] array) {
        for (int i = 0 ; i < (array.length - 1); ++i) {
            for (int j = 0 ; j < (array.length - 1); ++j) {
                if (array[j] > array[j + 1]) swapArrayElements(array, j, j+1);
            }
        }
    }

    // Метод принимает массив целых чисел (типа int) и возвращает новый, размерности index,
    // куда копируются элементы первоначального (написан в homework10\Task1)

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

    // Метод объединяет два массива целых чисел типа int (написан в homework10\Task4)

    public static int[] mergeArrays (int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) array3[i] = array1[i];
        for (int i = array1.length; i < array3.length; i++) array3[i] = array2[i - array1.length];
        return array3;
    }

    // Метод возвращает первый элемент массива строк, не являющийся null (написан в homework10\Task2)

    public static String findFirstNotNullValue(String[] string) {
        for (int i = 0; i < string.length; i++) {
            if (string[i] != null) return string[i];
        }
        return null;
    }

    // Метод возвращает сумму всех элементов массива целых чисел типа int (написан в homework11\Task1)

    public static int sumArrayElements (int[] array) {
        if (array == null) {
            System.out.println("ОШИБКА! Направлен некорректный массив (null). Завершение программы.");
            System.exit(0);
            return -2147483648;
        }
        if (array.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) sum += array[i];
        return sum;
    }

    // Метод возвращает среднее арифметическое всех элементов массива целых чисел типа int (написан в homework11\Task1)

    public static double findArithmeticMeanOfArrayElements (int[] array) {
        if (array == null) {
            System.out.println("ОШИБКА! Направлен некорректный массив (null). Завершение программы.");
            System.exit(0);
            return -2147483648;
        }
        if (array.length == 0) {
            System.out.println("ОШИБКА! Направлен пустой массив. Вычисление среднего арифметического невозможно" +
                    " (деление на ноль). Завершение программы.");
            System.exit(0);
            return -2147483648;
        }
        return (double) sumArrayElements(array) / array.length;
    }

    // Метод принимает целое число типа int и возвращает количество повторений этого числа в массиве
    // (написан в homework11\Task4)

    public static int countNumberInArray (int[] array, int n) {
        if (array == null) return 0;
        if (array.length == 0) return 0;
        if(!isInArray(array, n)) return 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) number++;
        }
        return number;
    }

    // Метод принимает целое число типа int и возвращает массив, из которого удалены все повторения этого числа
    // (написан в homework11\Task4)

    public static int[] deleteFromArray (int[] array, int number) {

        if (array == null) return new int[0];
        if (array.length == 0) return new int[0];
        if(!isInArray(array, number)) return array;

        int[] newArray = new int[array.length - countNumberInArray(array, number)];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != number) newArray[j++] = array[i];
            else continue;
        }

        return newArray;
    }

    // Метод преобразует строку в массив символов (написан в homework13\Task4)

    public static char[] stringToCharsArray(String string) {
        char[] letters = new char[string.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = string.charAt(i);
        }
        return letters;
    }

    // Метод возвращает количество английских гласных букв в строке (написан в homework13\Task4)

    public static int countVowels (String string) {
        if (string == null) return 0;
        if (string.length() == 0) return 0;
        char[] vowels = new char[] {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        int number = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isInArray(vowels, string.charAt(i))) number++;
        }
        return number;
    }

    // Метод возвращает количество английских согласных букв в строке (написан в homework13\Task4)

    public static int countConsonants (String string) {
        if (string == null) return 0;
        if (string.length() == 0) return 0;
        char[] consonants = new char[]{'b', 'B', 'c', 'C', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J',
                'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T',
                'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z'};
        int number = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isInArray(consonants, string.charAt(i))) number++;
        }
        return number;
    }

    // Метод возводит целое число base в степень exponent и возвращает результат (написан в homework09\Task2)

    public static double take2Power (int base, int exponent) {
        double result = 1;
        int modExp = (exponent > 0) ? exponent : exponent * -1;
        for (int i = 0; i < modExp; i++) result *= base;
        if (exponent < 0) return 1.0 / result;
        else return result;
    }

    // Метод проверяет, является ли переданное число простым, и возвращает true / false (написан в homework09\Task3)

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) if (number % i == 0) return false;
        return true;
    }

}
