package lesson_17;

public class Auto {

    void gas() {
        /*
        Происходят какие-то сложные действия,
        в результате которых автомобиль движется
        */

        /*
        Изменили функционал. Добавили логику работы двигателя.
         */

        System.out.println("Авто едет вперёд");
    }

    void breakMe() {
        /*
        Происходят какие-то сложные действия,
        в результате которых автомобиль замедляется
        */
        System.out.println("Авто замедляется");
    }

    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.gas();
        auto.breakMe();
    }

}