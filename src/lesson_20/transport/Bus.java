package lesson_20.transport;

//     Smartphone is-a   Vehicle -> НЕВЕРНО. Применять наследование НЕЛЬЗЯ
//           Bus  is-a   Vehicle -> Верно. Можно применить наследование
public class Bus extends Vehicle {

    private int capacity;
    public int countPassengers;

    public Bus(String model, int year, int capacity) {

        // Нужно сначала создать объект родительского класса
        super(model, year); // вызываем конструктор родительского класса
        this.capacity = capacity;
    }

    public boolean takePassenger() {
        // Проверить, есть ли свободное место
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашёл в автобус " + this.getModel());
            return true;
        }

        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров.\n",
                this.getModel(), countPassengers);
        return false;
    }

    public boolean dropPassenger() {
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса " + this.getModel());
            return true;
        }

        System.out.printf("Автобус %s пуст. Высаживать некого.\n", this.getModel());
        return false;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}