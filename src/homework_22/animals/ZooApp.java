package homework_22.animals;

public class ZooApp {

    public static void main(String[] args) {

        // Класс, от которого наследуются все классы в Java.
        // Гарантирует наличие всех методов класса Object у объектов любого типа.



//        Object

        Cat cat = new Cat();

        cat.voice();
        System.out.println(cat.toString());
        cat.eat();

        System.out.println("\n===============");

        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("\n===============");

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        System.out.println("\n===============");
        Test test = new Test();
        System.out.println(test.toString());

        System.out.println(test);



    }

}