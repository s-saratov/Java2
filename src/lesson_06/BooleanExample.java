package lesson_06;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        int x = 10;
        int y = 5;

        // Сравнение на равенство "=="
        boolean b1 = x == y; // X равен Y -> 10 равно 5 -> false
        System.out.println(x + " == " + y + "\t\t-> " + b1);

        // Неравенство "!="
        // X не равен Y
        b1 = x != y; // 10 != 5 -> true
        System.out.println(x + " != " + y + "\t\t-> " + b1);

        // Больше ">"
        // X больше чем Y
        b1 = x > y; // 10 > 5 -> true
        System.out.println(x + " > " + y + "\t\t-> " + b1);

        y = 10;
        b1 = x > y; // 10 больше 10 -> false
        System.out.println(x + " > " + y + "\t\t-> " + b1);

        // Больше или равно ">="
        b1 = x >= y; // 10 больше или равно 10 -> true
        System.out.println(x + " >= " + y + "\t-> " + b1);

        x = 7;

        // Меньше "<"
        b1 = x < y; // 7 меньше чем 10 -> true
        System.out.println(x + " < " + y + "\t\t-> " + b1);

        // Меньше или равно "<="
        b1 = x <= y; // 7 меньше или равно 10 -> true
        System.out.println(x + " <= " + y + "\t\t-> " + b1);

        String str = "Java is the best";
        boolean contains = str.contains("Java"); // Строка str содержит в себе подстроку "Java"
        System.out.println("str.contains(\"Java\"): " + contains);

        System.out.println("\n ========== Логические операции ========== \n");

        // Логическое НЕ (отрицание) "!"
        // Меняет значение boolean на противоположное

        boolean b2;
        b2 = !false; // получим значение true
        System.out.println("!false:\t\t" + b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5):\t" + b2);

        // Составные сравнения - два условия

        // Логическое И "&"
        // Используется когда нужно, чтобы оба условия были истинными
        // Рим - столица Италии И Берлин - столица Германии
        // Если хотя бы в одной части будет false -> в результате получим false

        b2 = true & true;
        System.out.println("true & true: " + b2);
        b2 = (2 < 5) & (11 == 10); // true & false -> false
        System.out.println("b2 (2 < 5) & (11 == 10) -> " + b2);

        // Введите число от 0 до 100
        int x1 = 50;
        boolean b3 = x1 > 0 & x1 < 100;

        // Логическое ИЛИ "|"
        // Когда достаточно, чтобы хотя бы одно условие было истинным

        boolean b4 = true | false;
        System.out.println("true | false\t-> " + b4);
        System.out.println("false | false\t-> " + (false | false));

        // Введите или чётное число, или число, которое делится на 5 без остатка.
        // Чётное число - число, которое делится без остатка на 2.

        // Генерация случайного числа

        Random random = new Random();

        //в диапазоне от 0 до X
        int rand = random.nextInt(100); //  (0 ... x - 1) -> (0 ... 99) включительно
        System.out.println("rand: " + rand);

        boolean isEven = rand % 2 == 0;
        System.out.println("isEven:\t\t\t" + isEven);

        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isGoodNumber:\t" + isGoodNumber);

        // Логическое исключающее ИЛИ (XOR) "^"
        // Возвращает true, если две части выражения разные

        boolean b5 = true ^ false;
        System.out.println("true ^ false:\t" + b5);
        b5 = false ^ true;
        System.out.println("false ^ true:\t" + b5);
        b5 = true ^ true;
        System.out.println("true ^ true:\t" + b5);
        b5 = false ^ false;
        System.out.println("false ^ false:\t" + b5);

        System.out.println("\n ================== \n");

        // Логическое сокращённое И "&&"
        // Выдаёт true только если обе части выражения равные true

        boolean b6 = true && false;
        System.out.println("true && false:\t\t\t" + b6);
        b6 = true && true;
        System.out.println("true && true:\t\t\t" + b6);
        b6 = (2 > 5) && (11 == 11);
        System.out.println("(2 > 5) && (11 == 11):\t" + b6);

        int a = 10;
        int b = 0;

        // Правая часть НЕ СЧИТАЕТСЯ / не выполняется, т.к. в левой части у нас false и значение переменной B7 не зависит от правой части выражения
        boolean b7 = (b != 0) && (a / b > 2);
        System.out.println("a / b > 2:\t" + b7);

        // Логиское сокращённое ИЛИ "||"
        // Выдаёт true, если хотя бы одна часть выражения равна true

        boolean b8 = true || (a / b > 2);
        System.out.println("b8:\t\t\t" + b8);

        System.out.println("\n ========== Приоритет логических операций ========== \n");

        /*
        1. !
        2. &
        3. ^
        4. |
        5. &&
        6. ||
         */

        System.out.println(true ^ true & false);
        // 1. true & false
        System.out.println(false ^ false);
        // 2. true ^ false
        System.out.println(true);

        System.out.println();

        System.out.println(true ^ true && false);
        // 1. true ^ true
        System.out.println(false && false);
        // 2. false && false
        System.out.println(false);

        System.out.println("\n ===================== \n");

        System.out.println(true | false | (25 < 100) & !true ^ (26 == 5));

    }
}