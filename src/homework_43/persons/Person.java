package homework_43.persons;

public class Person {

    // Поля

    private String name;
    private Integer age;
    private String city;

    // Конструктор

    public Person(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Метод, возвращающий строковое представление экземпляра класса

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                "}\n";
    }
}
