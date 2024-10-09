package homework_20.computers;

/*
Task 2

Придумать и написать как минимум одну иерархию классов в которой будет один родительский клас и два наследника,
расширяющих его функционал

У родительского класса должен быть метод создающий строку с информацией об объекте (метод String toString())
 */

public class Computer {

    // Поля

    private String name;        // Наименование
    private String processor;   // Наименование процессора
    private String gpu;         // Наименование видеокарты
    private int ramSize;        // Объём ОЗУ
    private int storageSize;    // Объём ПЗУ
    private int releaseYear;    // Год выпуска
    private int price;          // Цена

    // Конструктор

    public Computer(String name, String processor, String gpu,
                    int ramSize, int storageSize, int releaseYear, int price) {
        this.name = name;
        this.processor = processor;
        this.gpu = gpu;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    // Геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Методы

    // 1. Вывод текстового представления экземпляра класса

    public void getInfo() {
        System.out.println("Информация о компьютере " + name + " :");
        System.out.println("\t- процессор: " + processor);
        System.out.println("\t- объём ОЗУ (Гб): " + ramSize);
        System.out.println("\t- объём ПЗУ (Гб): " + storageSize);
        System.out.println("\t- видеокарта: " + gpu);
        System.out.println("\t- год выпуска: " + releaseYear);
        System.out.println("\t- цена (USD): " + price);
    }

    // 2. Сравнение компьютера с другим по цене

    public void comparePrice (Computer computer) {
        if (this.price > computer.price) System.out.printf("Компьютер %s дороже компьютера %s на %d долларов.\n",
                this.name, computer.name, (this.price - computer.price));
        else if (this.price == computer.price) System.out.printf("Цена компьютеров %s и %s одинаковая.\n",
                this.name, computer.name);
        else System.out.printf("Компьютер %s дороже компьютера %s на %d долларов.\n", computer.name, this.name,
                    (computer.price - this.price));
    }

}