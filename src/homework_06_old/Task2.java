package homework_06_old;

/*
Task 2

1. Запишите в 4 переменные случайные числа от 0 до 100.
2. Выведите все 4 числа на экран.
3. Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();

        int n1, n2, n3, n4;

        n1 = random.nextInt(101);

        do {
            n2 = random.nextInt(101);
        } while (n2 == n1);

        do {
            n3 = random.nextInt(101);
        } while ((n3 == n1) | (n3 == n2));

        do {
            n4 = random.nextInt(101);
        } while ((n4 == n1) | (n4 == n2) | (n4 == n3));

        System.out.println("Сгенерированные числа: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);

        System.out.println("Максимальное число из сгенерированных: " + maxNumber(n1, n2, n3, n4));

    }

    public static int maxNumber(int num1, int num2, int num3, int num4) {

        int maxNumber = 0;

        if ((num1 > num2) && (num1 > num3) && (num1 > num4)) maxNumber = num1;
        else if ((num2 > num1) && (num2 > num3) && (num2 > num4)) maxNumber = num2;
        else if ((num3 > num1) && (num3 > num2) && (num3 > num4)) maxNumber = num3;
        else if ((num4 > num1) && (num4 > num2) && (num4 > num3)) maxNumber = num4;

        return maxNumber;

    }

}
