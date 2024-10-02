package lesson_17;

public class CatApp {

    public static void main(String[] args) {
        Cat17 cat = new Cat17("Catty", 8, 5);

        cat.sayMeow();

        System.out.println(cat.toString());

//        cat.age = -1000;
//
//        cat.weight = 1500;
//
//        cat.name = null;

        String name = cat.getName();
        System.out.println("name = " + name);
        System.out.println("Вес: " + cat.getWeight());

        System.out.println("Возраст: " + cat.getAge());

        cat.setAge(18);
        System.out.println("Текущий возраст: " + cat.getAge());

        cat.setName("Max");

        System.out.println(cat.toString());

        System.out.println("==================\n");

    }

}
