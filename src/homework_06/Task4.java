package homework_06;

/*
Task 4

Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.

public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
    }
}
 */

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Предполагаемый вывод консоли:\n");
        System.out.println("Result 1: true");
        System.out.println("Result 2: true");
        System.out.println("Result 3: false");
        System.out.println("Result 4: true");
        System.out.println("Result 5: false");

    }

}
