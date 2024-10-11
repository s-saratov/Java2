package lesson_22.animals;

public class CastingExample {

    public static void main(String[] args) {

        // Восходящее и нисходящее преобразование

        Animal animal1 = new Cat(); // тип Cat автоматически преобразуется к типу Animal

        /*
        Тип ссылки определяет:
        1. Ссылки на объекты каких типов здесь могут храниться;
        2. Какие методы мне доступны
         */

        animal1.voice();

        // Такое присвоение / кастинг недопустимо, т.к. Test не является потомком Animal;
        // Animal animal2 = new Test();

        Dog dog = new Dog();
        Animal animal2 = new Dog(); // Неявное автоматическое преобразование ссылки (тип Dog к типу Animal)
        Animal animal3 = new Hamster();

        System.out.println("\n====================");

        Animal[] animals = new Animal[3];
        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;

        for (int i = 0; i < animals.length; i++) animals[i].voice();

        int i1 = 100;
        double d1 = i1;

        System.out.println(d1);

        double y = 10.50;
        int x = (int) y;

        Cat catLink;
        Animal animalLink = new Cat();
        // animalLink.eat(); на ссылке типа Animal метод eat() из класса Cat не доступен к вызову

        catLink = (Cat) animalLink; // нисходящее ЯВНОЕ преобразование типа ссылки
        catLink.eat();

        System.out.println("\n========= Down-casting =========");

        for (int i = 0; i < animals.length; i++) {
            System.out.println("sout: " + animals[i]);

            System.out.println(animals[i].getClass() + " instanceof Cat: "  + (animals[i] instanceof Cat)); // проверяем, что ссылка может быть приведена к классу Cat

            Animal current = animals[i];

            if (animals[i] instanceof Cat) {
                System.out.println(i + "-й индекс может быть безопасно приведён к Cat");
                Cat tempCat = (Cat) current;
                tempCat.eat();
            }

            System.out.println("================\n");
        }

    }

}