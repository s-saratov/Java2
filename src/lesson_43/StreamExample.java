package lesson_43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        /*
        Stream API - мощный инструмент, позволяющий обрабатывать наборы данных в декларативном стиле.

        Stream - это поток данных, который представляет собой последовательность элементов.
        Поток даёт возможность поочерёдного получения элемента данных для обработки.
        Stream может быть создан из различных источников (массивы, коллекции и т.д.)

        Pipeline - последовательность операций, выполняемых на потоке.

        Промежуточные операции (методы) - это операции, которые преобразуют поток в другой поток (возвращают поток).
        Их может быть много (больше чем одна).

        Терминальные операции (методы) - это операции, которые запускают обработку потока и закрывают его.
        После выполнения терминальной операции поток перестаёт быть доступным для дальнейшей обработки.
        Может быть ТОЛЬКО ОДИН терминальный метод.

        Ленивые вычисления
        Потоки не выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод.

        Как создать поток:
        stream() - создание потока из элементов коллекции.
         */

        /*
        Промежуточные методы:

        Stream <T> filter(Predicate<T> predicate) - оставляет в потоке только те элементы, для которых предикат вернёт true.
        Т.е. оставляет элементы, удовлетворяющие условию (отбрасывает элементы, НЕ удовлетворяющие условию)

        ---
        sorted() - сортирует поток в естественном порядке
        sorted(Comparator<T> comparator) - сортирует элементы с использованием компаратора

        ---
        Stream<R> map(Function<T, R action> - преобразует элементы потока с использованием заданной функции,
        в т.ч. в другой тип данных
         */

        /*
        Терминальные методы:
        R collect (Collector<T, A, R> collector) - преобразует элементы потока в разные типы коллекций или другие структуры данных
         */

        // task1();
        // task2();
        // task3();
        // task4();
        task5();

    }

    private static void task5() {
        // Получить список имён кошек, чей вес больше 4 килограмм
        // Создать поток
        // Оставить кошек, чей вес больше 4
        // Изменить тип потока Cat -> name(String)
        // Собрать в список

        List<Cat> cats = getListCats();

        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                // .map(cat -> cat.getWeight())
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);

    }

    private static void task4() {

        List<Cat> cats = getListCats();

        // Получить список имён всех кошек

        // Получаем поток элементов другого типа
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);
        // Изначальная коллекция не изменяется
        // System.out.println(cats);

    }

    private static void task3() {

        List<Cat> cats = getListCats();

        // Фильтрация списка. Оставить котов с именем длиннее 4 символов.
        Stream<Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        // Пока не запущен терминальный метод, промежуточные методы не выполняются
        List<Cat> longNameCats = stream.collect(Collectors.toList());

        System.out.println("longNameCats: " + longNameCats);
    }

    private static void task2() {
        List<Cat> cats = getListCats();

        // Список кошек с весом больше 4 килограмм
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод
        List<Cat> fatCats = catStream.collect(Collectors.toList());

        // Повторно использовать "закрытый" (на котором уже был вызван терминальный метод) поток нельзя
        // fatCats = catStream.filter(c -> c.getWeight() > 5).collect(Collectors.toList()); - будет исключение (ошибка)

        System.out.println(fatCats);
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);
        // Список, содержащий положительные числа
        // Список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();
        for (Integer i : integers) {
            if (i > 0) result.add(i);
        }

        result.sort(Comparator.naturalOrder());
        System.out.println(result);

        // У всех коллекций есть метод stream(), создающий поток из элементов коллекции
        List<Integer> integerList = integers.stream() // создание потока на основе элементов списка
                .filter(i -> i > 0) // фильтрация элементов потока
                .sorted() // сортировка элементов в естественном порядке
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию List

        System.out.println("integerList: " + integerList);

        // Pipeline
        // integers.stream().filter(i -> 0).sorted().collect(Collectors.toList());

    }

}