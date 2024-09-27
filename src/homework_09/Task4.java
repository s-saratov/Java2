package homework_09;

/*
Task4
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:

1
12
123
1234
12345
123456
 */

public class Task4 {

    public static void main(String[] args) {

        String numStr = "";
        int i = 1;

        do {
            numStr = numStr.concat(String.valueOf(i++));
            System.out.println(numStr);
        } while (i < 7);

    }

}