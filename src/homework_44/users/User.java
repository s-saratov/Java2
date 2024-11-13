package homework_44.users;

public class User {

    // Поля

    private int id;
    private String name;

    // Конструктор

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Геттеры и сеттеры

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Метод, возвращающий строковое представление экземпляра класса

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}