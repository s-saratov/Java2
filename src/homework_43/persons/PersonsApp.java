package homework_43.persons;

/*
Task 3

Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.
Например, старше 25 лет и проживающих в городе "Berlin"
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonsApp {

    public static void main(String[] args) {

        // Создаём первоначальный список людей
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "Berlin"),
                new Person("Bob", 20, "Berlin"),
                new Person("Charlie", 35, "Munich"),
                new Person("Diana", 28, "Berlin"),
                new Person("Eve", 22, "Hamburg"),
                new Person("Frank", 40, "Berlin"),
                new Person("Grace", 27, "Berlin"),
                new Person("Henry", 32, "Munich")
        );

        // Выводим первоначальный список в консоль
        System.out.println("Первоначальный список людей:");
        System.out.println(people);

        // Фильтруем коллекцию с помощью Stream API
        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() > 25)                 // фильтруем по возрасту: старше 25 лет
                .filter(person -> person.getCity().equals("Berlin"))    // фильтруем по городу: Берлин
                .collect(Collectors.toList());

        // Выводим список в консоль
        System.out.println("\nОтфильтрованный список:");
        System.out.println(filteredPeople);

    }

}