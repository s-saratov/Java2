package lesson_23.abstract_class;

public class AnimalsApp {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        cat.eat();
        cat.sayHello();

        // Нельзя создать экземпляр абстрактного класса
        // Animal animal = new Animal(); // Ошибка компиляции

        Animal animal = new Cat("Max"); // Но возможно использовать полиморфизм.

        // Возможно собирать объекты дочерних классов в ссылку родительского абстрактного класса

        Dog dog = new Dog("Plutto");
        dog.eat();
        dog.sayHello();

        SuperCow duperCow = new SuperCow("Moo!");

        animalTest(duperCow);
    }

    public static void animalTest(Animal animal) {
        animal.sayHello();
        animal.eat();
    }

}