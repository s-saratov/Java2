package lesson_25;

public class Wrappers {

    /*
    Классы-обёртки используются в Java для представления примитивных типов данных как объектов:
        - Byte -> обёртка для byte
        - Short -> обёртка для short
        - Integer -> обёртка для int
        - Long -> обёртка для long
        - Float -> обёртка для float
        - Double -> обёртка для double
        - Character -> обёртка для char
        - Boolean -> обёртка для boolean
     */

    public static void main(String[] args) {

        // Автоматическое приведение типов
        // Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Автораспаковка. Из типа Integer автоматически преобразовано в примитив int

        // Сравнение объектов
        // Кэширование объектов -128 ... 127

        Integer a = 127;
        Integer b = 127;

        // Так как это ссылочный тип данных, оператором == сравниваются ссылки
        System.out.println("a == b -> " + (a == b)); // true
        System.out.println("a.equals(b) -> " + a.equals(b)); // true

        Integer c = 128;
        Integer d = 128;
        System.out.println("c == d -> " + (c == d)); // false
        System.out.println("c.equals(d) -> " + c.equals(d)); // true

        String j1 = "Java";
        String j2 = "Java";
        System.out.println("j1 == j2 -> " + (j1 == j2)); //true
        String j3 = new String("Java");

        System.out.println("j2 == j3 -> " + (j2 == j3)); // false
        System.out.println("j3.equals(j2): " + j3.equals(j2)); // true

        System.out.println("\n========================\n");

        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);

        // Схожие методы для всех обёрточных типов

        // 1. valueOf() - преобразует явным образом примитив или строку в объект типа обёртки

        Integer e = Integer.valueOf(128);
        Integer f = Integer.valueOf(128);
        System.out.println("e == f -> " + (e == f));

        Integer intStr = Integer.valueOf("123"); // передаём строку
        System.out.println(intStr + 100); // 223

        Double doubleWrap = Double.valueOf(154.5);
        System.out.println(doubleWrap);

        // 2. ParseXXX() - преобразует строку в соответствующий примитив
        // "456"
        System.out.println(Integer.parseInt("456") + 100);
        double d1 = Double.parseDouble("345.67" + 200);
        System.out.println(d1);

        // 3. toString - возвращает строковое представление числа
        System.out.println(doubleWrap);

    }

}