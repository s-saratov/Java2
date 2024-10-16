package homework_24.triathlon;

public class TriathlonMain {

    public static void main(String[] args) {

        // Создаём экземпляр класса Triathlete

        Triathlete triathlete = new Triathlete();

        // Запускаем методы из разных интерфейсов

        triathlete.swim();
        triathlete.run();
        triathlete.cycle();

    }

}