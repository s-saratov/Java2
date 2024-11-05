package homework_38.comparators;



import java.util.Arrays;
import java.util.Comparator;

public class ComparatorsApp {

    public static void main(String[] args) {

        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        System.out.println("Массив до сортировки:\t\t\t\t\t" + Arrays.toString(integers));

        MyComparator myComparator = new MyComparator();
        MyComparator2 myComparator2 = new MyComparator2();

        Arrays.sort(integers, myComparator);

        System.out.println("Массив после сортировки MyComparator:\t" + Arrays.toString(integers));

        Arrays.sort(integers, myComparator2);

        System.out.println("Массив после сортировки MyComparator2:\t" + Arrays.toString(integers));

    }

}