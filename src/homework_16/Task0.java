package homework_16;

/*
Task 0
Повторить код, написанный на уроке

В MagicArray должны быть реализованы методы:
    1. Добавление элемента
    2. Вывести все значения в массиве в консоль
    3. Поиск элемента по значению indexOf - (вернуть индекс, если такое значение есть в массиве)
    4. Возвращение значения по индексу
    5. Текущее количество элементов в массиве
    6. Удаление элемента по индексу remove
    7. Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
    8. Конструктор, принимающий в себя обычный массив и создающий MagicArray с такими же значениями
    9. Удаление элемента по значению
 */

public class Task0 {

    public static void main(String[] args) {

        System.out.println("1. Создаём массив класса MagicArray при помощи конструктора:");
        MagicArray array = new MagicArray();
        array.printArray();

        System.out.println("\n2. Добавляем в массив элемент со значением 10:");
        array.add(10);
        array.printArray();

        System.out.println("\n3. Добавляем в массив элементы со значениям 20, 30, 40, 50:");
        array.add(20, 30, 40, 50);
        array.printArray();

        System.out.println("\n4. Ищем индекс элемента со значением 40:");
        System.out.println(array.binarySearch(40));

        System.out.println("\n5. Пытаемся найти индекс элемента со значением 45:");
        System.out.println(array.binarySearch(45));

        System.out.println("\n6. Выводим значение элемента с индексом 1:");
        System.out.println(array.get(1));

        System.out.println("\n7. Выводим текущее количество элементов в массиве:");
        System.out.println(array.size());

        System.out.println("\n8. Удаляем из массива значение с индексом 3:");
        System.out.println("Удалённое значение: " + array.removeIndex(3));
        array.printArray();

        System.out.println("\n9. Пытаемся удалить из массива отсутствующее значение с индексом 10:");
        System.out.println("Удалённое значение: " + array.removeIndex(10));
        array.printArray();

        System.out.println("\n10. Создаём MagicArray из обычного массива [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]:");
        int[] ordinaryArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        MagicArray array2 = new MagicArray(ordinaryArray);
        array2.printArray();

        System.out.println("\n11. Удаляем из нового массива значение 7:");
        System.out.println("Индекс удалённого значения: " + array2.removeValue(7));
        array2.printArray();

        System.out.println("\n12. Пытаемся удалить из массива отсутствующее значение 10:");
        System.out.println("Индекс удалённого значения: " + array2.removeValue(10));
        array2.printArray();

    }

}