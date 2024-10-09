package homework_20.computers;

public class Laptop extends Computer {

    // Поля класса

    public double screenSize;   // диагональ экрана
    public double weight;       // вес

    // Конструктор

    public Laptop(String name, String processor, String gpu, int ramSize, int storageSize, int releaseYear, int price,
                  double screenSize, double weight) {
        super(name, processor, gpu, ramSize, storageSize, releaseYear, price);
        this.screenSize = screenSize;
        this.weight = weight;
    }

    // Геттеры и сеттеры

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Методы

    // 1. Вывод текстового представления экземпляра класса (переопределённый)

    public void getInfo() {
        super.getInfo();
        System.out.println("\t- диагональ экрана (дюймы): " + screenSize);
        System.out.println("\t- вес (кг): " + weight);
    }

    // 2. Сравнение соотношения "диагональ/вес" двух ноутбуков

    public void compareScreenWeightRatio (Laptop laptop) {
        double ratio1 = this.screenSize / this.weight;
        double ratio2 = laptop.screenSize / laptop.weight;
        if (ratio1 > ratio2) System.out.printf("Соотношение \"диагональ/вес\" ноутбука %s лучше, чем у ноутбука %s.\n",
                this.getName(), laptop.getName());
        else if (ratio1 == ratio2) System.out.printf("Соотношение \"диагональ/вес\" ноутбуков %s и %s одинаковое.\n",
                this.getName(), laptop.getName());
        else System.out.printf("Соотношение \"диагональ/вес\" ноутбука %s лучше, чем у ноутбука %s.\n",
                    laptop.getName(), this.getName());
    }

}