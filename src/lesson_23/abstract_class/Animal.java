package lesson_23.abstract_class;

// Если в классе есть хотя бы один абстрактный метод (без реализации), класс обязан быть помечен как абстрактный
abstract class Animal {

    // Абстрактный класс может иметь поля и константы
    protected String name;

    // Абстрактный класс может иметь конструкторы
    public Animal(String name) {
        this.name = name;
    }

    // Абстрактный метод не имеет реализации (тела метода)
    abstract void eat();
    abstract void move();

    // В абстрактном классе могут присутствовать "обычные методы" с реализацией
    public void sayHello() {
        System.out.println("Hello from animal");
    }

}