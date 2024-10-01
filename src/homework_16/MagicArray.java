package homework_16;

public class MagicArray {
    int[] array;
    int cursor; // присвоено значение по умолчанию = 0;

    // Конструктор объекта класса
    public MagicArray() {
        array = new int[0];
    }

    // 1. Добавление в массив элементов

    // 1.1. Добавление одного элемента

    void add (int value) {

        if (cursor == 0 || cursor == array.length - 1) expandArray();
        array[cursor] = value;
    }

    void add(int... numbers) {
        // c numbers возможно обращаться точно также, как со ссылкой на массив int
        // System.out.println("Приняли несколько целых чисел типа int, а именно: " + numbers.length);
        // System.out.println("Есть индекс у каждого числа, как массива. Под индексом 0: " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) add(numbers[i]);

    }

    // 2. Вывод в консоль значений массива

    void printArray () {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ((i < array.length - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // Динамическое расширение массива на 1 элемент (если не передан аргумент)
    void expandArray() {
        int[] newArray = new int[cursor];
        for (int i = 0; i < cursor; i++) newArray[i] = array[i];
        array = newArray;
        cursor++;
    }

    // Динамическое расширение массива на n элементов
    void expandArray(int n) {
        int[] newArray = new int[array.length + n];
        for (int i = 0; i < cursor; i++) newArray[i] = array[i];
        array = newArray;
    }

    // Д


    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        if (index >= 0 && index > cursor) {
            return array[index];
        }
        // Написать код, если индекс "некорректный"
        return Integer.MIN_VALUE; // Хорошего решения нет
        //TODO: поправить обработку некорректного индекса
    }

    int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. количество элементов уменьшилось)
        4. Вернуть старое значение
         */

        return 0;

    }

}


/*
1. Добавлять в массив элемент (не думая об индексах, размере массива)
2. Динамическое изменение размера массива.
3. Возвращать строковое представление массива (какие элементы там есть).
4. Добавляем в массив сразу несколько значений.
5. Текущее количество элементов в массиве.
6. Возвращает значение по индексу
7. Удаляет элемент по индексу (есть индекс - удалить этот элемент из массива). Вернуть старое значение

 */