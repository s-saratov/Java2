package homework_40;

/*
Task 1

Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке
увеличения длин слов. Если строки имеют одинаковую длину - сортировать в естественном порядке.
 */

import java.util.*;

public class Task1 {


    public static void main(String[] args) {

        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(makeListOfWords(testString));

    }

    public static Set<String> makeListOfWords(String string) {
        // Заменяем все не буквы и не пробелы на пустоту
        // trim() убирает пробелы в начале и в конце строки -- "  String string  " ->
        String newString = string.trim().replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");

        // Преобразование строки в массив слов по пробельному символу (в любом количестве)
        String[] words = newString.split("\\s+");

        // Компаратор для сортировки по длине строки, затем по естественному порядку
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length).
                thenComparing(Comparator.naturalOrder());

        // Конструктор может быть пустым, может принимать коллекцию или компаратор.
        // Но не может одновременно принимать коллекцию + компаратор
        // Создаём массив с заданным компаратором и добавляем в него слова
        Set<String> result = new TreeSet<String>(lengthComparator);
        result.addAll(Arrays.asList(words));

        return result;

    }

}