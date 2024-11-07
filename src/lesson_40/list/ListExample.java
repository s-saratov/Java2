package lesson_40.list;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        // Тип ссылки определяет две вещи:
        // 1. Ссылку на объект какого типа можно сохранить в эту переменную
        // 2. Список доступных методов

        Collection<Integer> collection = new ArrayList<>();
        collection = new HashSet<>();
        collection = new PriorityQueue<>();
        Iterable<Integer> iterable = new ArrayList<>();

        // Конструкторы ArrayList
        List<Integer> list = new ArrayList<>(); // создаёт список с начальной ёмкостью "под капотом" в 10 элементов
        list = new ArrayList<>(50); // создаёт пустой список с указанной ёмкостью
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100)); // принимает коллекцию
        // Создаёт список, содержащий все элементы указанной коллекции (копирование элементов другой коллекции)

        // Конструкторы Linked List
        list = new LinkedList<>(); // создаёт пустой список
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100)); // создаёт список, содержащий все элементы указанной коллекции

        // Методы интерфейса List

        list.add(1000);
        list.add(-100);

        System.out.println("list: " + list);

        // void add(int index, E element) - добавление элемента на указанную позицию
        list.add(2,100);
        System.out.println(list);

        // E get(int index) - возвращает элемент по индексу
        int value = list.get(5);
        System.out.println("list.get(5): " + value);

        // E remove(int index) - удаляет элемент по указанному индексу, возвращает старое значение
        System.out.println(list.remove(5));
        System.out.println(list);

        // Метод удаления по значению (из интерфейса Collection) - принимает Object (ссылочный тип)
        list.remove(Integer.valueOf(1000));
        System.out.println(list);

        // Поиск элементов по значению. Возвращает индекс.
        // int indexOf(Object obj)
        // int lastIndexOf(Object obj)
        System.out.println("list.indexOf(-100): " + list.indexOf(-100));
        System.out.println("list.lastIndexOf(-100): " + list.lastIndexOf(-100));

        // void sort(Comparator<? super E> comparator - сортирует список с использованием указанного компаратора

        // Реализация функционального интерфейса Comparator, используя лямбда-выражение.
        // По сути, более компактная форма записи реализации получения объекта анонимного класса
        list.sort((i1, i2) -> i2.compareTo(i1));

        // Реализация компаратора через анонимный класс (получение объекта анонимного класса)
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        });

        System.out.println(list);

        // List<E> subList(int IndexFrom, int IndexTo) - возвращает список из элементов, находящихся на позициях
        // от indexFrom до indexTo
        List<Integer> subList = list.subList(1, 5);
        System.out.println(subList);

    }

}