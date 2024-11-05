package lesson_39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        // Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов
        // Это позволяет единообразно обрабатывать различные типы коллекций

        // Создаём коллекцию строк

        // Ссылка типа интерфейс -> а справа мы можем подставить объект разных классов
        // (получить разные реализации этого интерфейса)

        Collection<String> strings = new ArrayList<>();

        // int size() - возвращает количество элементов в коллекции
        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty() - возвращает true, если коллекция пустая
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        // boolean add (T t) - добавляет элемент в коллекцию
        strings.add("Java");
        strings.add("Python");

        // Переопределённый метод toString для красивого вывода элементов коллекции
        System.out.println(strings);

        // Метод .of - это статический метод в нескольких интерфейсах и классах. Был введён в Java 9.
        // Он создаёт неизменяемый экземпляр коллекции из предоставленных элементов.
        // Доступен для List, Set, Map.

        Collection<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println("integers: " + integers);
        // integers.add(6); // попытка модифицировать (изменить) неизменяемую коллекцию приведёт к ошибке
        // (исключительной ситуации)

        // addAll (Collection<?> extrends T col) - добавляет все элементы из указанной коллекции в текущую
        // (СЛОЖЕНИЕ)
        strings.addAll(List.of("JS", "Banana", "Cat"));

        System.out.println(strings);

        /*
        strings.add("JS");
        strings.add("Banana");
        strings.add("Cat");
         */

        System.out.println("\n=========================\n");

        // boolean removeAll(Collection<?> col) - удаляет все элементы из коллекции вызова, содержащиеся в коллекции col
        // (ВЫЧИТАНИЕ)

        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5));

        System.out.println("numbers:\t\t\t\t\t\t\t\t" + numbers);
        numbers.removeAll(List.of(1, 2, 3));
        System.out.println("numbers.removeAll(List.of(1, 2, 3)):\t" + numbers);

        // boolean retainAll(Collection<?> col) - оставляет в коллекции вызова только те элементы, которые содержатся
        // в коллекции col (удаляет из коллекции вызова элементы, которые НЕ содержатся в коллекции col)
        // - ПЕРЕСЕЧЕНИЕ

        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 40, 50));
        colB.addAll(List.of(20, 30, 40));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB): " + colA);

        // boolean remove(Object obj) - удаляет элемент из коллекции. Возвращает true, если элементы был

        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println("colA.remove(40): " + colA.remove(40));
        System.out.println("colA: " + colA);

        // Все конструкторы принимают другую коллекцию
        // Создаётся коллекция, содержащая все элементы из указанной коллекции
        Collection<String> strings1 = new ArrayList<>(List.of("Test1", "Test2", "Test3"));
        System.out.println("strings1: " + strings1);
        strings1.add("Test4");
        System.out.println("strings1: " + strings1);

        Collection<String> stringsCopy = new ArrayList<>(strings1);
        stringsCopy.add("Test5");
        System.out.println("stringsCopy: " + stringsCopy);

    }

}