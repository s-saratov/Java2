package homework_17;

public class MagicArrayMain {

    public static void main(String[] args) {

        System.out.println("1. Создаём массив класса MagicArray при помощи конструктора:");
        MagicArray array = new MagicArray();
        array.printArray();

        System.out.println("\n2. Добавляем в массив элемент со значением 10:");
        array.add(10);
        array.printArray();

        System.out.println("\n3. Добавляем в массив элементы со значениям 20, 30, 40, 50, 40, 30:");
        array.add(20, 30, 40, 50, 40, 30);
        array.printArray();

        System.out.println("\n4. Ищем индекс первого элемента со значением 40:");
        System.out.println(array.firstIndexOf(40));

        System.out.println("\n5. Ищем индекс последнего элемента со значением 40:");
        System.out.println(array.lastIndexOf(40));

        System.out.println("\n6. Пытаемся найти индекс элемента со значением 45:");
        System.out.println(array.firstIndexOf(45));

        System.out.println("\n7. Выводим значение элемента с индексом 1:");
        System.out.println(array.get(1));

        System.out.println("\n8. Выводим текущее количество элементов в массиве:");
        System.out.println(array.size());

        System.out.println("\n9. Удаляем из массива значение с индексом 3:");
        System.out.println("Удалённое значение: " + array.removeIndex(3));
        array.printArray();

        System.out.println("\n10. Пытаемся удалить из массива отсутствующее значение с индексом 10:");
        System.out.println("Удалённое значение: " + array.removeIndex(10));
        array.printArray();

        System.out.println("\n11. Создаём MagicArray из обычного массива [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]:");
        int[] ordinaryArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        MagicArray array2 = new MagicArray(ordinaryArray);
        array2.printArray();

        System.out.println("\n12. Удаляем из нового массива значение 7:");
        System.out.println("Индекс удалённого значения: " + array2.removeValue(7));
        array2.printArray();

        System.out.println("\n13. Пытаемся удалить из массива отсутствующее значение 10:");
        System.out.println("Индекс удалённого значения: " + array2.removeValue(10));
        array2.printArray();

    }

}