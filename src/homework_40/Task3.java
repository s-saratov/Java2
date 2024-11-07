package homework_40;

/*
Task 3

Написать метод, возвращающий первый неповторяющийся символ в строке.
 */

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
    }

    private static Character getFirstUniqueChar(String string) {

        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        // Перебираю буквы в цикле

        for (char ch : string.toCharArray()) {

            // Проверяю, присутствует ли текущий символ в сете повторов
            if (repeatedChars.contains(ch)) continue;

        /*
        1. Проверить, есть ли символ в уникальных
            1.1. Если есть: убрать из списка уникальных + добавить в список повторов;
            1.2. Если в уникальных нет - добавить
         */

            if (uniqueChars.contains(ch)) {
                uniqueChars.remove(ch); // убираю символ из уникальных
                repeatedChars.remove(ch); // добавляю в повторяющеюся
            } else uniqueChars.add(ch);
        }

        System.out.println("uniqueChars: " + uniqueChars);
        System.out.println("repeatedChars: " + repeatedChars);

        // Берем итератор, один раз вызываем next() - получаем первый элемент
        // Проверяем сет уникальных знаков на пустоту
        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();

    }

    private static Character getFirstUniqueChar2(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();

        /*
        1. Перебрать все символы в строке;
        2. Добавить символ в коллекцию уникальных символов;
        3. Если встретится повторяющийся символ - он не должен быть в коллекци уникальных
         */

        char[] chars = string.toCharArray();
        for (char ch : chars) {
            // true / false

            // Это не работает. Это решение отсекает только дважды встречающиеся символы.
            // 3-й повтор символа - записывает его в уникальные.

            // Если метод add вернул false, значит добавить символ в set не получилось, т.к. такой символ там уже есть
            if (!uniqueChars.add(ch)) {
                // я только что добавил символ повторно
                uniqueChars.remove(ch);
            }

        }

        System.out.println("uniq " + uniqueChars);
        return null;
    }

}