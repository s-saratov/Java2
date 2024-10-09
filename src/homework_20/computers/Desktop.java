package homework_20.computers;

public class Desktop extends Computer{

    // Поле класса (энергопотребление)

    private double powerConsumption;

    // Конструктор

    public Desktop(String name, String processor, String gpu, int ramSize, int storageSize, int releaseYear, int price, double powerConsumption) {
        super(name, processor, gpu, ramSize, storageSize, releaseYear, price);
        this.powerConsumption = powerConsumption;
    }

    // Геттер и сеттер

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    // Метод, выводящий текстовое представления экземпляра класса (переопределённый)

    public void getInfo() {
        super.getInfo();
        System.out.println("\t- энергопотребление (ватты): " + powerConsumption);
    }

}