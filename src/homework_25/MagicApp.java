//package homework_25;
//
//public class MagicApp {
//
//    public static void main(String[] args) {
//
//        // Создаём волшебный массив строк
//
//        MagicArrayGen<String> array1 = new MagicArrayGen<>();
//
//        // Добавляем в массив значения при помощи метода add
//
//        array1.add("One");
//        array1.add("Two");
//        array1.add("Three");
//
//        // Выводим на экран значения массива
//
//        array1.printArray();
//
//        // Добавляем в массив значения при помощи метода addAll
//
//        array1.addAll(new String[] {"Four", "Five", "Six"});
//
//        // Выводим на экран значения массива при помощи метода printArray()
//
//        array1.printArray();
//
//        // Выводим на экран количество элементов в массиве при помощи метода size()
//
//        System.out.println("Количество элементов в волшебном массиве: " + array1.size());;
//
//        // Ищем первый индекс элемента при помощи метода indexOf()
//
//        System.out.println("Первый индекс элемента \"Five\": " + array1.indexOf("Five"));
//
//        // Добавляем в массив ещё один элемент "Five"
//
//        array1.add("Five");
//
//        // Ищем последний индекс элемента при помощи метода indexOf()
//
//        System.out.println("Последний индекс элемента \"Five\": " + array1.lastIndexOf("Five"));
//
//        // Проверяем, содержит ли массив элемент "Seven" при помощи метода contains()
//
//        System.out.println("Массив содержит элемент \"Seven\": " + array1.contains("Seven"));
//
//        // Удаляем элемент "Six" при помощи метода remove()
//
//        System.out.println("Успешное удаление элемента \"Five\": " + array1.remove("Five"));
//
//        // Выводим на экран значения массива при помощи метода printArray()
//
//        array1.printArray();
//
//        // Удаляем элемент с индексом 4 при помощи метода remove()
//
//        System.out.println("Удаляем элемент с индексом 4, его значение: " + array1.remove(4));
//
//        // Проверяем, является ли массив пустым, при помощи метода isEmpty()
//
//        System.out.println("Пуст ли волшебный массив: " + array1.isEmpty());
//
//        // Получаем значение по индексу 4 при помощи метода get()
//
//        System.out.println("Текущее значение по индексу 4: " + array1.get(4));
//
//        // Перезаписываем значение по индексу 4 при помощи метода set()
//
//        array1.set(4, "Fifty five");
//
//        // Выводим на экран значения массива при помощи метода printArray()
//
//        array1.printArray();
//
//    }
//
//}