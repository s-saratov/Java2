package lesson_22.staticPoly;

public class Calculator {

    /*
    Статический полиморфизм - полиморфизм времени компиляции.
    Он достигается в помощью перегрузки методов.
     */

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int summ = Calculator.add(15, 29);
    }
}