package homework_22.vehicles;

/*
Task 2

Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский класс),
Car, Bicycle и Motorcycle (дочерние классы).

Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.

Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine()
для запуска соответствующего типа двигателя (если есть).

Создайте массив транспортных средств разных типов.
Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.
 */

public class Vehicle {

    // Поля

    private String brand;   // марка
    private String model;   // модель

    // Конструктор

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Геттеры

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // Метод, запускающий двигатель

    public void StartEngine() {}

}