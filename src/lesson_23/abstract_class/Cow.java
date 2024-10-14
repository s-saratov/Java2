package lesson_23.abstract_class;

// Если наследник не переопределяет ВСЕ абстрактные методы родительского класса,
// такой класс должен быть помечен как абстрактный

abstract class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Cow eats");
    }
}