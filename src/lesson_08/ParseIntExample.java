package lesson_08;

import java.util.Scanner;

public class ParseIntExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четырёхзначное число: ");
        String strNum = scanner.nextLine();

        int input = Integer.parseInt(strNum);
            System.out.println("input: " + input);

        // 1234
        int digit0 = input % 10;
        input = input / 10;

        // 123
        int digit1 = input % 10;
        input = input / 10;

        // 12
        int digit2 = input % 10;
        int digit3 = input / 10;

        System.out.printf("Числа %d, %d, %d, %d\n", digit0, digit1, digit2, digit3);

    }

}
