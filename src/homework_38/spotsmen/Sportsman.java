package homework_38.spotsmen;

/*
Task 1

1. Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).

2. Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.

3. Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию,
например, по score.

4. В методе main создайте массив из нескольких объектов Sportsman.

5. Отсортируйте его с использованием:
    - естественного порядка, определенного в Comparable,
    - данного класса Comparator,
    - анонимного класса Comparator для сортировки по третьему полю (например, age).

6. Выведите каждый вариант отсортированного массива в консоль.
 */

public class Sportsman implements Comparable<Sportsman> {

    // Поля

    private String name;    // имя
    private int age;        // возраст
    private int score;      // рейтинг

    // Конструктор

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // Геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                "}\n";
    }

    // Метод, сравнивающий экземпляры класса по имени

    @Override
    public int compareTo(Sportsman anotherSportsman) {
        return this.getName().compareTo(anotherSportsman.getName());
    }

}

// TODO: сообщить, что домашнее задание не загружается в LMS