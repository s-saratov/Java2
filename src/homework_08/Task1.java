package homework_08;

/*
Task 1

Найдите произведение всех чисел от 1 до 15 включительно.
Результат выведите на экран.
 */

public class Task1 {

    public static void main(String[] args) {

        long res = 1;
        long i = 1;

        while (i <= 14) {
            i++;
            res *= i;
            System.out.println(res / i + " * " + i + " = " + res); // Строка для проверки, её можно закомментировать
        }

        System.out.println("\nПроизведение всех чисел от 1 до 15 включительно составляет: " + res);

    }

}