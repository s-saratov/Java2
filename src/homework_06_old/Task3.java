package homework_06_old;

/*
Task 3

Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четырёхзначное число: ");
        String strNum = scanner.nextLine();

        if ((strNum.length() == 4) && Character.isDigit(strNum.charAt(0)) && Character.isDigit(strNum.charAt(1)) && Character.isDigit(strNum.charAt(2)) && Character.isDigit(strNum.charAt(3))) {

            int sum1 = charToInt(strNum.charAt(0)) + charToInt(strNum.charAt(1));
            int sum2 = charToInt(strNum.charAt(2)) + charToInt(strNum.charAt(3));

            if (sum1 == sum2) System.out.println("Введённое число - счастливое");
            else System.out.println("Введённое число - несчастливое");
        }

        else System.out.println("Введённое значение не является четырёхзначным числом");

    }

    public static int charToInt(char num) {

        int convNum = 0;

        if (num == 48) convNum = 0;
        if (num == 49) convNum = 1;
        if (num == 50) convNum = 2;
        if (num == 51) convNum = 3;
        if (num == 52) convNum = 4;
        if (num == 53) convNum = 5;
        if (num == 54) convNum = 6;
        if (num == 55) convNum = 7;
        if (num == 56) convNum = 8;
        if (num == 57) convNum = 9;

        return convNum;

    }

}
