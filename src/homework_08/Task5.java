package homework_08;

/*
Task 5

Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.

Пример:
567432 -> 5+6+7+4+3+2 -> 27
 */

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите произвольное число: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        int digNum = String.valueOf(number).length(); // Получаем количество разрядов введённого числа

        int[] digits = new int[digNum];

        int i = digNum;
        int j = 0;
        int numToDiv = number; // Копия числа для его дальнейшего разделения на разряды

        // Цикл раскладывает разряды введённого пользователем числа в массив digits[]
        while (i > 0) {
            digits[j] = numToDiv / (int) Math.pow(10, i - 1);   // Делим число на 10 в текущей степени, получаем верхний разряд
            numToDiv -= digits[j] * (int) Math.pow(10, i - 1);  // "Откусываем" верхний разряд
            i--;
            j++;
        }

        System.out.print("\n" + number + " -> ");

        int k = 0;
        int sum = 0;

        while (k < digNum) {
            System.out.print(digits[k] + ((k != digNum - 1) ? " + " : " = "));
            sum += digits[k];
            k++;
        }

        System.out.print(sum);

    }

}