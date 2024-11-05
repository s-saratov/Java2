package homework_38.comparators;

/*
Task 2

Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел
в следующем порядке:

Чётные целые числа должны идти перед нечетными числами.
 */

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        if (a % 2 == 0 && b % 2 != 0) return -1;        // если a чётное, а b нечётное
        else if (a % 2 != 0 && b % 2 == 0) return 1;    // если a нечётное, а b чётное
        else return Integer.compare(a, b);              // если оба числа чётные или нечётные

    }

}