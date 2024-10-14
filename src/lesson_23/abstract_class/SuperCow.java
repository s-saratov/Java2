package lesson_23.abstract_class;

public class SuperCow extends Cow{

    public SuperCow(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("SuperCow moves");
    }

    @Override
    public void sayHello() {
        System.out.println("SuperCow says Hello");
    }
}