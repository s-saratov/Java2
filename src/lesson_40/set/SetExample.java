package lesson_40.set;

import java.util.*;

public class SetExample {

    /*
    Контракт между методами equals() и hashCode()
    Для корректной работы хэш-коллекций есть важное правило, состоящее из трёх условий:
    1. Если два объекта равны по методу equal, то их хэщ-коды тоже должны быть равны.
    2. Если хэш-коды двух объектов различны, то объекты точно не равны по equals.
    Обратное верно не всегда. Разные объекты могут иметь одинаковый хэш-код (коллизия).
    3. Вызов метода hashCode должен возвращать одинаковое значение при многократном вызове на неизменённом объекте.
     */

    public static void main(String[] args) {

        // Конструкторы
        Set <Integer> set = new HashSet<>(); // создаёт пустой хэш-сет ёмкостью 16 и коэффициент загрузки 0,75
        set = new HashSet<>(20); // создаёт пустой хэш-сет с указанной ёмкостью и коэффициент загрузки 0,75
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, 6, 5, 3)); // создаёт новый сет, содержащий уникальные элементы
        // из указанной коллекции

        System.out.println(set);

        List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32));
        System.out.println(startValues);

        // HashSet не поддерживает порядок добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers hashSet: " + integers);

        // LinkedHashSet сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

        // Методы интерфейса Set

        // boolean add(E e) - добавление элемента
        System.out.println("integers.add(100): " + integers.add(100)); // true - элемент добавлен, т.к. такого значения ещё не было
        // false - элемент НЕ добавлен, т.к. такое значение уже есть в наборе (дубликат)
        System.out.println("integers.add(100) #2: " + integers.add(100)); // false
        System.out.println("integers: " + integers);

        // boolean remove(Object obj) - удаляет элемент по значению
        System.out.println("integers.remove(100): " + integers.remove(100)); // true
        System.out.println(integers);
        System.out.println("integers.remove(100) #2 : " + integers.remove(100)); // false

        System.out.println("\n=========================\n");

        // boolean contains(Object obj) - проверяет присутствие значения в множестве
        System.out.println("integers.contains(100): " + integers.contains(100));
        System.out.println("integers.contains(32): " + integers.contains(32));

        /*
        int size() - количество элементов
        boolean isEmpty() - true, если множество пустое
        clear() - удаляет все элементы
         */

        // iterator() - возвращает итератор для элементов set-а
        // Наличие итератора позволяет перебрать все элементы циклом for-each
        for (Integer value : integers) {
            System.out.println(value + ", ");
        }
        System.out.println();

        // Написать метод, который принимает список (List) и возвращает список,
        // состоящий только из уникальных элементов начального списка
        // Убрать дубликаты

        System.out.println("startValues:\t" + startValues);
        List<Integer> resultList = getUniqueList(startValues);
        System.out.println("resultList:\t\t" + resultList);

        System.out.println("\n========================\n");

        // SortedSet. Конструкторы
        // Конструктор по умолчанию (естественный порядок сортировки, если реализован Comparable)
        SortedSet<Integer> sortedSet = new TreeSet<>(); // пустое упорядоченное множество (сортировка в естественном порядке)
        sortedSet.addAll(startValues);
        System.out.println("sortedSet: " + sortedSet);

        // Конструктор, принимающий коллекцию. Естественный порядок.
        sortedSet = new TreeSet<>(startValues); // будут добавлены все элементы из коллекции
        System.out.println("sortedSet: " + sortedSet);

        // Конструктор с компаратором, определяющим порядок хранения элементов
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // обратный естественному порядок сортировки
        treeSet.addAll(startValues);
        System.out.println("treeSet: " + treeSet);

        treeSet = new TreeSet<>((i1, i2) -> i2 - i1);
        treeSet = new TreeSet<>((i1, i2) -> i2.compareTo(i1));

        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeSet: " + treeSet);

        // first() - возвращает самый первый (самый левый, наименьший по мнению Comparator-а) элемент
        System.out.println("treeSet.first(): " + treeSet.first());

        // last() - возвращает последний (самый правый, наибольший по мнению Comparator-а) элемент
        System.out.println("treeSet.last(): " + treeSet.last());

        SortedSet<Integer> integerSortedSet = new TreeSet<>(startValues);
        System.out.println("integerSortedSet: " + integerSortedSet);

        // SortedSet<E> headSet (E element) - возвращает часть множества, элементы которого строго меньше, чем element
        SortedSet<Integer> headSet = integerSortedSet.headSet(8);
        System.out.println("integerSortedSet.headSet(8): " + headSet);
        System.out.println("integerSortedSet: " + integerSortedSet);

        // SortedSet<E> tailSet (E element) - вернёт новое множество, состоящее из элементов старого, которые больше или равны element
        SortedSet<Integer> tailSet = integerSortedSet.tailSet(8);
        System.out.println("integerSortedSet.tailSet(8): " + tailSet);

        // subSet(E fromElement, E toElement) - вернёт новое множество, состоящее из элементов старого,
        // которое находится в диапазоне от fromElement (включительно) до toElement (не включительно)
        System.out.println("integerSortedSet.subSet(3, 16): " + integerSortedSet.subSet(3, 16));

        // comparator() - возвращает компаратор, используемый для упорядочивания элементов в этом множестве
        // вернётся null, если используется естественный порядок
        System.out.println(integerSortedSet.comparator());

        Comparator<Integer> comparator = (Comparator<Integer>) treeSet.comparator();
        System.out.println("comparator: " + comparator);

        test();

    } // main

    public static <T> List<T> getUniqueList(List<T> list) {
        // Получить Set, состоящий из уникальных элементов
        Set<T> set = new LinkedHashSet<>(list);
        // вернуть новый список, содержащий все элементы Set-а
        return new ArrayList<>(set);
    }

    public static void test() {
        String testStr = "Тестовая строка со словами";
        // Заменяем все не буквы на пустоту
        String newString = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я]", "");
        System.out.println(newString);

        // Преобразование строки в массив слов
        String[] words = testStr.split(" ");
        System.out.println(Arrays.toString(words));

        // Arrays.asList(T[] array) -> преобразует массив в коллекцию
        List<String> list = Arrays.asList(words);
        System.out.println(list);
    }

}