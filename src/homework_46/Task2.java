package homework_46;

/*
Task 2

Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий количество дней
между самой ранней и поздней датами в этом списке.
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<LocalDate> dates = new ArrayList<>();

        dates.add(LocalDate.of(1993, 3, 22));
        dates.add(LocalDate.of(1995, 1, 15));
        dates.add(LocalDate.of(2000, 5, 30));
        dates.add(LocalDate.of(2007, 7, 4));
        dates.add(LocalDate.of(2009, 8, 18));
        dates.add(LocalDate.of(2011, 10, 9));
        dates.add(LocalDate.of(2014, 11, 11));
        dates.add(LocalDate.of(2018, 12, 25));
        dates.add(LocalDate.of(2021, 2, 14));
        dates.add(LocalDate.of(2023, 4, 1));

        System.out.println("Minimal date: " + getMinimalDate(dates));
        System.out.println("Maximal date: " + getMaximalDate(dates));
        System.out.println("Days between minimal and maximal date: " + minMaxDatesDifference(dates));

    }

    // Метод, принимающий список из х дат типа LocalDate и возвращающий количество дней
    // между самой ранней и поздней датами в этом списке

    public static Long minMaxDatesDifference (List<LocalDate> dates) {

        // Исключение передачи null или пустого списка
        if (dates == null || dates.isEmpty()) return null;

        return ChronoUnit.DAYS.between(getMinimalDate(dates), getMaximalDate(dates));

    }

    // Метод возвращает минимальную дату в списке дат

    private static LocalDate getMinimalDate (List<LocalDate> dates) {

        // Исключение передачи null или пустого списка
        if (dates == null || dates.isEmpty()) return null;

        LocalDate result = dates.get(0);

        for (LocalDate date : dates) {
            if (date.isBefore(result)) result = date;
        }

        return result;
    }

    // Метод возвращает максимальную дату в списке дат

    private static LocalDate getMaximalDate (List<LocalDate> dates) {

        // Исключение передачи null или пустого списка
        if (dates == null || dates.isEmpty()) return null;

        LocalDate result = dates.get(0);

        for (LocalDate date : dates) {
            if (date.isAfter(result)) result = date;
        }

        return result;
    }

}