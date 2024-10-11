package homework_22.vehicles;

public class VehiclesMain {

    public static void main(String[] args) {

        // Создаём экземпляры автомобиля, мотоцикла и велосипеда

        Car car = new Car("Tesla", "Cybertruck");
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-09");
        Bicycle bicycle = new Bicycle("Yamaha MT-09", "Spectral CF 8");

        // Создаём массив экземпляров класса Vehicle, который заполняем преобразованными транспортными средствами

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = motorcycle;
        vehicles[2] = bicycle;

        // Запускаем двигатели транспортных средств
        for (int i = 0; i < vehicles.length; i++) vehicles[i].StartEngine();

    }

}