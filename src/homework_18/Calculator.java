package homework_18;

/*
Task 1
Класс "Калькулятор"

Создайте класс Calculator, который будет предоставлять базовые арифметические операции:
сложение, вычитание, умножение и деление.

Класс должен содержать статические методы для каждой математической операции, принимающие два аргумента
и возвращающие результат операции.
 */

public class Calculator {

    // Метод сложения (с перегрузками)

    public static int addition (int a, int b) {
        return a + b;
    }

    public static long addition (long a, long b) {
        return a + b;
    }

    public static float addition (float a, float b) {
        return a + b;
    }

    public static double addition (double a, double b) {
        return a + b;
    }

    // Метод вычитания (с перегрузками)

    public static int subtraction (int diminutive, int deductible) {
        return diminutive - deductible;
    }

    public static long subtraction (long diminutive, long deductible) {
        return diminutive - deductible;
    }

    public static float subtraction (float diminutive, float deductible) {
        return diminutive - deductible;
    }

    public static double subtraction (double diminutive, double deductible) {
        return diminutive - deductible;
    }

    // Метод умножения (с перегрузками)

    public static int multiplication (int a, int b) {
        return a * b;
    }

    public static long multiplication (long a, long b) {
        return a * b;
    }

    public static float multiplication (float a, float b) {
        return a * b;
    }

    public static double multiplication (double a, double b) {
        return a * b;
    }

    // Метод деления

    public static int division (int divisible, int divider) {
        return divisible / divider;
    }

    public static long division (long divisible, long divider) {
        return divisible / divider;
    }

    public static float division (float divisible, float divider) {
        return divisible / divider;
    }

    public static double division (double divisible, double divider) {
        return divisible / divider;
    }

}
