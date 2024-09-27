package lesson_04;

public class TypeCharExample {

    public static void main(String[] args) {

        char a = 'A'; // Переменная будет хранить букву А латинского алфавита
        char a1 = 65; // Переменная будет хранить букву А латинского алфавита,
        // соответствующей коду 65 в десятичной системе счисления
        char a2 = 0x41; // Присваиваем число в шестнадцатеричном формате, что соответствует всё той же букве A
        a2 = 0x0041; // полная форма записи числа в шестнадцатеричной системе счисления
        char a3 = '\u0041'; // Ещё один способ задать число в 16-ричном формате
        char x = '\u15D7';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        char digit0 = 48;
        System.out.println("digit0: " + digit0);

        /*
        1. digit0 -> int
        2. Сложение двух int -> int
        3. Кастирование результата из типа int к типу char
         */
//        digit0 = (char) (digit0 + 5)

        digit0 += 5; // digit0 = (char) (digit0 + 5);
        System.out.println("digit0: " + digit0);

        char letter = 97; // a
        System.out.println("letter: " + letter);
        letter++;
        System.out.println("letter: " + letter);

        System.out.println("int из char даст десятичный код символа: " + (int) letter);
        System.out.println(0 + letter);

        // 0 ... 9 -> Соответствуют кодам 48 ... 57
        // A ... Z -> Соответствуют кодам 65 ... 90
        // a ... z -> Соответствуют кодам 97 ... 122

        char x1 = 12853;
        System.out.println(x1);

    }

}
