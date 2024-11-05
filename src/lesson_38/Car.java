package lesson_38;

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private int speed;

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Методы

    // Возвращает строковое представление экземпляра класса
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    // Сравнение машин по году выпуска. "Меньшей" будет считаться машина меньшим (более ранним) годом выпуска
    @Override
    public int compareTo(Car car1) {
        return this.year - car1.year;
        /*
        a vs b -> (a - b)
        a < b   -> метод вернёт положительное значение
        a > b   -> метод вернёт положительное значение
        a == b  -> метод вернёт 0
         */
    }
}