package homework_26.numericPairs;

/*
Task3
Обобщенный класс с ограничениями типов

Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.

Требования:
    - Класс должен иметь конструктор для инициализации двух чисел.
    - Метод double sum() возвращает сумму этих чисел.
 */

public class NumericPair <T extends Number> {

    // Поля

    private T first;
    private T second;

    // Конструктор

    public NumericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Метод, возвращающий сумму чисел из полей

    public double sum() {
        return first.doubleValue() + second.doubleValue();
    }
}