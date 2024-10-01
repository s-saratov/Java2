package homework_16;

public class MagicArray {
    int[] array;
    int cursor; // присвоено значение по умолчанию = 0;

    // Конструктор объекта класса (создаёт массив из 10 стандартных значений)
    public MagicArray() {
        array = new int[10];
    }

    // 1.1. Добавление в массив одного элемента

    void add (int value) {

        if (cursor == array.length - 1) expandArray();
        array[cursor] = value;
        cursor++;
    }

    // 2. Вывод в консоль значений массива

    void printArray () {
        System.out.print("[");
        for (int i = 0; i < cursor; i++) System.out.print(array[i] + ((i < cursor - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // 3. Бинарный поиск элемента в массиве с возвращением его индекса (если элемент найден),
    // либо - 1 (если элемент не найден)

    int binarySearch (int searchValue) {
        int startIndex = 0;
        int endIndex = cursor - 1;
        int middleIndex;
        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == searchValue) return middleIndex;
            if (array[middleIndex] > searchValue) endIndex = middleIndex - 1;
            else startIndex = middleIndex + 1;
        }
        return -1;
    }

    // 4. Возвращение значения по индексу

    int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        // Написать код, если индекс "некорректный"
        return Integer.MIN_VALUE; // Хорошего решения нет
        //TODO: поправить обработку некорректного индекса
    }

    // 5. Возвращение текущего количества элементов в массиве

    int size() {
        return cursor;
    }

    //6. Удаление элемента по индексу index, возвращается значение удалённого элемента

    int removeIndex(int index) {
        if (index > 0 && index < cursor) {
            int tmp = array[index];
            for (int i = index; i < cursor; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return tmp;
        }
        return Integer.MIN_VALUE;
    }

    // 7. Добавление в массив нескольких элементов

        void add(int... numbers) {
            for (int i = 0; i < numbers.length; i++) add(numbers[i]);
        }

    // 8. Конструктор, принимающий в себя обычный массив и создающий MagicArray с такими же значениями
    public MagicArray(int[] ordinaryArray) {
        if (ordinaryArray == null || ordinaryArray.length == 0) array = new int[10];
        else {
            array = ordinaryArray;
            cursor = ordinaryArray.length;
            expandArray();
        }
    }

    // 9. Удаление элемента по значению, возвращается индекс удалённого элемента

    int removeValue(int value) {
        int index = binarySearch(value);
        if (index == -1) return -1;
        else {
            removeIndex(index);
            return index;
        }

    }

    // Динамическое расширение массива в два раза

    void expandArray() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) newArray[i] = array[i];
        array = newArray;
    }

}