package homework_19;

/*
Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания

Класс Calculator, который будет предоставлять:
    - базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ);
    - Вычисление длины окружности и площади круга по ее радиусу.


Класс должен содержать:
    - статические методы для каждой математической операции, принимающие два аргумента
    и возвращающие результат операции (сделано в прошлом ДЗ);
    - методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат:
    - константу (число Пи);
 */

public class Calculator {

    // Константа:

    public static final double PI = 3.141592653589793; // число Пи

    // Методы:

    // 1. Сложение (с перегрузками):

    public static int add (int a, int b) {
        return a + b;
    }

    public static long add (long a, long b) {
        return a + b;
    }

    public static float add (float a, float b) {
        return a + b;
    }

    public static double add (double a, double b) {
        return a + b;
    }

    // 2. Вычитание (с перегрузками):

    public static int subtract (int diminutive, int deductible) {
        return diminutive - deductible;
    }

    public static long subtract (long diminutive, long deductible) {
        return diminutive - deductible;
    }

    public static float subtract (float diminutive, float deductible) {
        return diminutive - deductible;
    }

    public static double subtract (double diminutive, double deductible) {
        return diminutive - deductible;
    }

    // 3. Умножение (с перегрузками):

    public static int multiply (int a, int b) {
        return a * b;
    }

    public static long multiply (long a, long b) {
        return a * b;
    }

    public static float multiply (float a, float b) {
        return a * b;
    }

    public static double multiply (double a, double b) {
        return a * b;
    }

    // 4. Деление (с перегрузками):

    public static int divide (int divisible, int divider) {
        if (divider == 0) return Integer.MAX_VALUE;
        return divisible / divider;
    }

    public static long divide (long divisible, long divider) {
        if (divider == 0) return Long.MAX_VALUE;
        return divisible / divider;
    }

    public static float divide (float divisible, float divider) {
        return divisible / divider;
    }

    public static double divide (double divisible, double divider) {
        return divisible / divider;
    }

    // 5. Вычисление длины окружности (с перегрузками):

    public static double getCircumference(int radius) {
        if (radius < 0) return 0.0;
        return 2 * PI * radius;
    }

    public static double getCircumference(long radius) {
        if (radius < 0) return 0.0;
        return 2 * PI * radius;
    }

    public static double getCircumference(float radius) {
        if (radius < 0) return 0.0;
        return 2 * PI * radius;
    }

    public static double getCircumference(double radius) {
        if (radius < 0) return 0.0;
        return 2 * PI * radius;
    }

    // 6. Вычисление площади круга (с перегрузками):

    public static double getCircleArea(int radius) {
        if (radius < 0) return 0.0;
        return PI * radius * radius;
    }

    public static double getCircleArea(long radius) {
        if (radius < 0) return 0.0;
        return PI * radius * radius;
    }

    public static double getCircleArea(float radius) {
        if (radius < 0) return 0.0;
        return PI * radius * radius;
    }

    public static double getCircleArea(double radius) {
        if (radius < 0) return 0.0;
        return PI * radius * radius;
    }

}