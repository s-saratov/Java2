package homework_06;

/*
Task 2

Создайте две переменные типа int:
    - В первую переменную запишите случайное значение от 0 до 50.
    - Во вторую переменную случайное значение от 0 до 100.
    - (опционально) Во вторую переменную случайное значение от -20 до 30.

Проверьте:
    - равны ли переменные,
    - не равны ли они,
    - больше ли a, чем b,
    - и меньше ли b, чем a.

Выведите результат на экран.
 */

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        Random random = new Random();

        int a, b;

        a = random.nextInt(51);
        b = random.nextInt(101);
        b = random.nextInt(51) - 20;

        System.out.println("Сгенерированы переменные: a = "+ a + ", b = " + b);

        boolean equal = a == b;
        boolean greater = a > b;

        System.out.println("\n Статусы сравнения:");
        System.out.println("\t a = b: " + equal);
        System.out.println("\t a ≠ b: " + !equal);
        System.out.println("\t a > b: " + greater);
        System.out.println("\t b < a: " + greater);

    }

}