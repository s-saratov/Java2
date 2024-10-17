package homework_26.myArrayLists;

import lists.MyArrayList;

public class MyArrayListMain {

    public static void main(String[] args) {

        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        MyArrayListUtils.printTwoLists(names, scores);

    }

}