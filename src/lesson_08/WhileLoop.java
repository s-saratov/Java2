package lesson_08;

public class WhileLoop {

    public static void main(String[] args) {

        /*
        while (условие) {
            Тело цикла - код, который будет повторяться
        }
         */

        // Вывести на экран числа от 1 до 5

        int number = 1; // Инициализация переменной

        while (number <= 5) { // Условие (предикат) цикла
            System.out.println(number); // Действие: вывод числа
            number++; // number = number + 1;
        }

        System.out.println("Цикл закончен. Продолжаем выполнение программы\n");

        // Бесконечный цикл

//        while (true) {
//            System.out.println("Hello world!");
//        }

        // Распечатать числа от 100 до 90 включительно в порядке убывания

        int i = 100;

        while (i >= 90) System.out.println(i--);
        System.out.println();

        // Задача. Найти сумму чисел от 1 до 100

        /*
        1. Перебрать числа от 1 до 100.
        2. Каждое число добавить в какую-то переменную, накапливающую сумму чисел.
         */

        i = 1; // Инициализация счётчика цикла
        int sum = 0;

        while (i <= 100) sum += i++; // Добавляю текущее значение i к сумме

        System.out.println("Сумма чисел от 1 до 100: " + sum);
        System.out.println();

        // Вывести на экран все чётные числа в диапазоне от 1 до 21

        // Моё решение
        i = 2;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
        System.out.println();

        // Решение преподавателя
        i = 1;
        while (i <= 21) {
            // проверка числа на чётность
            if (i % 2 == 0) System.out.println(i);
            i++;
        }
        System.out.println("\n =============== Hello ===============");

        // Распечатать каждый символ строки в отдельной строчке
        String str1 = "Hello";

        // Нам нужно перебрать все индексы от 0 до len - 1.
        // На каждой итерации берём символ по индексу. Распечатываем.
        // Повторить с другим индексом.

        i = 0; // 0, 1, 2 ... len - 1
        while (i <= str1.length() - 1) {
            char ch = str1.charAt(i);
            System.out.println(ch);
            i++;
        }

        System.out.println("\n====== Option 2 =====");
        i = 0; // 0, 1, 2 ... len - 1
        while (i <= str1.length() - 1) {
            System.out.println(str1.charAt(i++));
        }

    }

}