package lesson_22.animals;

public class Hamster extends Animal {

    // Переопределим родительский метод

    @Override
    public void voice() {
        System.out.println("Hamster says Hrum-Hrum");
    }
}