package homework_06;

/*
Task 4

1. Попросите пользователя ввести целое число с клавиатуры.
2. Ваша программа должна вывести строку в формате:
        Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
        Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
3. Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        boolean numberIsEven = number % 2 == 0;
        boolean numberIsMultipleOf3 = number % 3 == 0;

        System.out.println("Число: " + number + " чётное: " + numberIsEven + "; кратно 3: "
                + numberIsMultipleOf3 + "; чётное и кратно 3: " + (numberIsEven & numberIsMultipleOf3));

    }
}
