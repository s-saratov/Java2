package homework_21.components;

import homework_21.autobuses.BusDriver;

public class Computer {

    // Поля

    private String name;            // имя
    private Processor processor;    // ЦПУ
    private Memory memory;          // ОЗУ
    private Storage storage;        // ПЗУ

    // Конструктор

    public Computer(String name, Storage storage) {
        this.name = name;
        this.processor = new Processor("Intel", "Core i9-13900K",
                24, 5400, "Z790");
        this.processor.setComputer(this);
        this.memory = new Memory("Corsair", "Vengeance RGB Pro",
                "DDR5", 32, 6000);
        this.memory.setComputer(this);
        this.storage = storage;
    }

    // Методы

    // 1. Возвращает строковое представление экземпляра класса

    public String toString() {
        return "Компьютер: {Имя: " + name + "; ЦПУ: " + processor.toString() +
                "; ОЗУ: " + memory.toString() +
                "; ПЗУ: " + storage.toString() +
                "}";
    }

    // 2. Заменяет имеющийся накопитель на переданный

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}