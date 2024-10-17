package homework_26.pairs;

/*
Task 1

Создайте обобщённый класс Pair, который хранит две переменные одного типа.

Требования:
    1. Класс должен иметь конструктор, принимающий два параметра типа T.
    2. Методы:
        - T getFirst() — возвращает первый элемент.
        - T getSecond() — возвращает второй элемент.
        - void setFirst(T value) — устанавливает значение первого элемента.
        - void setSecond(T value) — устанавливает значение второго элемента.
        - void swap() — меняет местами первый и второй элементы.
 */

public class Pair <T> {

    // Поля

    private T first;
    private T second;

    // Конструктор

    public Pair(T First, T Second) {
        this.first = First;
        this.second = Second;
    }

    // Методы

    // 1. Возвращает первый элемент

    public T getFirst() {
        return first;
    }

    // 2. Возвращает второй элемент

    public T getSecond() {
        return second;
    }

    // 3. Устанавливает значение первого элемента

    protected void setFirst(T first) {
        this.first = first;
    }

    // 4. Устанавливает значение второго элемента

    protected void setSecond(T second) {
        this.second = second;
    }

    // 5. Меняет местами первый и второй элементы

    public void swap() {
        T tmp = first;
        first = second;
        second = tmp;
    }

}
