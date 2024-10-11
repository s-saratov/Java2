package homework_22.vehicles;

public class Motorcycle extends Vehicle {

    // Конструктор

    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    // Метод, запускающий двигатель

    @Override
    public void StartEngine() {
        System.out.printf("Зажигание - старт! Двигатель автомобиля %s %s запущен.\n", getBrand(), getModel());
    }

}