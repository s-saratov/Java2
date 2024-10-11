package homework_22.vehicles;

public class Bicycle extends Vehicle {

    // Конструктор

    public Bicycle(String brand, String model) {
        super(brand, model);
    }

    // Метод, запускающий двигатель

    @Override
    public void StartEngine() {
        System.out.printf("Увы, велосипед %s %s не имеет двигателя, запускать нечего.\n", getBrand(), getModel());
    }

}