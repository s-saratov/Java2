package homework_47;

/*
Task 2

В рамках освоения возможностей Java Time API предлагаем вам выполнить следующие задания:

2.1. Парсинг и анализ даты и времени

У вас есть строка: "15-12-2022 20-46".

Используя возможности Java Time API, выполните следующие действия:
    - Распарсите данную строку в объект LocalDateTime;
    - После успешного парсинга выведите отдельно:
        - Месяц
        - День
        - Час

2.2. Определение дня недели и расчёт интервала между датами

Вторая строка для работы: "30/01/23 1:47" (обратите внимание, что 23 — это год).

Ваши задачи:
    - Определите, на какой день недели приходится эта дата.
    - Вычислите количество дней между первой и второй датами из заданий.

P.S.:
    - Используйте соответствующие классы и методы из Java Time API для парсинга и обработки дат и времени.
    - При решении обращайте внимание на формат входных строк и используйте соответствующие форматеры.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task2 {

    public static void main(String[] args) {

        // 2.1.

        String strDate = "15-12-2022 20-46";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parseDate = LocalDateTime.parse(strDate, formatter);
        System.out.println("First date: " + parseDate);

        System.out.println("Month: " + parseDate.getMonth() + " | " + parseDate.getMonth().getValue() + "; day: "
                + parseDate.getDayOfMonth() + "; hour: " + parseDate.getHour());

        // 2.2.

        String strDate2 = "30/01/23 1:47";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yy H:mm");
        LocalDateTime parseDate2 = LocalDateTime.parse(strDate2, formatter2);
        System.out.println("\nSecond date: " + parseDate2);

        System.out.println("The second date is: " + parseDate2.getDayOfWeek() + " | " + parseDate2.getDayOfWeek().getValue());
        System.out.println("\nDays between the first and second date: " + ChronoUnit.DAYS.between(parseDate, parseDate2));
        System.out.println("Days between the first and second date: " + parseDate.until(parseDate2, ChronoUnit.DAYS));

    }

}