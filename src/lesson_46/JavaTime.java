package lesson_46;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTime {

    public static void main(String[] args) {
        
        /*
        util.Date, + util.Calendar + text.SimpleDateFormat
        Joda-Time

        java.time - Java Time API
         */

        // LocalDate - представляет дату (год, месяц, день) без

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("now: " + date);

        // прибавить один день к дате
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        // объект LocalDate неизменяемый. Методы plusDays не изменяет объект, на который он вызван
        System.out.println("date: " + date);

        String text = "String init";
        String anotherString = text.toLowerCase();
        System.out.println(anotherString);
        // text неизменный
        System.out.println("text: " + text);

        System.out.println("plusWeeks: " + date.plusWeeks(4)); // плюс 4 недели к дате
        System.out.println("yesterday: " + date.minusDays(1)); // минус 1 день от даты

        LocalDate date1 = LocalDate.of(2002, 2, 15); // установить дату (год, месяц, день)

        // Можно использовать Enum с названием месяца
        LocalDate date2 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("date2: " + date2);

        // У объекта LD есть множество геттеров
        System.out.println("год: " + date2.getYear() + "; месяц: " + date2.getMonth() + "; месяц-цифра: " + date2.getMonthValue());
        System.out.println("число: " + date2.getDayOfMonth() + "; день недели: " + date2.getDayOfWeek()
                + "; день года: " + date2.getDayOfYear());

        // Класс, представляющий день недели
        DayOfWeek dayOfWeek = date2.getDayOfWeek();
        System.out.println("номер дня недели: " + dayOfWeek.getValue());
        System.out.println("сколько дней в месяце: " + date2.lengthOfMonth() + "; дней в году: " + date2.lengthOfYear());

//        Month[] months = Month.values();
//        for (Month month : months) System.out.println(month);

        String dateString = "2000-10-25"; // Формат строки ISO-8601 - (год, месяц, число, разделённые тире)
        LocalDate date3 = LocalDate.parse(dateString);
        System.out.println(date3.getDayOfMonth() + ":" + date3.getMonthValue() + ":" + date3.getYear() + ":" + date3.getDayOfWeek());

        System.out.println("\n================= LocalTime =================");

        // LocalTime представляет время (часы, минуты, секунды, наносекунды)
        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("LocalTime.now(): " + time);

        LocalTime time1 = LocalTime.of(21, 33); // часы, минуты
        time1 = LocalTime.of(21,33,44,54875);
        System.out.println(time1);

        // Добавляем 1 час к объекту времени (получаем новый объект времени)
        System.out.println("time.plusHours(1): " + time.plusHours(1));
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65));
        System.out.println("time.minusSeconds(30): " + time.minusSeconds(30));

        // Геттеры

        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + ":" + time.getNano());
        String timeStr = "12:13:46";

        // Формат ISO9601 ("2001-01-14T08:15:45+01.00")
        LocalTime parseTime = LocalTime.parse(timeStr);
        System.out.println(parseTime + " : " + parseTime.getMinute());

        System.out.println("\n================= LocalDateTime =================");

        // LocalDateTime представляет собой дату и время (без учёта часового пояса)

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2011,Month.AUGUST,15);
        LocalTime localTime = LocalTime.of(15,31,59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(dateTime);
        dateTime = LocalDateTime.of(2024, 12, 31, 23,59);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());

        // Есть все методы из классов LocalDate + LocalTime
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));

        System.out.println("\n================= LocalDateTime =================");

        // ZoneDateTime представляет дату и время с часовым поясом

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("\n======== isAfter, isBefore, until, equals ========");
        LocalDate date4 = LocalDate.of(2000, 10,15);
        LocalDate date5 = LocalDate.of(2000, 6,25);

        // isAfter, isBefore, until, equals есть у всех объектов, представляющих дату и/или время
        // isAfter проверяет, что текущий объект после (позже) указанного объекта

        boolean isAfter = date4.isAfter(date5);
        System.out.println("date4.isAfter(date5): " + isAfter);

        // isBefore проверяет, что текущий объект до (раньше) указанного объекта
        System.out.println("date4.isBefore(date5): " + date4.isBefore(date5));

        // equals проверяет объект даты и/или времени на равенство
        System.out.println("date4.equals(date5): " + date4.equals(date5));

        // until измеряет время между текущим и указанным объектом даты/времени
        // Мы можем выбрать, в каких единицах измерять разницу
        // Метод возвращает long

        long daysBetween = date4.until(date5, ChronoUnit.DAYS); // сколько дней между date4 и date5
        System.out.println("date4.until(date5, ChronoUnit.DAYS): " + daysBetween);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.plusDays(15);
        System.out.println(dateTime2.until(dateTime1, ChronoUnit.SECONDS));

        // Универсальные методы minus, plus - ко всем объектам даты / времени
        LocalDateTime dateTime3 = dateTime1.minus(10, ChronoUnit.MINUTES); // вычесть 10 дней
        LocalDateTime dateTime4 = dateTime1.plus(5, ChronoUnit.YEARS); // прибавить 5 лет

        // Метод between есть у каждой единицы времени (ChronoUnit), используется, если нужно узнать количество дней между днями

        long daysBetween2 = ChronoUnit.DAYS.between(dateTime3, dateTime4);
        System.out.println("DAYS.between(date3, dateTime4): " + daysBetween2);
        System.out.println(ChronoUnit.HOURS.between(dateTime3, dateTime4));

        System.out.println("\n============ Duration, Instant, Period ============");

        /*
        Duration представляет продолжительность в секундах и наносекундах
        Instant - сколько прошло наносекунд по временной шкале Григорианского календаря (с 1 января 1970 UTC)
        Period представляет период времени в годах, месяцах и днях между двумя датами
         */

        // Instant представляет момент времени в эпохе Unix (количество миллисекунд с 1 января 1970 года, 00:00 UTC)

        Instant start = Instant.now();
        System.out.println(start);
        // Здесь будет какой-то код, время работы которого мы хотим засечь
        int sum = 0;
        for (int i = 0; i < 100_000; i++) {
            sum += i;
        }

        Instant end = Instant.now();

        // Duration - продолжительность в секундах и наносекундах.
        // Чаще всего используется для измерения коротких промежутков времени.

        Duration duration = Duration.between(start, end);
        System.out.println("duration" + duration);

        long millis = duration.toMillis();
        System.out.println("millis: " + millis);
        long nanoseconds = duration.toNanos();
        System.out.println("nanoseconds: " + nanoseconds);
        long seconds = duration.toSeconds();
        System.out.println("seconds: " + seconds);

        System.out.println("\n================= Period =================");
        // Period представляет период времени в годах, месяцах и днях
        LocalDate startDate = LocalDate.of(2022, 01, 1);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        System.out.println("period: " + period);
        System.out.println(period.getYears() + " | " + period.getMonths() + " | " + period.getDays());
        System.out.println("period.toTotalMonths(): " + period.toTotalMonths());
        // Можно получить период в выбранной единице времени (универсальный геттер)
        // Не производит вычислений (нет пересчёта общего количества месяцев)
        System.out.println(ChronoUnit.MONTHS);

        System.out.println("\n================= DateTimeFormatter =================");
        // DateTimeFormatter - формирование даты и времени
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatedDate = now.format(formatter);
        System.out.println("StringDate: " + formatedDate);

        /*
        y - год
        M - месяц
        d - день
        H - час в формате от 0 до 23
        h - час в формате от 0 до 12, флаг a для отображения AM/PM
        m - минута
        s - секунда

        Количество повторений символа определяет формат:
        yy - двухзначный год, например, 24 для 2024 года
        yyyy - четырёхзначный год
        M - месяц "2" или 12
        MM - месяц "02" или "12"
        d - однозначный или двухзначный день: 3 или 29
        dd - двузначный день: 03 или 29
         */

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String strDate = now.format(formatter1);
        System.out.println(strDate);

        // Из строки необходимо получить объект LDT с указанной в строке датой и временем

        String dateForParse = "23-10-26 19:35";
        System.out.println(dateForParse);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");

        LocalDateTime parseDate = LocalDateTime.parse(dateForParse, formatter2);
        System.out.println(parseDate.getDayOfWeek() + " | " + parseDate.getHour());
        System.out.println(parseDate);

        System.out.println("\n================= Task1 =================");

        // "15-12-2022 20-46"
        // Запарсить строку в формат LocalDateTime
        // Распечатать отдельно месяц, день и час

        String strDate1 = "15-12-2022 20-46";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parseDate2 = LocalDateTime.parse(strDate1, formatter3);

        System.out.println("Month: " + parseDate2.getMonth() + " | " + parseDate2.getMonth().getValue() + "; day: "
                + parseDate2.getDayOfMonth() + "; hour: " + parseDate2.getHour());

        System.out.println("\n================= Task2 =================");

        // "30/01/23 1:47" 23- год.
        // Какому дню недели соответствует вторая дата?
        // Сколько дней между этими датами?

        String strDate2 = "30/01/23 1:47";
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yy H:mm");
        LocalDateTime parseDate3 = LocalDateTime.parse(strDate2, formatter4);

        System.out.println(parseDate3.getDayOfWeek() + " | " + parseDate3.getDayOfWeek().getValue());
        System.out.println(ChronoUnit.DAYS.between(parseDate2, parseDate3));
        System.out.println(parseDate2.until(parseDate3, ChronoUnit.DAYS));

    }
    
}