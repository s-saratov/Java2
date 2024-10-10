package homework_21.components;

public class Main {

    public static void main(String[] args) {

        // Создаём жёсткий диск

        Storage hdd = new Storage("Seagate", "Barracuda", "HDD", 4000);

        // Создаём компьютер, куда устанавливаем созданный жёсткий диск

        Computer computer = new Computer("SuperPC", hdd);

        // Выводим строковое представление компьютера

        System.out.println(computer.toString());

        // Создаём твердотельный накопитель

        Storage ssd = new Storage("Samsung", "980 Pro", "NVMe SSD", 2000);

        // Заменяем HDD в компьютере на SSD

        computer.setStorage(ssd);

        // Ещё раз выводим строковое представление компьютера

        System.out.println("\n" + computer.toString());

    }

}