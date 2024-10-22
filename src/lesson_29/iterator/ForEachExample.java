package lesson_29.iterator;

import lists.MyArrayList;

import java.util.Iterator;

public class ForEachExample {

    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        // Цикл for-each является "синтаксическим сахаром", т.е. представляет более читаемый функционал,
        // аналогичный уже имеющемуся

        while (iterator.hasNext()) {
            String s = iterator.next();
        }

        /*
        for (ТипПеременной переменная : коллекция) {
            Действия с переменной
        }
         */

        for (String s : list) {
            System.out.println(s);
        }

        // Цикл for-each НЕ должен изменять состояние коллекции (добавлять или удалять элементы)

        for (String s : list) {
            if (s.equals("World")) {
                // list.remove(s);
                list.add("JS");
            }
        }

        System.out.println(list);

    }

}

// TODO - узнать на консультации:
//  - что такое коллекция, что входит, в чём отличие от массива
//  - что является Iterable