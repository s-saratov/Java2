package lesson_26;

import lists.MyArrayList;

public class ArrayTesting {

    public static void main(String[] args) {

        MyArrayList<Integer> numbers = new MyArrayList<>();


        numbers.addAll(1, 2, 3, 4, 5, 6);

        System.out.println(numbers);

        System.out.println(numbers.indexOf(4));

        System.out.println(numbers.remove(5));
        System.out.println(numbers);

        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("Java");
        strings.addAll("Python", "JS", "Scala", "Kotlin");
        System.out.println(strings);

        System.out.println(strings.remove("Basic"));
        System.out.println(strings.remove("Scala"));
        System.out.println(strings);

    }

}