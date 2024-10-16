package homework_25;

/*

 */

public class MagicArray<T> {

    // Поля класса

    private T[] array;
    private int cursor; // присвоено значение по умолчанию = 0;

    // Конструкторы объекта класса

    // 1. Создающий массив из 10 стандартных значений

    public MagicArray() {
        array = new int[10];
    }

    // 2. Принимающий в себя обычный массив и создающий MagicArray с такими же значениями

    public MagicArray(int[] ordinaryArray) {
        if (ordinaryArray == null || ordinaryArray.length == 0) array = new int[10];
        else {
            array = ordinaryArray;
            cursor = ordinaryArray.length;
            expandArray();
        }
    }

    // Методы

    // 1. Добавление в массив одного элемента

    public void add (int value) {

        if (cursor == array.length - 1) expandArray();
        array[cursor] = value;
        cursor++;
    }

    // 2. Вывод в консоль значений массива

    public void printArray () {
        System.out.print("[");
        for (int i = 0; i < cursor; i++) System.out.print(array[i] + ((i < cursor - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // 3. Линейный поиск первого элемента в массиве с возвращением его индекса (если элемент найден),
    // либо - 1 (если элемент не найден)

    public int firstIndexOf(int searchValue) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == searchValue) return i;
        }
        return -1;
    }

    // 4. Линейный поиск последнего элемента в массиве с возвращением его индекса (если элемент найден),
    // либо - 1 (если элемент не найден)

    public int lastIndexOf(int searchValue) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == searchValue) return i;
        }
        return -1;
    }

    // 5. Возвращение значения по индексу

    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        // Написать код, если индекс "некорректный"
        return Integer.MIN_VALUE; // Хорошего решения нет
        //TODO: поправить обработку некорректного индекса
    }

    // 6. Возвращение текущего количества элементов в массиве

    public int size() {
        return cursor;
    }

    // 7. Удаление элемента по индексу index, возвращается значение удалённого элемента

    public int removeIndex(int index) {
        if (index > 0 && index < cursor) {
            int tmp = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return tmp;
        }
        else return Integer.MIN_VALUE; // Хорошего решения нет
        //TODO: поправить обработку некорректного индекса
    }

    // 8. Добавление в массив нескольких элементов

    public void add(int... numbers) {
            for (int i = 0; i < numbers.length; i++) add(numbers[i]);
        }

    // 9. Удаление элемента по значению, возвращается индекс удалённого элемента

    public int removeValue(int value) {
        int index = firstIndexOf(value);
        if (index == -1) return -1;
        else {
            removeIndex(index);
            return index;
        }

    }

    // Динамическое расширение массива в два раза

    private void expandArray() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) newArray[i] = array[i];
        array = newArray;
    }

}

// TODO: посмотреть в коде у