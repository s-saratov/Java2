package homework_20.computers;

import homework_15.Computer;

public class Main {

    public static void main(String[] args) {

        // Создаём два экземпляра класса Laptop

        Laptop appleMacBook = new Laptop("Apple MacBook Pro 2023", "Apple M2 Max (12-core)",
                "38-core Integrated", 32, 1024, 2023, 3499,
                16.2, 2.1);
        Laptop lenovoThinkPad = new Laptop("Lenovo ThinkPad X1 Extreme Gen 6",
                "Intel Core i9-13900H (14-core)", "NVIDIA GeForce RTX 4080 (8GB GDDR6)",
                32, 1024, 2023, 3399, 16.0, 1.81);

        // Выводим текстовое представление ноутбуков

        appleMacBook.getInfo();
        System.out.println();
        lenovoThinkPad.getInfo();

        // Сравниваем соотношение "диагональ/вес" ноутбуков

        System.out.println();
        appleMacBook.compareScreenWeightRatio(lenovoThinkPad);
        System.out.println();

        // Создаём экземпляр класса Desktop

        Desktop appleMacPro = new Desktop("Apple Mac Pro 2023", "Apple M2 Ultra (24-core)",
                "76-core", 64, 1024, 2023, 6999, 300.0);

        // Выводим текстовое представление настольного компьютера

        appleMacPro.getInfo();
        System.out.println();

        // Сравниваем цены на ноутбук и настольный компьютер от Apple

        appleMacPro.comparePrice(appleMacBook);

    }

}