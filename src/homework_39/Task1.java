package homework_39;

/*
Task 1

Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        // Коллекция мужских имён
        List<String> maleNames = new ArrayList<>(List.of("Alex", "Chris", "James", "John", "Jordan", "Michael",
                "Morgan", "Robert", "Taylor", "William"));

        System.out.println("Мужские имена: " + maleNames.toString());

        // Коллекция женских имён
        List<String> femaleNames = new ArrayList<>(List.of("Alex", "Elizabeth", "Jamie", "Jennifer",
                "Jordan", "Linda", "Mary", "Morgan", "Patricia", "Taylor"));

        System.out.println("\nЖенские имена: " + femaleNames.toString());

        // Коллекция "универсальных" имён

        System.out.println("\n\"Универсальные\" имена (метод без дженерика): " + intersection(maleNames, femaleNames));

        System.out.println("\n\"Универсальные\" имена (метод c дженериком): " + intersectionGen(maleNames, femaleNames));

    }

    // Метод без дженерика

    public static List<String> intersection(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }

    // Метод с дженериком

    public static <T> List <T> intersectionGen (List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<T>(list1);
        result.retainAll(list2);
        return result;
    }

}

// TODO: дописать МЕТОДЫ по коду преподавателя