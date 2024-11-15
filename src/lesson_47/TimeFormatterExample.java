package lesson_47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatterExample {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String strDate = now.format(formatter);
        System.out.println("date string: " + strDate);

        // У нас есть String с датой и временем в каком-то формате.
        // Необходимо из этой строки получить объект даты-времени.

        String dateStrParse = "24-10-05 16:58"; // 05 - число, 24 - год
        System.out.println(dateStrParse);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDate = LocalDateTime.parse(dateStrParse, formatter2);
        System.out.println(parseDate);
        System.out.println(parseDate.getDayOfWeek() + " | " + parseDate.getHour() + ":" + parseDate.getMinute());
        System.out.println(parseDate.format(formatter));

    }

}