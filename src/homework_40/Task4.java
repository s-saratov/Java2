package homework_40;

/*
Task 4

Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List:
    - В первом методе - получение всех значений элементов списка по индексу
    (перебрать все индексы, взять значение по текущему индексу);
    - Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка);
    - Третий метод - удалить 1_000 элементов по случайному индексу (диапазон индексов от 0 до размера коллекции);
    - Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000).

Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
Сравните для каждого из списка время выполнения каждого метода.
И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        // Создаём список целых чисел на реализации ArrayList
        List<Integer> arrayList = new ArrayList<Integer>();
        // Создаём список целых чисел на реализации LinkedList
        List<Integer> linkedList = new LinkedList<Integer>();

        // Создаём объект для генерации случайных чисел
        Random random = new Random();

        // Заполняем списки 5000 одинаковыми случайными значениями от 0 до 1000
        for (int i = 0; i < 5000; i++) {
            int currentInt = random.nextInt(1001);
            arrayList.add(currentInt);
            linkedList.add(currentInt);
        }

        // Получаем результаты испытаний
        long duration1stAL = getAllValuesByIndex(arrayList);
        long duration1stLL = getAllValuesByIndex(linkedList);
        long duration2ndAL = add2000NewValues(arrayList);
        long duration2ndLL = add2000NewValues(linkedList);
        long duration3rdAL = remove1000ElementsByIndex(arrayList);
        long duration3rdLL = remove1000ElementsByIndex(linkedList);
        long duration4thAL = remove1000ElementsByValue(arrayList);
        long duration4thLL = remove1000ElementsByValue(linkedList);
        long durationAll4AL = all4Methods(arrayList);
        long durationAll4LL = all4Methods(linkedList);

        String results = String.format("\u001B[33m%-30s %-30s\u001B[0m\n",
                "Метод:", "Время выполнения (миллисекунд):");
        results += String.format("\u001B[33m%-30s %-15s %-15s\u001B[0m\n", "", "ArrayList", "LinkedList");
        results += String.format("%-30s %-15d %-15d\n", "getAllValuesByIndex", duration1stAL, duration1stLL);
        results += String.format("%-30s %-15d %-15d\n", "add2000NewValues", duration2ndAL, duration2ndLL);
        results += String.format("%-30s %-15d %-15d\n", "remove1000ElementsByIndex", duration3rdAL, duration3rdLL);
        results += String.format("%-30s %-15d %-15d\n", "remove1000ElementsByValue", duration4thAL, duration4thLL);
        results += String.format("%-30s %-15d %-15d\n", "all4Methods", durationAll4AL, durationAll4LL);

        // Выводим результаты в консоль
        System.out.println(results);
    }

    // Первый метод - получение всех значений элементов списка по индексу
    private static long getAllValuesByIndex(List<Integer> list) {

        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        // Засекаем время окончания выполнения
        long endTime = System.currentTimeMillis();

        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }

    // Второй метод - вставка 2 000 новых значений по случайному индексу
    private static long add2000NewValues(List<Integer> list) {

        // Создаём объект для генерации случайных чисел
        Random random = new Random();

        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода
        for (int i = 0; i < 2000; i++) {
            int currentIndex = random.nextInt(list.size() + 1);
            int currentInt = random.nextInt(1001);
            list.add(currentIndex, currentInt);
        }

        // Засекаем время окончания выполнения
        long endTime = System.currentTimeMillis();

        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }

    // Третий метод - удалить 1 000 элементов по случайному индексу
    private static long remove1000ElementsByIndex(List<Integer> list) {

        // Создаём объект для генерации случайных чисел
        Random random = new Random();

        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода
        for (int i = 0; i < 1000; i++) {
            int currentIndex = random.nextInt(list.size());
            list.remove(currentIndex);
        }

        // Засекаем время окончания выполнения
        long endTime = System.currentTimeMillis();

        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }

    // Четвёртый метод - удалить 1 000 элементов по значению (диапазон случайных значений от 0 до 10 000)
    private static long remove1000ElementsByValue(List<Integer> list) {

        // Создаём объект для генерации случайных чисел
        Random random = new Random();

        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода
        for (int i = 0; i < 1000; i++) {
            Integer currentInt = random.nextInt(10001);
            while (!list.remove(currentInt)) {
                currentInt = random.nextInt(10001);
                list.remove(currentInt);
            }
        }

        // Засекаем время окончания выполнения
        long endTime = System.currentTimeMillis();

        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }

    // Последовательное выполнение всех четырёх методов:

    private static long all4Methods(List<Integer> list) {
        long totalTime = 0;

        totalTime += getAllValuesByIndex(list);
        totalTime += add2000NewValues(list);
        totalTime += remove1000ElementsByIndex(list);
        totalTime += remove1000ElementsByValue(list);

        return totalTime;
    }

}

// TODO: ДОДЕЛАТЬ!!!