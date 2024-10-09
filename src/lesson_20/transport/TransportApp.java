package lesson_20.transport;

public class TransportApp {

    public static void main(String[] args) {

        Bus bus = new Bus("Bus-X1", 2020, 10);

        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println("bus.getModel(): " + bus.getModel());
        System.out.println("bus.getCapacity(): " + bus.getCapacity());

        System.out.println("\n=======================\n");

        Train train = new Train("Skoda", 2022, 40, 4);

        System.out.println(train.toString());
        train.start();
        System.out.println(train.getModel());

        System.out.println("Capacity: " + train.getCapacity());
        train.setCountWagons(3);
        System.out.println("Capacity: " + train.getCapacity());

        System.out.println("\n=======================\n");

        Bus bus1 = new Bus("Bus-X2", 2024, 3);
        System.out.println(bus1.takePassenger());
        System.out.println("=============");
        System.out.println(bus1.takePassenger());
        System.out.println("=============");
        System.out.println(bus1.takePassenger());
        System.out.println("=============");
        System.out.println(bus1.takePassenger());

        System.out.println("\n=======================\n");

        System.out.println("bus1.getCountPassengers(): " + bus1.getCountPassengers());

        System.out.println("=============");
        System.out.println(bus1.dropPassenger());
        System.out.println("=============");
        System.out.println(bus1.dropPassenger());
        System.out.println("=============");
        System.out.println(bus1.dropPassenger());
        System.out.println("=============");
        System.out.println(bus1.dropPassenger());
        System.out.println("=============");

        System.out.println("bus1.getCountPassengers(): " + bus1.getCountPassengers());
    }

}