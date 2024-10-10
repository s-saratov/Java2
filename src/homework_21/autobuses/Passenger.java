package homework_21.autobuses;

public class Passenger {

    // Поля

    private static int counterId;   // счётчик идентификационных номеров
    private final int id;           // идентификационный номер
    private String name;            // имя

    // Конструктор

    public Passenger(String name) {
        this.name = name;
        this.id = ++counterId;
    }

    // Геттеры и сеттеры

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Метод, возвращающий строковое представление экземпляра класса

    public String toString() {
        return "Passenger id: " + id + " name: " + name;
    }

}
