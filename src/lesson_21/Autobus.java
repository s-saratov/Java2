package lesson_21;

import java.util.Arrays;

public class Autobus {

    /*
    Для создания связи типа HAS-A мы определяем поле класса,
    которое будет хранить ссылку на объект другого класса.

    Ассоциация, в т.ч. и агрегация, и композиция, реализуется через создание ссылок
    на другие объекты внутри класса.
    Отношения, где один класс использует другой в качестве одного из своих полей.

    Агрегация Autobus и BusDriver. Автобус содержит водителя,
    но водитель может существовать независимо от автобуса (пересесть в другой автобус, остаться дома и т.п.)

    Композиция между Autobus и Autopilot. Автопилот являться неотъемлемой частью автобуса
    и не может существовать без автобуса.

    Важные аспекты ассоциации.

    Направленность связи: однонаправленная или двунаправленная.

    Кардинальность связи. Определяет, сколько объектов одного класса может быть ассоциировано с объектом другого класса

    One-to-One (один к одному), One-to-Many (один ко многим), Many-to-Many (многие ко многим).

    1 : 1 -> Автобус и двигатель
    Каждый автобус может иметь ровно один двигатель, и на каждый двигатель приходится ровно один автобус.

    1 : Many -> Автобус и список пассажиров.
    Один автобус может перевозить множество пассажиров.

    Many : Many -> Список автобусов и список остановок.
    Каждый автобус останавливается на множестве остановок, и каждая остановка может обслуживать множество автобусов.

     */

    private static int counter = 1;

    private final int id;

    private BusDriver driver;       // агрегация (мягкая связь)
    private Autopilot autopilot;    // композиция (жёсткая / неразрывная связь)

    private final int capacity;
    private int countPassenger;

    private final Passenger[] passengers;

    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.capacity = capacity;
        this.driver = busDriver;
        this.autopilot = new Autopilot("AP-v001");
        // Реализуем двунаправленную связь
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capacity];
    }

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

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

        /*
        1. Надо проверить:
            1.1. Есть ли в автобусе свободное место;
            1.2. Находится ли уже данный пассажир в автобусе.

        2. Если есть место и пассажир ещё не в автобусе - садим на борт:

            2.1. Добавляем пассажира в список;
            2.2. Увеличиваем количество пассажиров в автобусе;
            2.3. Возвращаем true.

        3. Если что-то пошло не так, выдаём сообщением об ошибке и возвращаем false.
         */

        if (countPassenger < capacity) {
            // Место есть
            // Надо проверить, есть ли такой пассажир в автобусе
            if (isPassangerInBus(passenger)) {
                System.out.printf("Пассажир id %d уже в автобусе id %d.\n", passenger.getId(), this.id);
                return false;
            }

            // Садим пассажира на борт
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.printf("Пассажир id %d завершил посадку в автобус id %d.\n", passenger.getId(), this.id);
            return true;
        }

        // Свободного места нет
        System.out.printf("В автобусе id %s свободных мест нет!\n", this.id);
        return false;

    }

    private boolean isPassangerInBus(Passenger passenger) {
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()) return true;
        }
        // пассажиров с таким id нет в массиве пассажиров
        return false;
    }

    public void updateNewAutopilotVersion(String softwareVersion) {
        this.autopilot.setSoftwareVersion(softwareVersion);
    }

    public void installNewAutopilot(String softwareVersion) {
        // Следим за правильностью ссылок с обеих сторон двунаправленной связи
        this.autopilot.setAutobus(null);
        this.autopilot = new Autopilot(softwareVersion);
        this.autopilot.setAutobus(this);
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

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

    public String toString() {
        return "Autobus: {id: " + id + ", capacity: " + capacity +
                "; driver: " + driver.toString() +
                "; autopilot: " + autopilot.toString() +
                "}";
    }
}