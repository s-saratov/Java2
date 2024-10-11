package homework_22.vehicles;

public class Car extends Vehicle {

    // Конструктор

    public Car(String brand, String model) {
        super(brand, model);
    }

    // Метод, запускающий двигатель

    @Override
    public void StartEngine() {
        System.out.printf("Зажигание - старт! Двигатель мотоцикла %s %s запущен.\n", getBrand(), getModel());
    }

}