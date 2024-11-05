package homework_38.comparators;

import java.util.Comparator;

/*
Task 3

Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:
    - Чётные целые числа должны идти перед нечетными числами в порядке возрастания;
    - Нечётные целые числа должны идти после четных в порядке убывания.
 */

public class MyComparator2 implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        if (a % 2 == 0 && b % 2 != 0) return -1;            // если a чётное, а b нечётное
        else if (a % 2 != 0 && b % 2 == 0) return 1;        // если a нечётное, а b чётное
        else if (a % 2 != 0 && b % 2 != 0) return b - a;    // если оба числа нечётные
        else return a - b;                                  // если оба числа чётные

    }

}