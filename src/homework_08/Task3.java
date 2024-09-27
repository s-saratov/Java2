package homework_08;

/*
Task 3

Используйте цикл while для решения задачи:
Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.

Task 3.1

Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
 */

public class Task3 {

    public static void main(String[] args) {

        System.out.print("Числа от 1 до 100, которые делятся на 5 без остатка:\t\t\t");

        int i = 1;

        while (i <= 100) {
            if (i % 5 == 0)
                System.out.print(i + ((i != 100) ? ", " : ".")); // Тернарный оператор нужен, чтобы в конце строки поставить не запятую, а точку
            i++;
        }

        // Task 3.1

        System.out.print("\nПервые 7 чисел от 1 до 100, которые делятся на 5 без остатка:\t");

        i = 1;
        int counter = 1;

        while (i <= 100 & counter < 8) {

            if (i % 5 == 0) {
                System.out.print(i + ((counter != 7) ? ", " : "."));
                counter++;
            }
            i++;
        }

    }

}