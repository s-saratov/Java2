package homework_24.triathlon;

/*
Task 1

Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class Triathlete implements Swimmer, Runner, Cyclist {

    @Override
    public void swim() {
        System.out.println("Triathlete is swimming");
    }

    @Override
    public void run() {
        System.out.println("Triathlete is running");
    }

    @Override
    public void cycle() {
        System.out.println("Triathlete is cycling");
    }
}