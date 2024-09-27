package lesson_07;

import java.util.Scanner;

public class printf_print {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        boolean numberIsEven = number % 2 == 0;
        boolean numberIsMultipleOf3 = number % 3 == 0;

        // printf()
        /*
        %d - целое число
        %f - число с плавающей точкой
        %s - строка
        %n - символ новой строки
        \n - универсальный символ новой строки
         */

        System.out.printf("Число %d чётное: %s; кратно 3: %s; чётное и кратное 3: %s", number, numberIsEven, numberIsMultipleOf3, (numberIsEven && numberIsMultipleOf3));

    }

}
