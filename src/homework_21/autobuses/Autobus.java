package homework_21.autobuses;

/*
Task 3
Переписать метод public String toString()в классе Autobus, используя StringBuilder для формирования строки.

Task 4
Написать метод высадки пассажира из автобуса boolean dropPassenger(Passenger passenger).
 */

public class Autobus {

    // Поля

    private static int counter = 1;         // счётчик
    private final int id;                   // идентификационный номер
    private BusDriver driver;               // водитель
    private Autopilot autopilot;            // автопилот
    private final int capacity;             // вместимость
    private int countPassenger;             // количество пассажиров
    private final Passenger[] passengers;   // список пассажиров

    // Конструктор

    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.capacity = capacity;
        this.driver = busDriver;
        this.autopilot = new Autopilot("AP-v001");
        // Реализуем двунаправленную связь
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capacity];
    }

    // Геттеры

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    // Методы

    // 1. Возвращает строковое представление экземпляра класса

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("Autobus: {id: ").append(id);
        sb.append(", capacity: ").append(capacity);
        sb.append("; driver: ").append(driver.toString());
        sb.append("; autopilot: ").append(autopilot.toString());
        sb.append("}");
        return sb.toString();
    }

    // 2. Осуществляет посадку переданного пассажира в автобус и выводит на экран результат

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;
        if (countPassenger < capacity) {
            if (isPassangerInBus(passenger)) {
                System.out.printf("Пассажир id %d уже в автобусе id %d.\n", passenger.getId(), this.id);
                return false;
            }
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.printf("Пассажир id %d завершил посадку в автобус id %d.\n", passenger.getId(), this.id);
            return true;
        }
        System.out.printf("В автобусе id %s свободных мест нет!\n", this.id);
        return false;
    }

    // 3. Осуществляет высадку переданного пассажира из автобуса и выводит на экран результат

    public boolean dropPassenger(Passenger passenger) {
        if (passenger == null) return false;
        if (countPassenger == 0) {
            System.out.printf("Автобус id %d пуст, высаживать некого!\n", this.id);
            return false;
        }
        if (!isPassangerInBus(passenger)) {
            System.out.printf("Автобус id %d пуст, высаживать некого!\n", this.id);
            return false;
        }
        removeFromListOfPassengers(passenger);
        System.out.printf("Пассажир id %d вышел из автобуса id %d.\n", passenger.getId(), this.id);
        return true;
    }

    // 4. Проверяет, находится ли переданный пассажир в автобусе

    private boolean isPassangerInBus(Passenger passenger) {
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()) return true;
        }
        return false;
    }

    // 5. Удаляет пассажира из списка

    private void removeFromListOfPassengers(Passenger passenger) {
        int index = 0;
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()) index = i;
        }
        for (int i = index; i < countPassenger; i++) {
            passengers[i] = passengers[i + 1];
        }
        countPassenger--;
    }

    // 6. Выводит на экран список пассажиров

    public void showListOfPassengers() {
        if (countPassenger == 0) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassenger; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassenger - 1) ? ", " : "]");
        }
        System.out.println(sb.toString());
    }

    // 7. Обновляет версию прошивки автопилота на переданную

    public void updateNewAutopilotVersion(String softwareVersion) {
        this.autopilot.setSoftwareVersion(softwareVersion);
    }

    // 8. Заменяет автопилот на новый, с переданной прошивкой

    public void installNewAutopilot(String softwareVersion) {
        // Следим за правильностью ссылок с обеих сторон двунаправленной связи
        this.autopilot.setAutobus(null);
        this.autopilot = new Autopilot(softwareVersion);
        this.autopilot.setAutobus(this);
    }

    // 9. Заменяет водителя автобуса на переданного

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

}