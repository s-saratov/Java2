package homework_21.components;

public class Component {

    // Поля

    private String brand;   // бренд
    private String model;   // модель

    // Конструктор

    protected Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Геттеры и сеттеры

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

}