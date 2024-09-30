package homework_15;

public class Computer {

    String name;       // Наименование
    String processor;   // Наименование процессора
    String gpu;         // Наименование видеокарты
    int ramSize;        // Объём ОЗУ
    int storageSize;    // Объём ПЗУ
    int releaseYear;    // Год выпуска
    int price;          // Цена

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

    public void getInfo() {
        System.out.println("Информация о компьютере " + name + " :");
        System.out.println("\t- процессор: " + processor);
        System.out.println("\t- объём ОЗУ (Гб): " + ramSize);
        System.out.println("\t- объём ПЗУ (Гб): " + storageSize);
        System.out.println("\t- видеокарта: " + gpu);
        System.out.println("\t- год выпуска: " + releaseYear);
        System.out.println("\t- цена (USD): " + price);
    }

    public void comparePrice (Computer computer1, Computer computer2) {
        if (computer1.price > computer2.price) System.out.printf("Компьютер %s дороже компьютера %s на %d долларов.\n",
                computer1.name, computer2.name, (computer1.price - computer2.price));
        else if (computer1.price == computer2.price) System.out.printf("Цена компьютеров %s и %s одинаковая.\n",
                computer1.name, computer2.name);
        else System.out.printf("Компьютер %s дороже компьютера %s на %d долларов.\n", computer2.name, computer1.name,
                    (computer2.price - computer1.price));
    }

}