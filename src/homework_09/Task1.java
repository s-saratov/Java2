package homework_09;

/*
Task 1

Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
 */

public class Task1 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Применение обычного метода reverseAndPrintArray(arr1):");
        printArray(arr1);
        System.out.println("↓");
        reverseAndPrintArray(arr1);

        System.out.println("\nПрименение перегруженного метода reverseAndPrintArray(arr2, 3):");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        printArray(arr2);
        System.out.println("↓");
        reverseAndPrintArray(arr2, 3);

        System.out.println("\nПрименение перегруженного метода reverseAndPrintArray(arr3, true):");
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(arr3);
        System.out.println("↓");
        reverseAndPrintArray(arr3, true);

        System.out.println("\nПрименение перегруженного метода reverseAndPrintArray(arr4, false):");
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(arr4);
        System.out.println("↓");
        reverseAndPrintArray(arr4, false);

    }

    // Метод выводит на экран массив целых чисел типа int

    public static void printArray (int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
    }

    // Метод принимает массив целых чисел типа int и распечатывает его в обратной последовательности

    public static void reverseAndPrintArray(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) System.out.print(array[i] + ((i != 0) ? ", " : "]\n"));
    }

    // Метод меняет между собой два элемента массива целых чисел типа int

    public static void swapArrayElements (int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    // Метод расставляет в обратном порядке элементы массива целых чисел типа int

    public static void reverseArray(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) swapArrayElements(array, i, array.length - (1 + i));
    }

    // Перегруженный метод reverseAndPrintArray с индексом

    public static void reverseAndPrintArray(int[] array, int index) {
        int[] partArray = new int[array.length - (index + 1)];
        for (int i = 0; i < partArray.length; i++) partArray[i] = array[i + index];
        reverseArray(partArray);
        for (int i = 0; i < array.length - (index + 1); i++) array[i + index] = partArray[i];
        printArray(array);
    }

    // Перегруженный метод reverseAndPrintArray с флагом

    public static void reverseAndPrintArray(int[] array, boolean flag) {
        if (flag) {
            reverseArray(array);
            printArray(array);
        }
        else printArray(array);
    }
}