package homework_26.myArrayLists;

/*
Task 2
Обобщенный статический метод “Печать двух списков”

Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyArrayList и MyArrayList,
и выводит элементы обоих списков.

Требования:
    - Метод должен быть обобщенным по двум типам T и U.
    - Элементы списков могут быть разных типов.
 */

import lists.MyArrayList;

public class MyArrayListUtils {

    public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2) {
        System.out.print("\n // ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf(list1.get(i) + " // ");
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.printf(list2.get(i) + " // ");
        }

    }

}