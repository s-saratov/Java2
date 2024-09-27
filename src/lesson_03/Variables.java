package lesson_03;

public class Variables {

    public static void main(String[] args) {

        int myFirstVariable; // Объявление (декларация) переменной типа int

        // Присвоение значения переменной

        myFirstVariable = 1; // Первое присвоение значения в переменную называется инициализацией.

        int mySecondVariable = 25; // Объявление и инициализация в одной строке

        System.out.println(mySecondVariable);

        mySecondVariable = 50; // Присвоение нового значения

        System.out.println("Значение переменной: " + mySecondVariable);

        // byte, short, long

        byte byteVariable = 125; // Объявление и инициализация переменной типа byte
        byteVariable = 45;
        System.out.println("Значение переменной byteVariable: " + byteVariable);

        short shortVar; // Объявление и инициализация переменной типа short
        shortVar = 31000; // Инициализация (присвоение значения) переменной
        System.out.println("Short value: " + shortVar);

        // Любое целое число в коде воспринимается компилятором как число типа int

        long longVar = 9_100_000_000_000_000_000L; // Знак _ не влияет на значение переменной. Он используется для улучшения читаемости значения программистами
        // L в конце числа - явным образом указать, что число в формате long
        System.out.println("Long variable: " + longVar);

        double doubleVar = 10.5421;
        System.out.println("Double variable: " + doubleVar);

        float floatVar = 11.65F; // Явно указать, что число в формате float
        System.out.println("Float variable: " + floatVar);

    }

}
