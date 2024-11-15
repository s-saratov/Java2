package homework_46;

/*
Task 1

Получить и вывести на экран:
    - текущую дату;
    - текущий год, месяц и день.

Создать дату, например Ваш день рождения и вывести на экран.

Создать две даты и проверить на равенство.

Получить и вывести на экран:
    - текущее время;
    - текущее время + 3 часа.

Создать дату:
    - которая на неделю позже сегодняшней;
    - которая была на год раньше сегодняшней используя метод minus;
    - которая на год позже сегодняшней;
    - tomorrow и yesterday и проверить находятся ли они до или после сегодняшней.
 */

import java.time.LocalDate;
import java.time.LocalTime;

public class Task1 {

    public static void main(String[] args) {

        // Получаем и выводим на экран текущую дату

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // Получаем и выводим на экран текущий год, месяц и день
        System.out.printf("Current year: %d; current month: %s; current day: %d\n",
                currentDate.getYear(),
                currentDate.getMonth(),
                currentDate.getDayOfMonth()
                );

        // Создаём дату (день рождения) и выводим её на экран

        LocalDate birthday = LocalDate.parse("1988-06-12");
        System.out.println("My birthday: " + birthday);

        // Создаём две даты и проверяем их на равенство
        LocalDate date1 = LocalDate.parse("2016-11-08");
        LocalDate date2 = LocalDate.parse("2024-11-05");
        System.out.println("Is 08.11.2016 equal to 05.11.2024: " + date1.equals(date2));

        // Получаем и выводим в консоль текущее время

        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);

        // Получаем и выводим в консоль текущее время + 3 часа

        System.out.println("Current time + 3 hours: " + time.plusHours(3));

        // Создаём и выводим в консоль дату, которая на неделю позже сегодняшней

        LocalDate date3 = currentDate.plusWeeks(1);
        System.out.println("Current date + 1 week: " + date3);

        // Создаём и выводим в консоль дату, которая была на год раньше сегодняшней

        LocalDate date4 = currentDate.minusYears(1);
        System.out.println("Current date - 1 year: " + date4);

        // Создаём и выводим в консоль дату, которая была на год раньше сегодняшней

        LocalDate date5 = currentDate.plusYears(1);
        System.out.println("Current date + 1 year: " + date5);

        // Создаём даты tomorrow и yesterday и проверяем, находятся ли они до или после сегодняшней

        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday = currentDate.minusDays(1);

        System.out.println("Is tomorrow before today: " + tomorrow.isBefore(currentDate));
        System.out.println("Is tomorrow after today: " + tomorrow.isAfter(currentDate));
        System.out.println("Is yesterday before today: " + yesterday.isBefore(currentDate));
        System.out.println("Is yesterday after today: " + yesterday.isAfter(currentDate));

    }

}