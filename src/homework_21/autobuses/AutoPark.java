package homework_21.autobuses;

public class AutoPark {

    public static void main(String[] args) {

        // Создаём водителя и автобус

        BusDriver busDriver = new BusDriver("John", "LN-19945395");
        Autobus bus = new Autobus(busDriver,15);

        // Выводим информацию об автобусе

        System.out.println(bus.toString() + "\n");

        // Создаём пятерых пассажиров

        Passenger passenger1 = new Passenger("Jack");
        Passenger passenger2 = new Passenger("Margo");
        Passenger passenger3 = new Passenger("Scott");
        Passenger passenger4 = new Passenger("Julia");
        Passenger passenger5 = new Passenger("Willy");

        // Сажаем пассажиров автобус

        bus.takePassenger(passenger1);
        bus.takePassenger(passenger2);
        bus.takePassenger(passenger3);
        bus.takePassenger(passenger4);
        bus.takePassenger(passenger5);

        // Выводим список пассажиров

        System.out.println();
        bus.showListOfPassengers();

        // Высаживаем из автобуса пассажира Scott и выводим обновлённый список пассажиров

        System.out.println();
        bus.dropPassenger(passenger3);
        bus.showListOfPassengers();

    }

}