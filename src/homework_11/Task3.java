package homework_11;

/*
Task 3

Написать метод, который проверяет, является ли массив палиндромом (читается одинаково с обоих концов).
 */

public class Task3 {


    public static void main(String[] args) {

        int[] arr1 = new int[] {1, 2, 3, 4, 3, 2, 1};

        System.out.print("Массив: ");
        printArray(arr1);
        System.out.println("↓");
        System.out.println((isPalindrome(arr1)) ? "является палиндромом" : "не является палиндромом");

        int[] arr2 = new int[] {1, 2, 3, 3, 2, 1};

        System.out.print("\nМассив: ");
        printArray(arr2);
        System.out.println("↓");
        System.out.println((isPalindrome(arr2)) ? "является палиндромом" : "не является палиндромом");

        int[] arr3 = new int[] {1, 2, 3, 2, 8};

        System.out.print("\nМассив: ");
        printArray(arr3);
        System.out.println("↓");
        System.out.println((isPalindrome(arr3)) ? "является палиндромом" : "не является палиндромом");

    }

    public static boolean isPalindrome (int[] array) {
        for (int i = 0, j = (array.length - 1); i < (array.length / 2); i++, j--) {
            if (array[i] != array[j]) return false;
        }
        return true;
    }

    // Метод выводит на экран массив целых чисел типа int

    public static void printArray (int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : ""));
        System.out.print("]\n");
    }

}
