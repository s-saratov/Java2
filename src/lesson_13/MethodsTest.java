package lesson_13;

import java.util.Scanner;

public class MethodsTest {

    public static void main(String[] args) {

        int[] testArray = common.Utils.generateIntArray(10);

        System.out.print("Default array: ");
        common.Utils.printArray(testArray);

        System.out.println(common.Utils.findIndexOfMinimalElement(testArray));
        common.Utils.selectionSortArray(testArray);

        System.out.print("Sorted array: ");
        common.Utils.printArray(testArray);
        System.out.println(common.Utils.findIndexOfMinimalElement(testArray, 5));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите искомое значение: ");
        int value = scanner.nextInt();
        scanner.nextLine();

        int pos = common.Utils.linearSearch(testArray, value);
        System.out.println((pos >= 0) ? ("Элемент занимает позицию № " + pos) : "Данное значение в массиве отсутствует");

    }

}
